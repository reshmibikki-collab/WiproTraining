import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCCalls4 {

    public static void main(String[] args) {

        String url = "jdbc:oracle:thin:@localhost:1522/FREEPDB1";
        String user = "system";
        String password = "Welcome123";

        String query = "SELECT rollno, name, standard, dob, fees FROM student";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(url, user, password);

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(query);

            System.out.println("ROLLNO\tNAME\tSTANDARD\tDOB\t\tFEES");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("rollno") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getString("standard") + "\t\t" +
                    rs.getDate("dob") + "\t" +
                    rs.getDouble("fees")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}