import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EstablishConnection {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1522/FREEPDB1";
        String user = "system";
        String password = "Welcome123";

        Connection connection = null;

        try {
            
            Class.forName("oracle.jdbc.OracleDriver");

            
            connection = DriverManager.getConnection(url, user, password);

            System.out.println("Connection Established Successfully.");

        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found.");
            System.out.println(e.getMessage());

        } catch (SQLException e) {
            System.out.println("Connection could not be established.");
            System.out.println(e.getMessage());

        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                    System.out.println("Connection Closed Successfully.");
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}