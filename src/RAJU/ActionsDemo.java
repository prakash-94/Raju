package RAJU;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:/softwares_jars/Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	Actions a=new Actions(driver);
	WebElement move=driver.findElement(By.cssSelector("a#nav-link-accountList"));
	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
	a.moveToElement(move).contextClick().build().perform();
	

	}

}
