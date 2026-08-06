import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDAO {


    // Scenario 7: Add User
    public String addUser_1(UserBean bean) {

        String result = "Fail";

        try {

            Connection con = DBConnection.getConnection();

            String query =
            "insert into UserTable values(?,?,?,?,?,?)";


            PreparedStatement ps =
            con.prepareStatement(query);


            ps.setInt(1, bean.getId());
            ps.setString(2, bean.getPassword());
            ps.setString(3, bean.getName());
            ps.setInt(4, bean.getIncorrectAttempts());
            ps.setString(5, bean.getLockStatus());
            ps.setString(6, bean.getUserType());


            int count = ps.executeUpdate();


            if(count > 0)
                result = "Success";


            con.close();

        }
        catch(Exception e) {

            e.printStackTrace();

        }

        return result;
    }



    // Scenario 4: getLockStatus()
    public int getLockStatus() {

        int count = 0;

        try {

            Connection con = DBConnection.getConnection();

            String query =
            "select count(*) from UserTable where LockStatus=0";


            PreparedStatement ps =
            con.prepareStatement(query);


            ResultSet rs = ps.executeQuery();


            if(rs.next()) {
                count = rs.getInt(1);
            }


            con.close();

        }
        catch(Exception e) {

            e.printStackTrace();

        }

        return count;
    }



    // Scenario 5: changeName()
    public String changeName(String id, String name) {

        String msg = "Failed";

        try {

            Connection con = DBConnection.getConnection();


            String query =
            "update UserTable set name=? where id=?";


            PreparedStatement ps =
            con.prepareStatement(query);


            ps.setString(1,name);
            ps.setString(2,id);


            int rows = ps.executeUpdate();


            if(rows > 0)
                msg = "Success";


            con.close();

        }
        catch(Exception e) {

            e.printStackTrace();

        }

        return msg;
    }

}