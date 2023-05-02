package JDBC.day02;

import Utilities.DBUtilities;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class _02_FirstAndLastGetRowGetType extends DBUtilities {

    @Test
    public void test1() throws SQLException {

        ResultSet rs = statement.executeQuery("select city_id, city, country_id from city");
        rs.last();//jumps to the last row
        String cityName=rs.getString("city");
        System.out.println(cityName);

        int idInt=rs.getInt("city_id");
        System.out.println("id int :"+idInt);

        String idStr = rs.getString("city_id");
        System.out.println("id String :"+idStr);

        int currentRowNumber = rs.getRow();
        System.out.println("Current row number "+currentRowNumber);
        //You can find how many rows your query returns by using last and getRow one after another

        rs.first();


    }

}
