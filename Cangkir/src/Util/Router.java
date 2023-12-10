package Util;
import View.Login;
import View.Register;
import javafx.stage.Stage;

public class Router {
    private static Router routerInstance;
    private Login loginPage = new Login();
    private Register registerPage = new Register();
    private Stage primaryStage;

    private Router(Stage primaryStage){
        this.primaryStage = primaryStage;
    }

    public static Router getRouter(Stage primaryStage){
        if(routerInstance == null){
            routerInstance = new Router(primaryStage);
        }
        return routerInstance;
    }

    private Stage getPrimaryStage() {
        return primaryStage;
    }

    private Login getLogin(){
        return loginPage;
    }

    private Register getRegister(){
        return registerPage;
    }

    public void initiate(){
        getPrimaryStage().setScene(loginPage.view());
        getPrimaryStage().show();
    }

    public void displayLogin(){
        getPrimaryStage().setScene(getLogin().view());
    }

    public void displayRegister(){
        getPrimaryStage().setScene(getRegister().view());
    }

}
