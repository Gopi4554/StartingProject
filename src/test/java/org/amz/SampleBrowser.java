package org.amz;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SampleBrowser{
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseClass baseClass=new BaseClass();
		WebDriver driver = baseClass.getDriver();
		baseClass.toLoadUrl("https://adactinhotelapp.com/");

		String getTitle = baseClass.toGetTitle();
		System.out.println(getTitle);
		String getCurrentUrl = baseClass.toGetCurrentUrl();
		System.out.println(getCurrentUrl);
		baseClass.toMaximize();
		WebElement txtUserName = driver.findElement(By.id("username"));
		baseClass.toInsertValue(txtUserName, "gopi4554");
		WebElement txtPassword = driver.findElement(By.id("password"));
		baseClass.toInsertValue(txtPassword, "goPi4554@");
		WebElement btnLogin = driver.findElement(By.id("login"));
		baseClass.toClick(btnLogin);
		WebElement dDnLocation = driver.findElement(By.id("location"));
		baseClass.toInsertValue(dDnLocation, baseClass.toGetValuesFromExcel(6, 0));
		WebElement dDnHotels = driver.findElement(By.id("hotels"));
		baseClass.toInsertValue(dDnHotels, baseClass.toGetValuesFromExcel(3, 1));
		WebElement dDnRoomType = driver.findElement(By.id("room_type"));
		baseClass.toInsertValue(dDnRoomType, baseClass.toGetValuesFromExcel(4, 2));
		WebElement dDnRoomNum = driver.findElement(By.id("room_nos"));
		baseClass.toInsertValue(dDnRoomNum, baseClass.toGetValuesFromExcel(4, 3));
		WebElement txtInDate = driver.findElement(By.id("datepick_in"));
		baseClass.toClear(txtInDate);
		baseClass.toInsertValue(txtInDate, baseClass.toGetValuesFromExcel(2, 4));
		WebElement dDnOutDate = driver.findElement(By.id("datepick_out"));
		baseClass.toClear(dDnOutDate);
		baseClass.toInsertValue(dDnOutDate, baseClass.toGetValuesFromExcel(2, 5));
		WebElement dDnAdultCount= driver.findElement(By.id("adult_room"));
		baseClass.toInsertValue(dDnAdultCount, baseClass.toGetValuesFromExcel(4, 6));
		WebElement dDnChildCount = driver.findElement(By.id("child_room"));
		baseClass.toInsertValue(dDnChildCount, baseClass.toGetValuesFromExcel(1, 7));
		WebElement btnSubmit = driver.findElement(By.id("Submit"));
		baseClass.toClick(btnSubmit);
		WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
		baseClass.toClick(btnRadio);
		WebElement btnContinue = driver.findElement(By.id("continue"));
		baseClass.toClick(btnContinue);
		WebElement txtFirstName = driver.findElement(By.id("first_name"));
		baseClass.toInsertValue(txtFirstName, baseClass.toGetValuesFromExcel(1, 8));
		WebElement txtLastName = driver.findElement(By.id("last_name"));
		baseClass.toInsertValue(txtLastName, baseClass.toGetValuesFromExcel(1, 9));
		WebElement txtAddress = driver.findElement(By.id("address"));
		baseClass.toInsertValue(txtAddress, baseClass.toGetValuesFromExcel(1, 10));
		WebElement txtCrediCardNum = driver.findElement(By.id("cc_num"));
		baseClass.toInsertValue(txtCrediCardNum, baseClass.toGetValuesFromExcel(1, 11));
		WebElement txtCardType = driver.findElement(By.id("cc_type"));
		baseClass.toInsertValue(txtCardType, baseClass.toGetValuesFromExcel(3, 12));
		WebElement dDnExpiryMonth = driver.findElement(By.id("cc_exp_month"));
		baseClass.toInsertValue(dDnExpiryMonth, baseClass.toGetValuesFromExcel(8, 13));
		WebElement dDnExpiryYear = driver.findElement(By.id("cc_exp_year"));
		baseClass.toInsertValue(dDnExpiryYear, baseClass.toGetValuesFromExcel(11, 14));
		WebElement txtCvvNum = driver.findElement(By.id("cc_cvv"));
		baseClass.toInsertValue(txtCvvNum, baseClass.toGetValuesFromExcel(6, 15));
		WebElement btnBookNow= driver.findElement(By.id("book_now"));
		baseClass.toClick(btnBookNow);
		Thread.sleep(8000);
		WebElement findElement = driver.findElement(By.xpath("//input[@id='order_no']"));
	    String string = baseClass.toGetAttribute(findElement);
	    System.out.println(string);
	    baseClass.toSaveValuesToExcel(string, 1, 16);
		
		
		
		baseClass.toCloseAllBrowser();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	}
	


