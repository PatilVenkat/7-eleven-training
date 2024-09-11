import java.sql.Connection;
import java.sql.DriverManager;
//import java.sql.SQLException;

//import com.mysql.cj.exceptions.ExceptionFactory;

import java.sql.PreparedStatement;

public class Create_DB {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/students";
        String user = "root";
        String password = "Root";
        String name1 = "bala";
        String email1 = "balaprasadh133@gmail.com";
        String password1 = "bala@123";
        String gender1 = "male";
        Class.forName("com.mysql.cj.jdbc.Driver"); // load &register Driver
        Connection conn = DriverManager.getConnection(url, user, password); // create connection
        {
            System.out.println("Connection successful!");

        }

        // PreparedStatement ps = conn.prepareStatement(
        // "insert into Info values( 'venkat', 'venkatpatil2010@gmail.com' , 'xyz@123'
        // ,"'male')");

        PreparedStatement ps = conn.prepareStatement(
                "insert into Info values( ?,?,?,?)"); // create Statement

        ps.setString(1, name1);
        ps.setString(2, email1);
        ps.setString(3, password1);
        ps.setString(4, gender1);

        int i = ps.executeUpdate(); // Execute SQL statement
        if (i > 0) {
            System.out.println("success");
        } else {
            System.out.println("fail");
        }

    }
}
