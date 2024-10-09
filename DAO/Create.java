package DAO;
import static ConnectionJDBC.ConnectionMySqL.createConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Create {

    public static void main(String[] args) throws SQLException {


        Connection conn = createConnection();

        try(conn) {
            Statement stmt;
                String SQL = "CREATE TABLE  employee (" +   "name VARCHAR(100)," +
                             "id INT AUTO_INCREMENT PRIMARY KEY )";

            stmt = conn.createStatement();
                stmt.executeUpdate(SQL);
                    System.out.println("Table created successfully!");



            PreparedStatement st;
                String query = "INSERT INTO employee (name, id) VALUES (?, ?)";

                    st = conn.prepareStatement(query);
                        st.setString(1, "Juan");  // Set name
                            st.setInt(2, 110); // Set email
                                st.executeUpdate(); // Execute the insertion
                                    System.out.println("User inserted successfully.");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        }




}
