package RAJU;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Vegetables {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:/softwares_jars/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
		String[] itemsNeeded = { "Cucumber", "Brocolli", "Beetroot" };

		driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		Thread.sleep(3000);

		addItems(driver, itemsNeeded);
driver.findElement(By.cssSelector("img[alt='Cart']")).click();
driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@class='promoCode']")));
driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
driver.findElement(By.className("promoBtn")).click();
w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
System.out.println(driver.findElement(By.cssSelector(".promoInfo")).getText());
driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();

	}

	public static void addItems(WebDriver driver, String[] itemsNeeded)

	{
		int j = 0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++) {
			String[] name = products.get(i).getText().split("-");
			String formattedName = name[0].trim();
			List itemsNeededList = Arrays.asList(itemsNeeded);
			if (itemsNeededList.contains(formattedName)) {
				j++;
				driver.findElements(By.cssSelector("div[class='product-action'] button")).get(i).click();
				if (j == itemsNeeded.length) {
					break;
				}
			}
		}
	}

}
