class NoteAdd extends HTMLElement {
  constructor() {
    super();

    this.render();
  }

  connectedCallback() {
    this.querySelector('form').addEventListener('submit', this._handleSubmit.bind(this));
  }

  _handleSubmit(event) {
    event.preventDefault();

    const titleInput = this.querySelector('#title');
    const bodyInput = this.querySelector('#note');

    const newNote = {
      id: `notes-${Date.now()}`,
      title: titleInput.value,
      body: bodyInput.value,
      createdAt: new Date().toISOString(),
      archived: false,
    };

    this.dispatchEvent(new CustomEvent('note-added', {
      detail: newNote,
      bubbles: true,
    }));

    titleInput.value = '';
    bodyInput.value = '';
  }

  render() {
    this.innerHTML = `
        <section>
            <form>
                <h2>Add Note</h2>
                <div class="form-group">
                    <label for="title">Title</label>
                    <input type="text" id="title" name="title" aria-describedby="noteValidation" required/>
                    <p id="noteValidation" class="validation-message" aria-live="polite"></p>
                </div>
                <div class="form-group">                        
                    <label for="note">Note</label>
                    <textarea name="note" id="note" aria-describedby="noteBodyValidation" required></textarea>
                    <p id="noteBodyValidation" class="validation-message" aria-live="polite"></p>
                </div>
                <div class="form-group">
                    <button type="submit" class="btn">Add Note</button>
                </div>
            </form>
        </section>
    `;
  }
}

customElements.define("note-add", NoteAdd);
