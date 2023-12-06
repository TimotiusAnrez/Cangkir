package View;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class Bar {

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
