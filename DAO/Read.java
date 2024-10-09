package DAO;

import java.sql.*;

import static ConnectionJDBC.ConnectionMySqL.createConnection;

public class Read {

    public static void main(String[] args) throws SQLException {

        Connection conn = createConnection();
            String sql = "SELECT * FROM employee ";

                try (conn) {
                    PreparedStatement stmt = conn.prepareStatement(sql);
                        ResultSet rs = stmt.executeQuery();

                    while (rs.next()) {
                        System.out.println("ID: " + rs.getInt("id"));
                        System.out.println("Name: " + rs.getString("name"));

                    }
        } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
    }
}