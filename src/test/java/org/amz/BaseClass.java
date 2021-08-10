package org.amz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	static WebDriver driver;
	public WebDriver getDriver() {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
		return driver;
	}
public void toLoadUrl(String data) {
driver.get(data);
}

public String toGetCurrentUrl() {
String currentUrl = driver.getCurrentUrl();
return currentUrl;

}
public String toGetTitle() {
String title = driver.getTitle();
return title;

}
public void toMaximize() {
driver.manage().window().maximize();

}
public void toInsertValue(WebElement element,String data) {
element.sendKeys(data);
}
public void toClick(WebElement element) {
element.click();
}
public void toCloseAllBrowser() {
	driver.quit();
}
public String toGetAttribute(WebElement element) {
	String attribute = element.getAttribute("Value");
	return attribute;

}
public void toSelectActionByText(WebElement element,String data) {
	new Select(element).selectByVisibleText(data);

}
public void toSelectOptionByValue(WebElement element,String data) {
	new Select(element).deselectByValue(data);

}
public void toSelectByIndex(WebElement element,int index) {
	new Select(element).selectByIndex(index);

}

public String toGetValuesFromExcel(int rowNo,int cellNo) throws IOException {
	String data=null;
	File file=new File("C:\\Users\\Gopinath\\eclipse-workspace\\AmazonExcel\\Excel\\Adactin.xlsx");
	FileInputStream fileInputStream=new FileInputStream(file);
	Workbook workbook=new XSSFWorkbook(fileInputStream);
	Sheet sheet = workbook.getSheet("Drop Down");
	Row row = sheet.getRow(rowNo);
	Cell cell = row.getCell(cellNo);
	int cellType = cell.getCellType();
	if (cellType==1) {
		data=cell.getStringCellValue();
		}
if (cellType==0) {
	if (DateUtil.isCellDateFormatted(cell)) {
		Date date=cell.getDateCellValue();
		SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
		data=dateFormat.format(date);
		}
		else {
			double d=cell.getNumericCellValue();
			long l=(long)d;
			data=String.valueOf(l);
		}
	}

return data;
	
}
public void toClear(WebElement element) {
	element.clear();
}


public String toSaveValuesToExcel(String data,int rowNo,int cellNo) throws IOException {
	File file=new File("C:\\\\Users\\\\Gopinath\\\\eclipse-workspace\\\\AmazonExcel\\\\Excel\\\\Adactin.xlsx");
	FileInputStream fileInputStream=new FileInputStream(file);
	Workbook workbook=new XSSFWorkbook(fileInputStream);
	Sheet sheet = workbook.getSheet("Drop Down");
	sheet.getRow(rowNo).createCell(cellNo).setCellValue(data);
	FileOutputStream fileOutputStream=new FileOutputStream(file);
	workbook.write(fileOutputStream);
	
return data;
}



public String toGetText(WebElement element) {
	String text = element.getText();
	return text;

}



}

	

	
	

