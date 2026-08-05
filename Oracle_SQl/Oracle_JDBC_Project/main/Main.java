package main;

import dao.UserDAO;

public class Main {

    public static void main(String[] args)
            throws Exception {

        UserDAO dao = new UserDAO();

        System.out.println(
                dao.getUserType("AB1001"));

        System.out.println(
                dao.getIncorrectAttempts("AB1001"));

        System.out.println(
                dao.changeUserType("RS1003"));

        System.out.println(
                dao.getLockStatus());

        System.out.println(
                dao.changeName("AB1001", "Varsha"));

        System.out.println(
                dao.changePassword("new123"));
    }
}