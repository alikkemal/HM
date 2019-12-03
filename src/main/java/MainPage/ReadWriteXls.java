package MainPage;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


public class ReadWriteXls {

        public void writeFile(HashMap<String,String> map) throws IOException {

            XSSFWorkbook workbook = new XSSFWorkbook();
            int rowCount = 0;

            for (String aBook : map.keySet()) {

                XSSFSheet sheet = workbook.createSheet("mapList");
                Row row = sheet.createRow(rowCount++);

                int columnCount = 0;

                Cell cell = row.createCell(columnCount++);
                cell.setCellValue(aBook);
            }

            try (FileOutputStream outputStream = new FileOutputStream("campaigns.xls")) {
                workbook.write(outputStream);
            }
        }

    }

