import java.sql.*;

public class UpdateStudentFee {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Provide Roll Number and New Fee");
            return;
        }

        int rollNo = Integer.parseInt(args[0]);
        double newFee = Double.parseDouble(args[1]);

        String url = "jdbc:oracle:thin:@localhost:1522/FREEPDB1";
        String user = "system";
        String password = "Welcome123";

        String updateQuery =
                "UPDATE STUDENT SET FEES = ? WHERE ROLLNO = ?";


        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con =
                    DriverManager.getConnection(url, user, password);


            PreparedStatement ps =
                    con.prepareStatement(updateQuery);


            ps.setDouble(1, newFee);
            ps.setInt(2, rollNo);


            int rows = ps.executeUpdate();


            if(rows > 0) {
                System.out.println(
                    "Fee updated successfully for Roll No: " + rollNo
                );
            }
            else {
                System.out.println("Roll number not found");
            }


            con.close();


        } catch(Exception e) {

            e.printStackTrace();

        }
    }
}