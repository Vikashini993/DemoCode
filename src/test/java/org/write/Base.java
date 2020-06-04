package org.write;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Base {

	static WebDriver driver;
	public static void launch(String s) {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP 8440P\\eclipse-workspace\\Dead\\driver\\chromedriver.exe");

		driver=new ChromeDriver();
	driver.get(s);
	}
	public static void fill(WebElement w,String l) {
		w.sendKeys(l);
	}
	public static void klik(WebElement w) {
	w.click();

	}
	public static void dropdown(WebElement w, String l) {
		Select st = new Select(w);
		st.selectByVisibleText(l);
		
		System.out.printl("Hai");
		System.out.println("kite");

	}
	
}
