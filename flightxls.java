package config;

import java.io.FileInputStream;
import java.io.IOException;

import org.testng.annotations.DataProvider;

public class flightxls {
	
		public static String[][] getdata(String file) throws IOException {
		FileInputStream fileInput = new FileInputStream(file);
		XSSFWorkbook book = new XSSFWorkbook(fileInput);
		org.apache.poi.ss.usermodel.Sheet sheet = book.getSheetAt(0);
		int row1 = sheet.getLastRowNum();
		row1 += 1;
		int col = sheet.getRow(0).getLastCellNum();
		String array[][] = new String[row1][col];
		int count = 0;
		for (Row row : sheet) {
		int count1 = 0;
		for (Cell cell : row) {
		String Data = cell.toString();
		array[count][count1] = Data;
		count1++;
		}
		count++;
		}
		return array;
		}
		@DataProvider(name="SearchProvider")
		   public Object[][] getDataFromDataprovider() throws IOException {
		return flightxls.getdata("C:\\Users\\Suraj.konangi\\Documents\\bookinginfo.xls");
		}
		@DataProvider(name="SearchProvider")
		void m(String[] arr) {
		arr[0];
		arr[1];
		arr[2];

		}

		}

