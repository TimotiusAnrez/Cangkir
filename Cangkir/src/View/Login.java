package View;

import Util.Router;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Login {


    
    Scene scene;

    Hyperlink getHyperlink(){
        Hyperlink toRegister = new Hyperlink("Don't have an account yet? Register here!");
        toRegister.setOnAction(e -> {
            Router router = Router.getRouter(new Stage());

            router.displayRegister();
        });

        return toRegister;
    }


    public Scene view() {

        BorderPane mainLayout = new BorderPane();
        Hyperlink link = getHyperlink();

        mainLayout.setBottom(link);
        link.setAlignment(Pos.CENTER);
        mainLayout.getBottom().minHeight(280);
        mainLayout.setAlignment(link, Pos.CENTER);

        VBox parent = new VBox();
        parent.setPadding(new Insets(20,20,20,20));

        Text text = new Text();
        Label emailLabel = new Label("Login");
        Label passwordLabel = new Label("Password");
        TextField email = new TextField();
        PasswordField password = new PasswordField();
        Button button = new Button("Login");

        parent.getChildren().addAll(text, emailLabel, email, passwordLabel, password, button);
        
        mainLayout.setCenter(parent);
    
        scene = new Scene(mainLayout, 1080, 720);

        return scene;
        






    }
}
