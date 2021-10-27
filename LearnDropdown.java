package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		WebElement eleusername = driver.findElement(By.id("username"));
		eleusername.sendKeys("DemoSalesManager");
		WebElement elepassword = driver.findElement(By.id("password"));
		elepassword.sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		Thread.sleep(2000);

		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test leaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Prem kumar");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Jagannathan");
		
		WebElement elesource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown = new Select(elesource);
		dropdown.selectByVisibleText("Employee");
		
		WebElement eleIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown2 = new Select(eleIndustry);
		dropdown2.selectByIndex(7);
		
		WebElement eleowner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		eleowner.sendKeys("Partnership");
		
		
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).click();
		driver.findElement(By.xpath("//option[@value='CATRQ_AUTOMOBILE']")).click();
		
		
		
	
		
	}
}
