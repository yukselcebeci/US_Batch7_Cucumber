package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class _09_WriteInANewExcelFile {
    public static void main(String[] args) throws IOException {
        String path ="src/test/java/ApachePOI/Resources/WriteIntoANewExcelFile.xlsx";

        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet=workbook.createSheet("OurSheet");

        Row row= sheet.createRow(0);
        Cell cell=row.createCell(0);
        cell.setCellValue("Hello World");

        FileOutputStream fileOutputStream = new FileOutputStream(path);
        workbook.write(fileOutputStream);
        workbook.close();
        fileOutputStream.close();
    }
}
