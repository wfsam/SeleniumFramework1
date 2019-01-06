package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	//static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	static int rowCount;
	static String cellData;

	public ExcelUtils(String excelPath, String sheetName) {
		try {
			//projectPath = System.getProperty("user.dir");
			//workbook = new XSSFWorkbook(projectPath + "/excel/data.xlsx");
			workbook = new XSSFWorkbook(excelPath);
			//sheet = workbook.getSheet("Sheet1");
			sheet = workbook.getSheet(sheetName);
			
		} catch (Exception exception) {
			exception.printStackTrace();

		}
	}

	public static void main(String[] args) {
		getRowCount();
		getCellData(0,0);
	}

	public static void getRowCount() {		

		try {

			rowCount = sheet.getPhysicalNumberOfRows();

			System.out.println("Row count : "+ rowCount);

		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println("MEssage is " + exp.getMessage());
			System.out.println("Cause is " + exp.getCause());			
			exp.printStackTrace();
		}

	}

	public static void getCellData(int rowNum, int colNum) {

		try {

//			workbook = new XSSFWorkbook(projectPath + "/excel/data.xlsx");
//			sheet = workbook.getSheet("Sheet1");
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println("Cell Data is :" + cellData);

		} catch (Exception exp2) {
			System.out.println("Message 2 is " + exp2.getMessage());
			System.out.println("Cause 2 is " + exp2.getCause());			
			exp2.printStackTrace();
		}
	}

}
