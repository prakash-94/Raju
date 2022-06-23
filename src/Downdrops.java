import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Downdrops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:/softwares_jars/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select( staticDropdown);
		dropdown.selectByIndex(3);
		dropdown.getFirstSelectedOption().getText();
		dropdown.selectByVisibleText("AED");
		dropdown.getFirstSelectedOption().getText();
		dropdown.selectByValue("INR");
		dropdown.getFirstSelectedOption().getText();
		
		driver.close();
		
		
		

	}

}
