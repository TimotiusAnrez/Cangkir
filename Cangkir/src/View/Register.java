package View;

import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class Register {



    Scene scene;

    public Scene view(){

        scene = new Scene(new Group(), 720, 480);

        BorderPane mainLayout = new BorderPane();

        Bar menuBar = new Bar();
        mainLayout.setTop(menuBar.viewAdmin());
      
        HBox parent2 = new HBox();
        VBox kakek = new VBox();


        Text text = new Text();
        Label UsnLabel = new Label("Username");
        TextField usn = new TextField();
        Label emailLabel = new Label("Email");
        Label passwordLabel = new Label("Password");
        TextField email = new TextField();
        PasswordField password = new PasswordField();
        Button button = new Button("Register");
        
        Label genderLabel = new Label("Gender");

        
        RadioButton male = new RadioButton("Male");
        RadioButton female = new RadioButton("Female");
        ToggleGroup Gender = new ToggleGroup();
        male.setToggleGroup(Gender);
        female.setToggleGroup(Gender);
        
        
        parent2.getChildren().addAll(male, female);
        
        kakek.getChildren().addAll(text,UsnLabel,usn,  emailLabel, email, passwordLabel, password, genderLabel, parent2, button);

        mainLayout.setCenter(kakek);

        scene = new Scene(mainLayout, 1080, 720);

        



        return scene;




    }
    
}
