import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        Connection con = null;

        try {

            Class.forName("oracle.jdbc.OracleDriver");

            con = DriverManager.getConnection(
                "jdbc:oracle:thin:@localhost:1522/FREEPDB1",
                "SYSTEM",
                "Oracle123"
            );

            System.out.println("Database Connected");

        } catch(Exception e) {

            e.printStackTrace();

        }

        return con;
    }
}