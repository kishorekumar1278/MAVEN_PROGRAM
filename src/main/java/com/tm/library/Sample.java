package com.tm.library;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample {
	
	//public static void main(String[] args) {
	@Test
	public void m1(){
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Tm-5\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testingmasters.com/hrm/");
		driver.findElement(By.id("txtUsername")).sendKeys("user02");
		driver.findElement(By.id("txtPassword")).sendKeys("TM1234");
        driver.findElement(By.id("btnLogin")).click();
	
	}
}

/*public static void main(String[] args) {
	

	String s="kishore";
	int i=0;
	for(char c:s.toCharArray()){
		
		i++;
		
	}
	System.out.print(i);
}		*/



	
	

