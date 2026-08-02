import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmpDisplayFirstTwo {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1522/FREEPDB1";
        String user = "system";
        String password = "Welcome123";

        String query = "SELECT empno, ename FROM emp";

        try {
            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.OracleDriver");

            // Establish Connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // Create Statement
            Statement stmt = conn.createStatement();

            // Execute Query
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("EMPNO\tENAME");
            System.out.println("--------------------");

            // Display Records
            while (rs.next()) {
                int empNo = rs.getInt(1);
                String eName = rs.getString("ename");

                System.out.println(empNo + "\t" + eName);
            }

            rs.close();
            stmt.close();
            conn.close();

            System.out.println("Connection Closed Successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}