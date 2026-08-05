package dao;

import bean.UserBean;
import util.DBUtil;

import java.sql.*;
import java.util.ArrayList;

public class UserDAO {

    public String getUserType(String userId) throws Exception {

        Connection con = DBUtil.getConnection();

        PreparedStatement ps =
                con.prepareStatement(
                        "select usertype from users where userid=?");

        ps.setString(1, userId);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            return rs.getString(1);
        }

        return null;
    }

    public String getIncorrectAttempts(String userId)
            throws Exception {

        Connection con = DBUtil.getConnection();

        PreparedStatement ps =
                con.prepareStatement(
                        "select incorrectattempts from users where userid=?");

        ps.setString(1, userId);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {

            int count = rs.getInt(1);

            if (count == 0)
                return "No Incorrect Attempt";

            else if (count == 1)
                return "One Time";

            else
                return "Incorrect Attempt Exceeded";
        }

        return null;
    }

    public String changeUserType(String userId)
            throws Exception {

        Connection con = DBUtil.getConnection();

        PreparedStatement ps =
                con.prepareStatement(
                        "update users set usertype='Admin' where userid=?");

        ps.setString(1, userId);

        int rows = ps.executeUpdate();

        if (rows == 1)
            return "Update Success";

        return "Update Failed";
    }

    public int getLockStatus() throws Exception {

        Connection con = DBUtil.getConnection();

        PreparedStatement ps =
                con.prepareStatement(
                        "select count(*) from users where lockstatus=0");

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            return rs.getInt(1);
        }

        return 0;
    }

    public String changeName(String id, String name)
            throws Exception {

        Connection con = DBUtil.getConnection();

        PreparedStatement ps =
                con.prepareStatement(
                        "update users set name=? where userid=?");

        ps.setString(1, name);
        ps.setString(2, id);

        int rows = ps.executeUpdate();

        if (rows > 0)
            return "Success";

        return "Failed";
    }

    public String changePassword(String password)
            throws Exception {

        Connection con = DBUtil.getConnection();

        PreparedStatement ps =
                con.prepareStatement(
                        "update users set password=? where usertype='Admin'");

        ps.setString(1, password);

        int rows = ps.executeUpdate();

        if (rows > 0)
            return "Changed";

        return "Failure";
    }

    public String addUser_1(UserBean bean)
            throws Exception {

        Connection con = DBUtil.getConnection();

        PreparedStatement ps =
                con.prepareStatement(
                        "insert into users values(?,?,?,?,?,?)");

        ps.setString(1, bean.getId());
        ps.setString(2, bean.getPassword());
        ps.setString(3, bean.getName());
        ps.setInt(4, bean.getIncorrectAttempts());
        ps.setInt(5, bean.getLockStatus());
        ps.setString(6, bean.getUserType());

        int rows = ps.executeUpdate();

        if (rows > 0)
            return "Success";

        return "Fail";
    }

    public ArrayList<UserBean> getUsers(String userType)
            throws Exception {

        Connection con = DBUtil.getConnection();

        PreparedStatement ps =
                con.prepareStatement(
                        "select * from users where usertype=?");

        ps.setString(1, userType);

        ResultSet rs = ps.executeQuery();

        ArrayList<UserBean> list = new ArrayList<>();

        while (rs.next()) {

            UserBean bean = new UserBean();

            bean.setId(rs.getString(1));
            bean.setPassword(rs.getString(2));
            bean.setName(rs.getString(3));
            bean.setIncorrectAttempts(rs.getInt(4));
            bean.setLockStatus(rs.getInt(5));
            bean.setUserType(rs.getString(6));

            list.add(bean);
        }

        return list;
    }

    public ArrayList<UserBean> storeAllRecords()
            throws Exception {

        Connection con = DBUtil.getConnection();

        Statement st = con.createStatement();

        ResultSet rs =
                st.executeQuery("select * from users");

        ArrayList<UserBean> list = new ArrayList<>();

        while (rs.next()) {

            UserBean bean = new UserBean();

            bean.setId(rs.getString(1));
            bean.setPassword(rs.getString(2));
            bean.setName(rs.getString(3));
            bean.setIncorrectAttempts(rs.getInt(4));
            bean.setLockStatus(rs.getInt(5));
            bean.setUserType(rs.getString(6));

            list.add(bean);
        }

        return list;
    }

    public String[] getNames() throws Exception {

        Connection con = DBUtil.getConnection();

        Statement st = con.createStatement();

        ResultSet rs =
                st.executeQuery("select name from users");

        ArrayList<String> list = new ArrayList<>();

        while (rs.next()) {

            list.add(rs.getString(1));
        }

        return list.toArray(new String[0]);
    }
}