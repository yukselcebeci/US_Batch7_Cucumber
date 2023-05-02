package JDBC.day01;

import org.testng.annotations.Test;

import java.sql.*;

public class _01_IntroToJDBC {
    @Test
    public void test1() throws SQLException {
        String url = "jdbc:mysql://db-technostudy.ckr1jisflxpv.us-east-1.rds.amazonaws.com:3306/sakila";
        // url contains type of connection(jdbc), type of database(mysql), url to remote server,
        // port number on that server, name of the database we want to work on

        String username = "root";
        String password ="'\"-LhCB'.%k[4S]z";

        Connection connection = DriverManager.getConnection(url,username,password);
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("select * from actor");
        //The result is on the database on the work faster.
        rs.next(); //the arrow is on the first row

        String firstName=rs.getString("first_name");
        String lastName=rs.getString("last_name");
        System.out.println("First row is "+firstName+" and "+lastName);

        rs.next();
        firstName=rs.getString(1);
        lastName = rs.getString(3);
        System.out.println(firstName);
        System.out.println("Second row is "+firstName+" and "+lastName);
        connection.close();
    }
}
