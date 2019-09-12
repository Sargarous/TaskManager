public class User{

    private long id;
    private String userName;
    private String userPassword;
    private String userEmail;

    private long Roles_id;

    public User() {
    }

    public User(long id, String userName, String userPassword, String userEmail, long roles_id) {
        this.id = id;
        this.userName = userName;
        this.userPassword = userPassword;
        this.userEmail = userEmail;
        Roles_id = roles_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public long getRoles_id() {
        return Roles_id;
    }

    public void setRoles_id(long roles_id) {
        Roles_id = roles_id;
    }

    @Override
    public java.lang.String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", Roles_id=" + Roles_id +
                '}';
    }
}