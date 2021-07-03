package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) {
		String projectLocation = System.getProperty("user.dir");
		
		System.setProperty("webdriver.gecko.driver",projectLocation+"\\lib\\geckodriver\\geckodriver.exe");
		System.setProperty("webdriver.firefox.exe", "C:\\Program Files\\Mozilla Firefox.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://the-internet.herokuapp.com/shadowdom");
		
		WebElement element = driver.findElement(By.tagName("span"));
		System.out.println(element.getText());
		WebElement elements = driver.findElement(By.tagName("ul"));
		System.out.println(elements.getText());
		
	}

}
