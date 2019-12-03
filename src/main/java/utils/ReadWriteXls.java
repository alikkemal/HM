package utils;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadWriteXls {

    public void writeFile(List<String> listWillBeWritten, String sheetName) throws IOException {
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetName);

        int rowCount = 0;

        for (String eachRow : listWillBeWritten) {
            Row row = sheet.createRow(rowCount++);

            int columnCount = 0;

            Cell cell = row.createCell(columnCount++);
            cell.setCellValue(eachRow);
        }

        try (FileOutputStream outputStream = new FileOutputStream(sheetName+".xlsx")) {
            workbook.write(outputStream);
        }
    }

    }

