public class Role{

    private long id;
    private String roleName;

    public Roles() {
    }

    public Roles(long id, String roleName) {
        this.id = id;
        this.roleName = roleName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Roles{" +
                "id=" + id +
                ", roleName='" + roleName + '\'' +
                '}';
    }
}