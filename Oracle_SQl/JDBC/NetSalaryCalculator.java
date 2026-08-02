import java.sql.*;

public class NetSalaryCalculator {

    private static final String URL =
            "jdbc:oracle:thin:@localhost:1522/FREEPDB1";

    private static final String USER = "system";
    private static final String PASSWORD = "Welcome123";


    public static void main(String[] args) {

        String selectQuery = "SELECT empno, ename FROM emp";
        String procedureCall = "{call calculate_net_salary(?, ?)}";


        try {

            Class.forName("oracle.jdbc.driver.OracleDriver");


            Connection con =
                    DriverManager.getConnection(URL, USER, PASSWORD);


            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(selectQuery);


            CallableStatement cstmt =
                    con.prepareCall(procedureCall);


            System.out.println("--------------------------------");
            System.out.println("EMPNO\tENAME\tNET SALARY");
            System.out.println("--------------------------------");


            while(rs.next()) {

                int empno = rs.getInt("empno");
                String ename = rs.getString("ename");


                cstmt.setInt(1, empno);

                cstmt.registerOutParameter(2, Types.NUMERIC);


                cstmt.execute();


                double netSalary = cstmt.getDouble(2);


                System.out.println(
                    empno + "\t" +
                    ename + "\t" +
                    netSalary
                );
            }


            con.close();


        } catch(Exception e) {

            e.printStackTrace();

        }
    }
}