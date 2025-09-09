
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

public class App extends Application {

    private ObservableList<VinylRecord> vinylData = FXCollections.observableArrayList();

    public static void main(String[] args) {
        launch(args);
    }

    public ObservableList<VinylRecord> getVinylData() {
        return vinylData;
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(App.class.getResource("FXML/Login.fxml"));

        AnchorPane root = loader.load();

        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.getIcons().add(new Image(App.class.getResourceAsStream("Images/icon.png")));
        primaryStage.setTitle("Login");
        primaryStage.show();
    }

    

}