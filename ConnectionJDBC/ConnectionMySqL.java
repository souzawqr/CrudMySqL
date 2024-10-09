package ConnectionJDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionMySqL {

        
    public static Connection createConnection( ) throws SQLException {

        String url = "jdbc:mysql://localhost:3306/persons";
        String name = "root";
        String password = "3157";

        Connection conn = null;
        conn =  DriverManager.getConnection(url, name, password);

        return conn;

    }

    public static void main(String[] args) {

        try {
             createConnection();

            System.out.println("Connection was successfully!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }



}