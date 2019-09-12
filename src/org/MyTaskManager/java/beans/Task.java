public class Tasks{

    private long id;
    private String taskName;
    private String taskDescription;
    private String taskStrat;
    private String taskRedLine;
    private String taskDeadLine;

    private long ProjectList_id;
    private long ProjectList_Users_id;
    private long Project_Users_Roles_id;
    private long Users_id;
    private long Users_Roles_id;

    public Tasks() {
    }

    public Tasks(long id, String taskName, String taskDescription, String taskStrat, String taskRedLine, String taskDeadLine, long projectList_id, long projectList_Users_id, long project_Users_Roles_id, long users_id, long users_Roles_id) {
        this.id = id;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskStrat = taskStrat;
        this.taskRedLine = taskRedLine;
        this.taskDeadLine = taskDeadLine;
        ProjectList_id = projectList_id;
        ProjectList_Users_id = projectList_Users_id;
        Project_Users_Roles_id = project_Users_Roles_id;
        Users_id = users_id;
        Users_Roles_id = users_Roles_id;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public String getTaskStrat() {
        return taskStrat;
    }

    public void setTaskStrat(String taskStrat) {
        this.taskStrat = taskStrat;
    }

    public String getTaskRedLine() {
        return taskRedLine;
    }

    public void setTaskRedLine(String taskRedLine) {
        this.taskRedLine = taskRedLine;
    }

    public String getTaskDeadLine() {
        return taskDeadLine;
    }

    public void setTaskDeadLine(String taskDeadLine) {
        this.taskDeadLine = taskDeadLine;
    }

    public long getProjectList_id() {
        return ProjectList_id;
    }

    public void setProjectList_id(long projectList_id) {
        ProjectList_id = projectList_id;
    }

    public long getProjectList_Users_id() {
        return ProjectList_Users_id;
    }

    public void setProjectList_Users_id(long projectList_Users_id) {
        ProjectList_Users_id = projectList_Users_id;
    }

    public long getProject_Users_Roles_id() {
        return Project_Users_Roles_id;
    }

    public void setProject_Users_Roles_id(long project_Users_Roles_id) {
        Project_Users_Roles_id = project_Users_Roles_id;
    }

    public long getUsers_id() {
        return Users_id;
    }

    public void setUsers_id(long users_id) {
        Users_id = users_id;
    }

    public long getUsers_Roles_id() {
        return Users_Roles_id;
    }

    public void setUsers_Roles_id(long users_Roles_id) {
        Users_Roles_id = users_Roles_id;
    }

    @Override
    public java.lang.String toString() {
        return "Tasks{" +
                "id=" + id +
                ", taskName='" + taskName + '\'' +
                ", taskDescription='" + taskDescription + '\'' +
                ", taskStrat='" + taskStrat + '\'' +
                ", taskRedLine='" + taskRedLine + '\'' +
                ", taskDeadLine='" + taskDeadLine + '\'' +
                ", ProjectList_id=" + ProjectList_id +
                ", ProjectList_Users_id=" + ProjectList_Users_id +
                ", Project_Users_Roles_id=" + Project_Users_Roles_id +
                ", Users_id=" + Users_id +
                ", Users_Roles_id=" + Users_Roles_id +
                '}';
    }
}