package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static ConnectionJDBC.ConnectionMySqL.createConnection;

public class Delete {

    public static void main(String[] args) throws SQLException {
        Connection conn = createConnection();
        String query = "DELETE FROM employee WHERE id = ?";

        try(conn){
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setInt(1,122);
            stmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }



    }
}
