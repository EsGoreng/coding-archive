class NotesApi {
  static BASE_URL = "https://notes-api.dicoding.dev/v2";

  static async getNotes() {
    const response = await fetch(`${this.BASE_URL}/notes`);
    const responseJson = await response.json();

    if (responseJson.status !== "success") {
      throw new Error(responseJson.message);
    }

    return responseJson.data;
  }

  static async addNote(note) {
    const response = await fetch(`${this.BASE_URL}/notes`, {
      method: "POST",
      headers: {
        "Content-Type": "application/json",
      },
      body: JSON.stringify(note),
    });

    const responseJson = await response.json();

    if (responseJson.status !== "success") {
      throw new Error(responseJson.message);
    }

    return responseJson.data;
  }

  static async deleteNote(note) {
    const response = await fetch(`${this.BASE_URL}/notes/${note}`, {
      method: "DELETE",
    });

    const responseJson = await response.json();

    if (responseJson.status !== "success") {
      throw new Error(responseJson.message);
    }

    return responseJson.message;
  }

  static async archiveNote(note) {
    const response = await fetch(`${this.BASE_URL}/notes/${note}/archive`, {
      method: "POST",
    });

    const responseJson = await response.json();

    if (responseJson.status !== "success") {
      throw new Error(responseJson.message);
    }
  }
}

export default NotesApi;
