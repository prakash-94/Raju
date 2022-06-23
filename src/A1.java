import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:/softwares_jars/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("aus");
		List<WebElement> Options = driver.findElements(By.cssSelector("li[class = 'ui-menu-item']"));
		for(WebElement Option : Options)
		{
			if(Option.getText().equalsIgnoreCase("Austria"))
			{
				Option.click();
				break;
			}
		}
		
	}

}
