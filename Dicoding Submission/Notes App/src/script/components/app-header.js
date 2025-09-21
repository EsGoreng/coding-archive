class AppHeader extends HTMLElement {
  constructor() {
    super();

  }

  static get observedAttribute() {
    return ['app-title'];
  }

  connectedCallback() {
    this.render();
  }

  attributeChangedCallback(name, oldValue, newValue) {
    if(name == 'app-title') {
      this.render();
    }
  }

  render() {
    const title = this.getAttribute('app-title') || "Note's App";

    this.innerHTML = `
        <header class="app-bar">
            <h1 class="app-name">${title}</h1>
        </header>
    `;
  }
}
customElements.define("app-header", AppHeader);
