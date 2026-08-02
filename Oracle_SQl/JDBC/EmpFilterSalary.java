import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmpFilterSalary {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1522/FREEPDB1";
        String user = "system";
        String password = "Welcome123";

        // SQL query to filter employees with salary between 1000 and 2000
        String query = "SELECT ename, job, sal, comm FROM emp WHERE sal > 1000 AND sal < 2000";

        try {
            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.OracleDriver");

            // Establish Connection
            Connection conn = DriverManager.getConnection(url, user, password);

            // Create Statement
            Statement stmt = conn.createStatement();

            // Execute Query
            ResultSet rs = stmt.executeQuery(query);

            System.out.println("ENAME\tJOB\t\tSAL\tCOMM");
            System.out.println("------------------------------------------------");

            while (rs.next()) {

                String ename = rs.getString("ename");
                String job = rs.getString("job");
                double sal = rs.getDouble("sal");
                double comm = rs.getDouble("comm");

                String commission = rs.wasNull() ? "NULL" : String.valueOf(comm);

                System.out.println(
                        ename + "\t" +
                        job + "\t\t" +
                        sal + "\t" +
                        commission);
            }

            rs.close();
            stmt.close();
            conn.close();

            System.out.println("\nConnection Closed Successfully.");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}