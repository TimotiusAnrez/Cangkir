package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Domain.User;
import Util.DB;

public class UserModel {
    private DB db = DB.getDbInstance();
    private Connection connection;
    private Statement st;
    private PreparedStatement ps;
    private ResultSet rs;
    private ArrayList<User> userList;
    private User currentUser;

    private void setConnection() throws Exception {
        try {
            connection = db.getConnection();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // get user by id will take in User object with only username and password field
    // filled and return back a user object
    public User getUserByID(User userInput) throws Exception {

        User userCheck = userInput;// copy userInput

        setConnection();

        String sql = String.format("SELECT * FROM user WHERE Username = %s", userCheck.getUsername());
        st = connection.createStatement();
        st.executeQuery(sql);
        rs = st.getResultSet();

        while (rs.next()) {
            User userResult;
            userResult = new User(
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6)
                    );
            userCheck = userResult;
        }

        return userCheck;
    }

}
