package Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
    private static DB dbInstance;
    private final String dbURL = "jbdc:mysql//localhost:3306/cangkir";
    private final String username = "root";
    private final String password = "password";
    private static Connection connection;

    private DB(){
        
    }
    
    private void dbStart() throws Exception{
        try {
            Class.forName("com.mysql.cj.jbdc.Driver");
            connection = DriverManager.getConnection(dbURL, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static DB getDbInstance() {
        return dbInstance;
    }

    public static void setDbInstance(DB dbInstance) {
        DB.dbInstance = dbInstance;
    }

    public static DB getInstance(){
        if(dbInstance == null){
            setDbInstance(new DB());
        }
        return dbInstance;
    }

    public Connection getConnection() throws Exception{

        try {
            dbStart();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        return connection;
    }
}
