import View.Login;
import View.Register;
import javafx.application.Application;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class App extends Application{
    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Login loginScene = new Login();
        stage.setScene(loginScene.view());
        


        Register RegisterScene = new Register();
        stage.setScene(RegisterScene.view());

        stage.show();
    }
}
