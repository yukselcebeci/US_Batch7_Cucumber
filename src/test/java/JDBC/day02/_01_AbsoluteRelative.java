package JDBC.day02;

import Utilities.DBUtilities;
import org.testng.annotations.Test;

import java.sql.*;

public class _01_AbsoluteRelative extends DBUtilities {
    @Test
    public void test1() throws SQLException {

        ResultSet rs = statement.executeQuery("select * from film");

        rs.absolute(10); // goes to the 10th row right away
        String title = rs.getString("title");
        System.out.println("Film title on the 10th row: " + title);

        rs.absolute(15);
        title = rs.getString("title");
        System.out.println("Film title on the 15th row: " + title);

        rs.absolute(5);
        title = rs.getString("title");
        System.out.println("Film title on the 5th row: " + title);

        rs.relative(20);
        title = rs.getString("title");
        System.out.println("Film title on the 25th row: " + title);

        rs.relative(3);
        title = rs.getString("title");
        System.out.println("Film title on the 28th row: " + title);

        rs.relative(-10);
        title = rs.getString("title");
        System.out.println("Film title on the 18th row: " + title);







    }
}