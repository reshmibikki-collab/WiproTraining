import java.sql.*;

public class DisplayStudentDetails {

    public static void main(String[] args) {

        Integer rollNo = null;

        if(args.length > 0) {
            rollNo = Integer.parseInt(args[0]);
        }


        String url = "jdbc:oracle:thin:@localhost:1522/FREEPDB1";
        String user = "system";
        String password = "Welcome123";


        String query;

        if(rollNo == null) {
            query = "SELECT rollno, name, fees FROM student";
        } else {
            query = "SELECT rollno, name, fees FROM student WHERE rollno=?";
        }


        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con =
                DriverManager.getConnection(url,user,password);


            PreparedStatement ps =
                con.prepareStatement(query);


            if(rollNo != null) {
                ps.setInt(1, rollNo);
            }


            ResultSet rs = ps.executeQuery();


            System.out.println("ROLLNO\tNAME\tFEES");
            System.out.println("-------------------------");


            boolean found=false;

            while(rs.next()) {

                found=true;

                System.out.println(
                    rs.getInt("rollno") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getDouble("fees")
                );
            }


            if(!found) {
                System.out.println("No records found");
            }


            con.close();


        } catch(Exception e) {

            e.printStackTrace();

        }
    }
}