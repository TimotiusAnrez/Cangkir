import Util.Router;
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

        Router router = Router.getRouter(stage);

        router.initiate();
    }
}
