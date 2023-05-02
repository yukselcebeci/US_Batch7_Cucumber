package Utilities;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelUtilities {
    public static ArrayList<ArrayList<String>> getDataFromExcel(String path,String sheetName,int columnCount){
        Sheet sheet;
        try {
            FileInputStream fileInputStream=new FileInputStream(path);
            Workbook workbook= WorkbookFactory.create(fileInputStream);
            sheet = workbook.getSheet(sheetName);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        ArrayList<ArrayList<String>> returnList= new ArrayList<>();
        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            ArrayList<String> innerList = new ArrayList<>();
            for (int j = 0; j < columnCount; j++) {
                Cell cell = sheet.getRow(i).getCell(j);
                innerList.add(cell.toString());
            } returnList.add(innerList);

        }return returnList;
    }
    public static void main (String[] args){
        ArrayList<ArrayList<String>> data = getDataFromExcel("src/test/java/ApachePOI/Resources/WriteIntoAnExcelFile.xlsx","Sheet1",5);
        System.out.println(data);
    }
}
