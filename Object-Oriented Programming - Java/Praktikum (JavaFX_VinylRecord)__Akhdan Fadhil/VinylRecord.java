
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class VinylRecord {
    
    private final StringProperty album;
    private final StringProperty artist;
    private final IntegerProperty avaible;
    private final IntegerProperty total;

    public VinylRecord(String album, String artist, int avaible, int total) {
        this.album = new SimpleStringProperty(album);
        this.artist = new SimpleStringProperty(artist);
        this.avaible = new SimpleIntegerProperty(avaible);
        this.total = new SimpleIntegerProperty(total);
    }

    public String getAlbum() {
        return album.get();
    }

    public void setAlbum(String album) {
        this.album.set(album);
    }

    public StringProperty albumProperty() {
        return album;
    }

    public String getArtist() {
        return artist.get();
    }

    public void setArtist(String artist) {
        this.artist.set(artist);
    }

    public StringProperty artistProperty() {
        return artist;
    }

    public int getAvailable() {
        return avaible.get();
    }

    public void setAvaible(int avaible) {
        this.avaible.set(avaible);
    }

    public IntegerProperty avaibleProperty() {
        return avaible;
    }

    public int getTotal() {
        return total.get();
    }

    public void setTotal(int total) {
        this.total.set(total);
    }

    public IntegerProperty totalProperty() {
        return total;
    }

}
