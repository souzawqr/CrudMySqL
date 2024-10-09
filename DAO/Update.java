package DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static ConnectionJDBC.ConnectionMySqL.createConnection;

public class Update {


    public static void main(String[] args) throws SQLException {

        String query = "UPDATE employee SET name = ? , id = ?";
        Connection conn = createConnection();
        PreparedStatement stmt = conn.prepareStatement(query);

        try (conn){
            stmt.setString(1, "Angel");
            stmt.setInt(2, 122);
            stmt.executeUpdate();
            System.out.println("Successfully!");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}
