package Domain;
import java.util.Objects;

public class User {
    private String UserID;
    private String Username;
    private String UserEmail;
    private String UserPassword;
    private String UserGender;
    private String UserRole;

    public User() {
    }

    public User(String UserID, String Username, String UserEmail, String UserPassword, String UserGender, String UserRole) {
        this.UserID = UserID;
        this.Username = Username;
        this.UserEmail = UserEmail;
        this.UserPassword = UserPassword;
        this.UserGender = UserGender;
        this.UserRole = UserRole;
    }

    public String getUserID() {
        return this.UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getUsername() {
        return this.Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getUserEmail() {
        return this.UserEmail;
    }

    public void setUserEmail(String UserEmail) {
        this.UserEmail = UserEmail;
    }

    public String getUserPassword() {
        return this.UserPassword;
    }

    public void setUserPassword(String UserPassword) {
        this.UserPassword = UserPassword;
    }

    public String getUserGender() {
        return this.UserGender;
    }

    public void setUserGender(String UserGender) {
        this.UserGender = UserGender;
    }

    public String getUserRole() {
        return this.UserRole;
    }

    public void setUserRole(String UserRole) {
        this.UserRole = UserRole;
    }

    public User UserID(String UserID) {
        setUserID(UserID);
        return this;
    }

    public User Username(String Username) {
        setUsername(Username);
        return this;
    }

    public User UserEmail(String UserEmail) {
        setUserEmail(UserEmail);
        return this;
    }

    public User UserPassword(String UserPassword) {
        setUserPassword(UserPassword);
        return this;
    }

    public User UserGender(String UserGender) {
        setUserGender(UserGender);
        return this;
    }

    public User UserRole(String UserRole) {
        setUserRole(UserRole);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(UserID, user.UserID) && Objects.equals(Username, user.Username) && Objects.equals(UserEmail, user.UserEmail) && Objects.equals(UserPassword, user.UserPassword) && Objects.equals(UserGender, user.UserGender) && Objects.equals(UserRole, user.UserRole);
    }

    @Override
    public int hashCode() {
        return Objects.hash(UserID, Username, UserEmail, UserPassword, UserGender, UserRole);
    }

    @Override
    public String toString() {
        return "{" +
            " UserID='" + getUserID() + "'" +
            ", Username='" + getUsername() + "'" +
            ", UserEmail='" + getUserEmail() + "'" +
            ", UserPassword='" + getUserPassword() + "'" +
            ", UserGender='" + getUserGender() + "'" +
            ", UserRole='" + getUserRole() + "'" +
            "}";
    }
    
}
