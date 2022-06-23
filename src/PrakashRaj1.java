	import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

class PrakashRaj1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String name = "rahul";
		WebDriver driver ;
		System.setProperty("webdriver.chrome.driver","C:/softwares_jars/Drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String password = getpassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.tagName("p")).getText();
		System.out.println(driver.findElement(By.xpath("//div/p")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div/p")).getText(),"You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
		
}
	
	public static String getpassword(WebDriver driver) throws InterruptedException 
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText =driver.findElement(By.cssSelector("form p")).getText();
		String[] passwordArray = passwordText.split("'");
		// String[] passwordArray2 = passwordArray[1].split("'");
		// passwordArray2[0]
		String password = passwordArray[1].split("'")[0];
		return password;
		//0th index - Please use temporary password
		//1st index - rahulshettyacademy to Login.
		
		
		

		
		
		
	}
	
	
	
 }

