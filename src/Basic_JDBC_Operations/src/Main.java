public class Main {

    public static void main(String[] args) {

        UserDAO dao = new UserDAO();

        int result = dao.getLockStatus();

        System.out.println(result);

    }
}