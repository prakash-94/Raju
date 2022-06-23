import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Siblings {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:/softwares_jars/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//header/div/button[1]")).getText();
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]")).getText());
		driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText();
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		driver.close();
		

	
	}

}
