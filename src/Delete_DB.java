import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete_DB {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/students";
        String user = "root";
        String password = "Root";
        String name1 = "bala";

        Class.forName("com.mysql.cj.jdbc.Driver"); // load &register Driver
        Connection conn = DriverManager.getConnection(url, user, password); // create connection
        {
            System.out.println("Connection successful!");

        }
        PreparedStatement ps = conn.prepareStatement(" delete from Info where name=?"); // update Statement
        ps.setString(1, name1);

        int count = ps.executeUpdate();
        if (count > 0) {
            System.out.println("update success");
        } else {
            System.out.println("update unsuccess");
        }
    }
}