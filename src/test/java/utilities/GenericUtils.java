package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GenericUtils {
    public List<Map<String, String>> getData(String excelFilePath, String sheetName) throws IOException {
        List<Map<String, String>> excelData = new ArrayList<>();
        FileInputStream inputStream = new FileInputStream(new File(excelFilePath));
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet(sheetName);
        
        if (sheet != null) {
            Row headerRow = sheet.getRow(0);
            int rowCount = sheet.getPhysicalNumberOfRows();
            int columnCount = headerRow.getPhysicalNumberOfCells();
            
            for (int rowIndex = 1; rowIndex < rowCount; rowIndex++) {
                Row currentRow = sheet.getRow(rowIndex);
                if (currentRow != null) {
                    Map<String, String> rowData = new LinkedHashMap<>();
                    for (int columnIndex = 0; columnIndex < columnCount; columnIndex++) {
                        Cell headerCell = headerRow.getCell(columnIndex);
                        Cell currentCell = currentRow.getCell(columnIndex);
                        if (headerCell != null && currentCell != null) {
                            String headerCellValue = headerCell.getStringCellValue().trim();
                            String currentCellValue = currentCell.getStringCellValue().trim();
                            rowData.put(headerCellValue, currentCellValue);
                        }
                    }
                    excelData.add(rowData);
                }
            }
        }
        
        workbook.close();
        inputStream.close();
        
        return excelData;
    }
}
