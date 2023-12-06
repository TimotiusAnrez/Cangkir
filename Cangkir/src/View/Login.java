package View;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Login {
    
    Scene scene;
    public Scene view() {

        BorderPane mainLayout = new BorderPane();
        Bar mainMenu = new Bar();

        mainLayout.setTop(mainMenu.viewUser());


        VBox parent = new VBox();

        Text text = new Text();
        Label emailLabel = new Label("Login");
        Label passwordLabel = new Label("Password");
        TextField email = new TextField();
        PasswordField password = new PasswordField();
        Button button = new Button("Login");

        parent.getChildren().addAll(text, emailLabel, email, passwordLabel, password, button);
        
        mainLayout.setCenter(parent);
    
        scene = new Scene(mainLayout, 880, 720);

        return scene;
        






    }
}
