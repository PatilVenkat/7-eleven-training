import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Update_DB {

    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/students";
        String user = "root";
        String password = "Root";
        String name1 = "bala";
        String email1 = "venkat@gmail.com";

        Class.forName("com.mysql.cj.jdbc.Driver"); // load &register Driver
        Connection conn = DriverManager.getConnection(url, user, password); // create connection
        {
            System.out.println("Connection successful!");

        }
        PreparedStatement ps = conn.prepareStatement(" update Info set name=? where email=?"); // update Statement
        ps.setString(1, name1);
        ps.setString(2, email1);
        int count = ps.executeUpdate();
        if (count > 0) {
            System.out.println("update success");
        } else {
            System.out.println("update unsuccess");
        }
    }
}
