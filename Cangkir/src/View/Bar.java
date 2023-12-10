package View;

import Util.Router;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class Bar {

    Router router = Router.getRouter(new Stage());


    public MenuBar initalMenu(){
        MenuBar menuBar = new MenuBar();
        Menu page = new Menu("Page");
        MenuItem login = new MenuItem("Login");
        MenuItem register = new MenuItem("Register");

        page.getItems().addAll(login, register);
        menuBar.getMenus().addAll(page);

        login.setOnAction(e -> {
            router.displayLogin();
        });

        register.setOnAction(e -> {
            router.displayRegister();
        });

        return menuBar;
    }


    public MenuBar viewUser() {

        MenuBar mainMenu = new MenuBar();
        Menu menu = new Menu("Menu");
        MenuItem home = new MenuItem("Home");
        MenuItem cart = new MenuItem("Cart");
        MenuItem logOut = new MenuItem("Log Out");

        mainMenu.getMenus().add(menu);
        menu.getItems().addAll(home, cart, logOut);

        return mainMenu;

    }

    public MenuBar viewAdmin() {


        MenuBar mainMenu = new MenuBar();
        Menu menu = new Menu("Menu");
        MenuItem cm = new MenuItem("Cup Management");
        MenuItem lo = new MenuItem("Log Out");

        mainMenu.getMenus().add(menu);
        menu.getItems().addAll(cm, lo);

        return mainMenu;


    }
}
