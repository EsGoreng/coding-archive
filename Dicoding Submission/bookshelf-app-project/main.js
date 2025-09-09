document.addEventListener("DOMContentLoaded", function () {
  const books = [];
  const RENDER_EVENT = "render-book";
  const SAVED_EVENT = "saved-book";
  const STORAGE_KEY = "BOOKSHELF_APPS";

  const bookForm = document.getElementById("bookForm");
  const bookFormSubmit = document.getElementById("bookFormSubmit");
  const isCompleteCheckbox = document.getElementById("bookFormIsComplete");

  const incompleteBookList = document.getElementById("incompleteBookList");
  const completeBookList = document.getElementById("completeBookList");

  const searchForm = document.getElementById("searchBook");
  const searchInput = document.getElementById("searchBookTitle");

  /**
   * Cek apakah browser mendukung localStorage.
   * @returns {boolean} - True jika didukung, false jika tidak.
   */
  function isStorageExist() {
    if (typeof Storage === "undefined") {
      alert(
        "Browser Anda tidak mendukung local storage. Fitur penyimpanan tidak akan berfungsi."
      );
      return false;
    }
    return true;
  }

  /**
   * Menyimpan data buku ke localStorage.
   */
  function saveData() {
    if (isStorageExist()) {
      const parsed = JSON.stringify(books);
      localStorage.setItem(STORAGE_KEY, parsed);
      document.dispatchEvent(new Event(SAVED_EVENT));
    }
  }

  /**
   * Memuat data buku dari localStorage.
   */
  function loadDataFromStorage() {
    const serializedData = localStorage.getItem(STORAGE_KEY);
    let data = JSON.parse(serializedData);

    if (data !== null) {
      for (const book of data) {
        books.push(book);
      }
    }

    document.dispatchEvent(new Event(RENDER_EVENT));
  }

  /**
   * Menghasilkan ID unik berdasarkan timestamp.
   * @returns {number} - ID unik.
   */
  function generateId() {
    return +new Date();
  }

  /**
   * Membuat objek buku baru.
   * @param {number} id - ID buku.
   * @param {string} title - Judul buku.
   * @param {string} author - Penulis buku.
   * @param {number} year - Tahun terbit buku.
   * @param {boolean} isComplete - Status buku (selesai/belum dibaca).
   * @returns {object} - Objek buku.
   */
  function generateBookObject(id, title, author, year, isComplete) {
    return { id, title, author, year, isComplete };
  }

  /**
   * Menambah atau memperbarui buku.
   */
  function addOrUpdateBook() {
    const bookId = document.getElementById("bookId").value;
    const bookTitle = document.getElementById("bookFormTitle").value;
    const bookAuthor = document.getElementById("bookFormAuthor").value;
    const bookYear = parseInt(document.getElementById("bookFormYear").value);
    const isComplete = document.getElementById("bookFormIsComplete").checked;

    if (bookId) {
      // Mode Edit: Perbarui buku yang ada
      const bookTarget = findBook(parseInt(bookId));
      if (bookTarget) {
        bookTarget.title = bookTitle;
        bookTarget.author = bookAuthor;
        bookTarget.year = bookYear;
        bookTarget.isComplete = isComplete;
      }
    } else {
      // Mode Tambah: Buat buku baru
      const generatedID = generateId();
      const bookObject = generateBookObject(
        generatedID,
        bookTitle,
        bookAuthor,
        bookYear,
        isComplete
      );
      books.push(bookObject);
    }

    document.dispatchEvent(new Event(RENDER_EVENT));
    saveData();
    resetForm();
  }

  /**
   * Mengatur form untuk mode edit.
   * @param {number} bookId - ID buku yang akan diedit.
   */
  function editBook(bookId) {
    const bookToEdit = findBook(bookId);
    if (bookToEdit) {
      document.getElementById("bookId").value = bookToEdit.id;
      document.getElementById("bookFormTitle").value = bookToEdit.title;
      document.getElementById("bookFormAuthor").value = bookToEdit.author;
      document.getElementById("bookFormYear").value = bookToEdit.year;
      document.getElementById("bookFormIsComplete").checked =
        bookToEdit.isComplete;

      // Mengubah teks tombol submit
      bookFormSubmit.innerHTML = "Simpan Perubahan";
      bookFormSubmit.scrollIntoView({ behavior: "smooth" });
    }
  }

  /**
   * Mengembalikan form ke keadaan semula.
   */
  function resetForm() {
    bookForm.reset();
    document.getElementById("bookId").value = "";
    bookFormSubmit.innerHTML =
      "Masukkan Buku ke rak <span>Belum selesai dibaca</span>";
  }

  /**
   * Mencari buku berdasarkan ID.
   * @param {number} bookId - ID buku yang dicari.
   * @returns {object|null} - Objek buku jika ditemukan, null jika tidak.
   */
  function findBook(bookId) {
    return books.find((book) => book.id === bookId) || null;
  }

  /**
   * Mencari index buku berdasarkan ID.
   * @param {number} bookId - ID buku yang dicari.
   * @returns {number} - Index buku jika ditemukan, -1 jika tidak.
   */
  function findBookIndex(bookId) {
    return books.findIndex((book) => book.id === bookId);
  }

  function addBookToCompleted(bookId) {
    const bookTarget = findBook(bookId);
    if (bookTarget) {
      bookTarget.isComplete = true;
      document.dispatchEvent(new Event(RENDER_EVENT));
      saveData();
    }
  }

  function undoBookFromCompleted(bookId) {
    const bookTarget = findBook(bookId);
    if (bookTarget) {
      bookTarget.isComplete = false;
      document.dispatchEvent(new Event(RENDER_EVENT));
      saveData();
    }
  }

  function removeBook(bookId) {
    const bookTargetIndex = findBookIndex(bookId);
    if (bookTargetIndex !== -1) {
      books.splice(bookTargetIndex, 1);
      document.dispatchEvent(new Event(RENDER_EVENT));
      saveData();
    }
  }

  /**
   * Membuat elemen HTML untuk setiap buku.
   * @param {object} bookObject - Objek buku.
   * @returns {HTMLElement} - Elemen div buku.
   */
  function makeBook(bookObject) {
    const bookItem = document.createElement("div");
    bookItem.setAttribute("data-bookid", bookObject.id);
    bookItem.setAttribute("data-testid", "bookItem");

    const bookTitle = document.createElement("h3");
    bookTitle.setAttribute("data-testid", "bookItemTitle");
    bookTitle.innerText = bookObject.title;

    const bookAuthor = document.createElement("p");
    bookAuthor.setAttribute("data-testid", "bookItemAuthor");
    bookAuthor.innerText = `Penulis: ${bookObject.author}`;

    const bookYear = document.createElement("p");
    bookYear.setAttribute("data-testid", "bookItemYear");
    bookYear.innerText = `Tahun: ${bookObject.year}`;

    const buttonContainer = document.createElement("div");

    const isCompleteButton = document.createElement("button");
    isCompleteButton.setAttribute("data-testid", "bookItemIsCompleteButton");
    isCompleteButton.innerText = bookObject.isComplete
      ? "Belum selesai dibaca"
      : "Selesai dibaca";
    isCompleteButton.addEventListener("click", function () {
      bookObject.isComplete
        ? undoBookFromCompleted(bookObject.id)
        : addBookToCompleted(bookObject.id);
    });

    const deleteButton = document.createElement("button");
    deleteButton.setAttribute("data-testid", "bookItemDeleteButton");
    deleteButton.innerText = "Hapus Buku";
    deleteButton.addEventListener("click", function () {
      if (
        confirm(`Apakah Anda yakin ingin menghapus buku "${bookObject.title}"?`)
      ) {
        removeBook(bookObject.id);
      }
    });

    const editButton = document.createElement("button");
    editButton.setAttribute("data-testid", "bookItemEditButton");
    editButton.innerText = "Edit Buku";
    editButton.addEventListener("click", function () {
      editBook(bookObject.id);
    });

    buttonContainer.append(isCompleteButton, deleteButton, editButton);
    bookItem.append(bookTitle, bookAuthor, bookYear, buttonContainer);

    return bookItem;
  }

  // Event listener untuk form submit (menambah atau mengedit)
  bookForm.addEventListener("submit", function (event) {
    event.preventDefault();
    addOrUpdateBook();
  });

  // Event listener untuk pencarian secara real-time
  searchForm.addEventListener("submit", function (event) {
    event.preventDefault(); // Mencegah submit form
    document.dispatchEvent(new Event(RENDER_EVENT));
  });

  searchInput.addEventListener("keyup", function () {
    document.dispatchEvent(new Event(RENDER_EVENT));
  });

  // Event listener untuk checkbox, mengubah teks tombol submit
  isCompleteCheckbox.addEventListener("change", function () {
    const submitSpan = bookFormSubmit.querySelector("span");
    if (bookFormSubmit.innerText !== "Simpan Perubahan") {
      submitSpan.innerText = isCompleteCheckbox.checked
        ? "Selesai dibaca"
        : "Belum selesai dibaca";
    }
  });

  // Custom event listener untuk me-render ulang tampilan buku
  document.addEventListener(RENDER_EVENT, function () {
    incompleteBookList.innerHTML = "";
    completeBookList.innerHTML = "";

    const query = searchInput.value.toLowerCase();
    const filteredBooks = books.filter((book) =>
      book.title.toLowerCase().includes(query)
    );

    for (const bookItem of filteredBooks) {
      const bookElement = makeBook(bookItem);
      if (!bookItem.isComplete) {
        incompleteBookList.append(bookElement);
      } else {
        completeBookList.append(bookElement);
      }
    }
  });

  if (isStorageExist()) {
    loadDataFromStorage();
  }
});
