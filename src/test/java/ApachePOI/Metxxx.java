package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.IOException;

public class Metxxx {
    public static String callThatMethod(String usersResponse) throws IOException {
        String path = "src/test/java/ApachePOI/Resources/LoginData.xlsx";

        FileInputStream fileInputStream= new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheet("Login");

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if (sheet.getRow(i).getCell(0).toString().equals(usersResponse)){
                for (int j = 1; j <sheet.getRow(i).getPhysicalNumberOfCells() ; j++) {
                    System.out.println(sheet.getRow(i).getCell(j));
                }
            }
        } return usersResponse;
    }
}
