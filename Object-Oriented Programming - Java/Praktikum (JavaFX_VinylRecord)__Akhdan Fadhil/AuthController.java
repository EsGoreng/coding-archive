
import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AuthController {

    @FXML
    private TextField user;
    
    @FXML
    private PasswordField pass;

    @FXML
    public void login(ActionEvent e) throws IOException{
        String username = user.getText();
        String password = pass.getText();

        FXMLLoader loader = new FXMLLoader();
        Stage stage = (Stage)((Node)e.getSource()).getScene().getWindow();

        if (username.equals("admin") && password.equals("admin")) {
            
            loader.setLocation(App.class.getResource("FXML/Inventory.fxml"));
            
            AnchorPane Inventory = loader.load();
            CollectionController controller = loader.getController(); // Get the controller instance

            App app = new App(); // Create a new instance of App to access vinyl data
            controller.setApp(app); // Pass the App instance to the controller

            Scene scene = new Scene(Inventory);
            
            stage.setScene(scene);
            stage.setTitle("Inventory");
            stage.show();
        
        } else {
            System.out.println("Invalid credentials");
        }
    }

}