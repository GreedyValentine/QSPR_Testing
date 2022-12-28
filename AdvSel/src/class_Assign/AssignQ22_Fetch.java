package class_Assign;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AssignQ22_Fetch 
{
	public static String getData(String sh,int r,int c)
	{
		String value="";
		try
		{
			FileInputStream fis = new FileInputStream("./Excel/class_Assign.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			Sheet sheet = book.getSheet(sh);
			Row row = sheet.getRow(r);
			Cell cell = row.getCell(c);
			value = cell.toString();
		}
		catch (Exception e) 
		{
			System.out.println("Invalid Data");
		}
		return value;
	}
}
