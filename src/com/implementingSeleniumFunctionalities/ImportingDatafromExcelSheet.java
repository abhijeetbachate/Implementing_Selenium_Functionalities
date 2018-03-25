package com.implementingSeleniumFunctionalities;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import xls.ShineXlsReader;

public class ImportingDatafromExcelSheet {

	@Test(dataProvider = "getdata")
	public void checkloginfunctionality(String cn, String cp) {
		System.out.println("The values are: " + cn + cp);
	}

	@DataProvider
	public Object[][] getdata() {
		ShineXlsReader xls = new ShineXlsReader(".\\src\\com\\Datapool\\DataPool.xlsx");
		int rowCount = xls.getRowCount("Test2");
		int colCount = xls.getColumnCount("Test2");

		System.out.println("The row count is: " + rowCount + " The Column cunt is: " + colCount);
		Object obj[][] = new Object[rowCount - 1][colCount];

		for (int i = 2; i <= rowCount; i++) {
			for (int j = 0; j < colCount; j++) {
				obj[i - 2][j] = xls.getCellData("Test2", j, i);
			}
		}
		return obj;
		/*
		 * @DataProvider public Object[][] getdata() { Object[][] arr = new
		 * Object[3][2]; arr[0][0] = "admin1"; arr[0][1] = "manager1";
		 * 
		 * arr[1][0] = "admin"; arr[1][1] = "manager";
		 * 
		 * arr[2][0] = "admin2"; arr[2][1] = "manager2";
		 * 
		 * return arr; }
		 */

	}
}
