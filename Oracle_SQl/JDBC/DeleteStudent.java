import java.sql.*;

public class DeleteStudent {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Provide Roll Number");
            return;
        }

        int rollNo = Integer.parseInt(args[0]);

        String url = "jdbc:oracle:thin:@localhost:1522/FREEPDB1";
        String user = "system";
        String password = "Welcome123";

        String selectQuery =
                "SELECT NAME, STANDARD FROM STUDENT WHERE ROLLNO=?";

        String deleteQuery =
                "DELETE FROM STUDENT WHERE ROLLNO=?";


        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection con =
                    DriverManager.getConnection(url, user, password);

            con.setAutoCommit(false);


            PreparedStatement select =
                    con.prepareStatement(selectQuery);

            select.setInt(1, rollNo);

            ResultSet rs = select.executeQuery();


            if(rs.next()) {

                String name = rs.getString("NAME");
                String standard = rs.getString("STANDARD");


                PreparedStatement delete =
                        con.prepareStatement(deleteQuery);

                delete.setInt(1, rollNo);

                delete.executeUpdate();


                con.commit();

                System.out.println(
                    "Deleted Student: " + name +
                    " Standard: " + standard
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