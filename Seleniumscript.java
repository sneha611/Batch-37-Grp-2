package Endurica;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumscript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","D:\\QE Software\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");;
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.opencart.com/");
	driver.manage().window().maximize();
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getPageSource());
	//driver.quit();
	//Your Store
	}

}
