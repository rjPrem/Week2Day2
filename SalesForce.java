package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		Thread.sleep(2500);
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("Prem");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Kumar");
		driver.findElement(By.xpath("//input[@name='UserEmail']")).sendKeys("Test@gmail.com");
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@name='UserPhone']")).sendKeys("9003417070");
		WebElement userTitle = driver.findElement(By.xpath("//select[@name='UserTitle']"));
		Select dropdown = new Select(userTitle);
		dropdown.selectByValue("Marketing_PR_Manager_AP");

		WebElement companyEmployees = driver.findElement(By.xpath("//select[@name='CompanyEmployees']"));
		Select dropdown1 = new Select(companyEmployees);
		dropdown1.selectByValue("1600");

		WebElement companyCountry = driver.findElement(By.xpath("//select[@name='CompanyCountry']"));
		Select dropdown3 = new Select(companyCountry);
		dropdown3.selectByValue("IN");

		driver.findElement(By.xpath("//div[@class='checkbox-ui']")).click();
		driver.close();

	}

}
