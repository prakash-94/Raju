import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VegPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:/softwares_jars/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		String[] itemsNeeded= {"Brocolli","Cucumber","Potato"};
		int j=0;
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		List<WebElement> products = driver.findElements(By.cssSelector("h4[class='product-name']"));
		
		for(int i=0;i<products.size();i++)
		{
			String[] name = products.get(i).getText().split("-");
			String formattingList = name[0].trim();
			
			List<String> itemsNeededlist = Arrays.asList(itemsNeeded);
			
			if(itemsNeededlist.contains(formattingList))
			{
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==itemsNeeded.length)
				{
					break;
				}
			}
			
		}
		
		
		
		
	}

}
