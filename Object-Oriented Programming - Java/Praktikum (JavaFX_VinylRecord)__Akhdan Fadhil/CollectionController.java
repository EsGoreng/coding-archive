
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CollectionController {

    @FXML
    private TableView<VinylRecord> tableView;

    @FXML
    private TableColumn<VinylRecord, String> albumColumn;

    @FXML
    private TableColumn<VinylRecord, String> artistColumn;

    @FXML
    private TableColumn<VinylRecord, Integer> availableColumn;

    @FXML
    private TableColumn<VinylRecord, Integer> totalColumn;

    @FXML
    private TextField albumField;

    @FXML
    private TextField artistField;

    @FXML
    private TextField totalField;

    @FXML
    private TextField rentedField;

    @FXML
    private App app;

    public CollectionController() { // Constructor
        // This constructor can be used for any initialization if needed
    }

    public void initialize() {
        albumColumn.setCellValueFactory(cellData -> cellData.getValue().albumProperty());
        artistColumn.setCellValueFactory(cellData -> cellData.getValue().artistProperty());
        availableColumn.setCellValueFactory(cellData -> cellData.getValue().avaibleProperty().asObject());
        totalColumn.setCellValueFactory(cellData -> cellData.getValue().totalProperty().asObject());
    }

    public void setApp(App app) { 
        this.app = app;
        if (this.app != null) {
            tableView.setItems(this.app.getVinylData());            
        } else {
            System.err.println("Error : instance is null in CollectionController.");
        }
    }

    @FXML
    private void deleteRecord() {
        VinylRecord selectedRecord = tableView.getSelectionModel().getSelectedItem();
        if (selectedRecord != null) {
            app.getVinylData().remove(selectedRecord);
            showAlert(AlertType.INFORMATION, "Record deleted successfully.");
        } else {
            showAlert(AlertType.WARNING, "No record selected for deletion.");
        }
    }

    @FXML
    private void rentRecord() {
        VinylRecord selectedRecord = tableView.getSelectionModel().getSelectedItem();
        if (selectedRecord == null) {
            showAlert(AlertType.WARNING, "No record selected for renting.");
            return;
        }

        if (selectedRecord.getAvailable() <= 0) {
            showAlert(AlertType.WARNING, "No available records to rent.");
            return;
        }

        selectedRecord.setAvaible(selectedRecord.getAvailable() - 1);
        showAlert(AlertType.INFORMATION, "Record rented successfully.");
    }

    @FXML
    private void addRecord() {
        if (this.app == null || this.app.getVinylData() == null) {
            showAlert(AlertType.ERROR, "Application data is not initialized.");
            return;
        }

        String album = albumField.getText();
        String artist = artistField.getText();
        String total = totalField.getText();
        String rented = rentedField.getText();

        if (album.isEmpty() || artist.isEmpty() || total.isEmpty() || rented.isEmpty()) {
            showAlert(AlertType.WARNING, "input fields cannot be empty");
            return;
        }   

        try {
            int totalStr = Integer.parseInt(total);
            int rentedStr = Integer.parseInt(rented);
            if (rentedStr > totalStr || totalStr < 0 || rentedStr < 0) {
                showAlert(AlertType.WARNING, "Rented records cannot be more than total records and both must be non-negative.");
                return;
            }

            VinylRecord newRecord = new VinylRecord(album, artist, totalStr - rentedStr, totalStr);

            this.app.getVinylData().add(newRecord);

            clearInputFields();
            showAlert(AlertType.INFORMATION, "Record added successfully.");

        } catch (NumberFormatException e) {
            showAlert(AlertType.ERROR, "Available and total fields must be numbers.");
        }
    }

    @FXML
    public void updateRecord() {
        VinylRecord selectedRecord = tableView.getSelectionModel().getSelectedItem();
        if (selectedRecord == null) {
            showAlert(AlertType.WARNING, "No record selected for update.");
            return;
        }

        String album = albumField.getText();
        String artist = artistField.getText();
        String total = totalField.getText();
        String rented = rentedField.getText();

        if (album.isEmpty() || artist.isEmpty() || total.isEmpty() || rented.isEmpty()) {
            showAlert(AlertType.WARNING, "Input fields cannot be empty");
            return;
        }

        try {
            int totalStr = Integer.parseInt(total);
            int rentedStr = Integer.parseInt(rented);
            if (rentedStr > totalStr || totalStr < 0 || rentedStr < 0) {
                showAlert(AlertType.WARNING, "Rented records cannot be more than total records and both must be non-negative.");
                return;
            }

            selectedRecord.setAlbum(album);
            selectedRecord.setArtist(artist);
            selectedRecord.setAvaible(totalStr - rentedStr);
            selectedRecord.setTotal(totalStr);

            clearInputFields();
            showAlert(AlertType.INFORMATION, "Record updated successfully.");

        } catch (NumberFormatException e) {
            showAlert(AlertType.ERROR, "Available and total fields must be numbers.");
        }
    }

    private void clearInputFields() {
        albumField.clear();
        artistField.clear();
        totalField.clear();
        rentedField.clear();
    }

    private void showAlert(AlertType type, String message) {
        Alert alert = new Alert(type);
        alert.setContentText(message);
        alert.showAndWait();
    }

}