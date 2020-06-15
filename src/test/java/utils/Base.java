package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public static WebDriver getDriver() throws IOException {
		getprop();
		System.setProperty("webdriver.chrome.driver", "D:\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(prop.getProperty("url"));
		return driver;
	}
	
	public static void getprop() throws IOException {
		
		prop = new Properties();
		FileInputStream fis = new FileInputStream("D:\\work\\SeleniumJava\\src\\test\\java\\utils\\global.properties");
		prop.load(fis);
		
		
	}

}
