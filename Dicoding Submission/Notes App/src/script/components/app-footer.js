class AppFooter extends HTMLElement {
  constructor() {
    super();

    this.render();
  }

  render() {
    this.innerHTML = `
        <footer>
            <p>Akhdan Fadhil Note's App &copy; 2025</p  >
        </footer>
        `;
  }
}

customElements.define("app-footer", AppFooter);
