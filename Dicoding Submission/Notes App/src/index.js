import NotesApi from "./script/data/network/notes-api.js";
import { customValidationNoteHandler } from "./script/form-validation.js";
import "./script/components/note-add.js";
import "./script/components/app-header.js";
import "./script/components/app-footer.js";

import "./styles/style.css";

const renderNotes = async () => {
  const notesContainer = document.getElementById("noteList");
  notesContainer.innerHTML = "";

  try {
    notesContainer.innerHTML = "<p>Loading notes...</p>";

    const allNotes = await NotesApi.getNotes();

    notesContainer.innerHTML = "";

    if (allNotes.length === 0) {
      notesContainer.innerHTML = "<p>Tidak ada catatan untuk ditampilkan.</p>";
      return;
    }

    allNotes.forEach((note) => {
      if (!note.archived) {
        const noteElement = document.createElement("div");
        noteElement.classList.add("note-card");

        const formattedDate = new Date(note.createdAt).toLocaleDateString(
          "en-US",
          {
            weekday: "long",
            year: "numeric",
            month: "long",
            day: "numeric",
          },
        );

        noteElement.innerHTML = `  
          <section class="data">
            <h3 class="note-title">${note.title}</h3>
            <p class="note-body">${note.body}</p>
            <small class="note-date">${formattedDate}</small>
          </section>
          <section class="icon-action" data-id="${note.id}">
            <img class="icon-delete" height="20px" src="https://img.icons8.com/?size=100&id=67884&format=png&color=000000">
            <img class="icon-archive" height="20px" src="https://img.icons8.com/?size=100&id=110673&format=png&color=000000">
          </section>
        `;

        const itemId = noteElement.querySelector(".icon-action");

        const deleteButton = noteElement.querySelector(".icon-delete");
        deleteButton.addEventListener("click", () => {
          const noteid = itemId.dataset.id;

          document.dispatchEvent(
            new CustomEvent("icon-delete", {
              detail: { id: noteid },
              bubbles: true,
            }),
          );
        });

        const archiveButton = noteElement.querySelector(".icon-archive");
        archiveButton.addEventListener("click", () => {
          const noteid = itemId.dataset.id;

          document.dispatchEvent(
            new CustomEvent("icon-archive", {
              detail: { id: noteid },
              bubbles: true,
            }),
          );
        });

        notesContainer.appendChild(noteElement);
      }
    });
  } catch (error) {
    console.error("Gagal memuat catatan:", error.message);
    notesContainer.innerHTML = `<p>Gagal memuat catatan. Coba lagi nanti. Pesan: ${error.message}</p>`;
  }
};

document.addEventListener("note-added", async (event) => {
  const newNote = event.detail;
  try {
    await NotesApi.addNote(newNote);
    renderNotes();
  } catch (error) {
    console.error("Gagal menambahkan catatan:", error.message);
    alert(`Gagal menambahkan catatan: ${error.message}`);
  }
});

document.addEventListener("icon-delete", async (event) => {
  const noteId = event.detail.id;
  const isConfirmed = confirm("Apakah anda yakin ingin menghapus Note ini?");

  if (isConfirmed) {
    try {
      await NotesApi.deleteNote(noteId);
      renderNotes();
    } catch (error) {
      console.error("Gagal menghapus catatan:", error.message);
      alert(`Gagal menghapus catatan: ${error.message}`);
    }
  }
});

document.addEventListener("icon-archive", async (event) => {
  const noteId = event.detail.id;
  const isConfirmed = confirm("Apakah anda yakin ingin mengarsip Note ini?");

  if (isConfirmed) {
    try {
      await NotesApi.archiveNote(noteId);
      renderNotes();
    } catch (error) {
      console.error("Gagal mengarsip catatan:", error.message);
      alert(`Gagal mengarsip catatan: ${error.message}`);
    }
  }
});

document.addEventListener("DOMContentLoaded", () => {
  renderNotes();
});

const form = document.querySelector("form");
const title = form.elements["title"];
const noteBody = form.elements["note"];

form.addEventListener("submit", (event) => {
  event.preventDefault();
});

title.addEventListener("change", customValidationNoteHandler);
title.addEventListener("invalid", customValidationNoteHandler);
noteBody.addEventListener("change", customValidationNoteHandler);
noteBody.addEventListener("invalid", customValidationNoteHandler);

title.addEventListener("blur", (event) => {
  const isValid = event.target.validity.valid;
  const errorMessage = event.target.validationMessage;
  const connectedValidationId = event.target.getAttribute("aria-describedby");
  const connectedValidationEl = connectedValidationId
    ? document.getElementById(connectedValidationId)
    : null;
  if (connectedValidationEl && errorMessage && !isValid) {
    connectedValidationEl.innerText = errorMessage;
  } else {
    connectedValidationEl.innerText = "";
  }
});

noteBody.addEventListener("blur", (event) => {
  const isValid = event.target.validity.valid;
  const errorMessage = event.target.validationMessage;
  const connectedValidationId = event.target.getAttribute("aria-describedby");
  const connectedValidationEl = connectedValidationId
    ? document.getElementById(connectedValidationId)
    : null;
  if (connectedValidationEl && errorMessage && !isValid) {
    connectedValidationEl.innerText = errorMessage;
  } else {
    connectedValidationEl.innerText = "";
  }
});
