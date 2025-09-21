import Notes from "./script/data/local/notes.js";
import { customValidationNoteHandler } from "./script/form-validation.js";
import "./script/components/note-add.js";
import "./script/components/app-header.js";
import "./script/components/app-footer.js";

const renderNotes = () => {
  const notesContainer = document.getElementById("noteList");
  notesContainer.innerHTML = "";

  const allNotes = Notes.getAll();

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
        }
      );

      noteElement.innerHTML = `
                <h3 class="note-title">${note.title}</h3>
                <p class="note-body">${note.body}</p>
                <small class="note-date">${formattedDate}</small>
            `;

      notesContainer.appendChild(noteElement);
    }
  });
};

document.addEventListener("note-added", (event) => {
  const newNote = event.detail;
  Notes.addNote(newNote);
  renderNotes();
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
