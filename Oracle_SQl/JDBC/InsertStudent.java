import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Date;

public class InsertStudent {

    private static final String DB_URL =
            "jdbc:oracle:thin:@localhost:1522/FREEPDB1";

    private static final String USER = "system";
    private static final String PASS = "Welcome123";

    public static void main(String[] args) {

        String sql = "INSERT INTO STUDENT (ROLLNO, NAME, STANDARD, DOB, FEES) VALUES (?, ?, ?, ?, ?)";

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con = DriverManager.getConnection(DB_URL, USER, PASS);

            PreparedStatement ps = con.prepareStatement(sql);

            insertStudent(ps, 1001, "JOHN", "X", "2010-05-15", 45000.50);
            insertStudent(ps, 1002, "ALICE", "V", "2012-09-20", 42000);

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    static void insertStudent(PreparedStatement ps,
                              int rollno,
                              String name,
                              String standard,
                              String dob,
                              double fees) {

        try {

            ps.setInt(1, rollno);
            ps.setString(2, name);
            ps.setString(3, standard);
            ps.setDate(4, Date.valueOf(dob));
            ps.setDouble(5, fees);

            int result = ps.executeUpdate();

            if(result > 0) {
                System.out.println("Inserted Roll No: " + rollno);
            }

        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}