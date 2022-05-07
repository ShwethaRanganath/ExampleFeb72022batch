package com.sgtesting.reflectionassaignment;

import java.io.FileInputStream;
import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Runscript {
	public static void main(String[] args) {
		executeTests();

	}


	private static void executeTests()
	{
		Workbook wb=null;
		FileInputStream fin=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			//String path=System.getProperty("user.dir");
			fin=new FileInputStream("D:\\acti\\reflection.xlsx");
			wb=new XSSFWorkbook(fin);
			int shcount=wb.getNumberOfSheets();
			for(int i=0;i<shcount;i++)
			{
				String sheetname=wb.getSheetName(i);
				System.out.println(sheetname);
				int rc=sh.getPhysicalNumberOfRows();
				for(int r=1;r<rc;r++)
				{
					row=sh.getRow(r);
					cell=row.getCell(0);
					String methodname=cell.getStringCellValue();
					cell=row.getCell(1);
					String pkgclassname=cell.getStringCellValue();
					System.out.println(methodname+" <------ "+pkgclassname);

					Class clsobject=Class.forName(pkgclassname);
					Object obj=clsobject.getDeclaredConstructor().newInstance();

					Method method=obj.getClass().getMethod(methodname);
					method.invoke(obj);
				}
			}
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		
			finally
			{
				try
				{
					fin.close();
					wb.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			}
		}
}


