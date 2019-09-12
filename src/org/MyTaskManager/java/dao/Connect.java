
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLExeption;
import java.sql.Statement;
import java.util.List;

class Connect{
    static {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFound e){
            e.printStackTrace();
        }
    }
    private static volatile Connect connection;

    Connect() throws SQLExeption{}
    static Connection getConnection() throws SQLExeption{
        if (connection == null || connection.isClosed()){
            connection = DriverManager.getConnection
        }
    }




}

