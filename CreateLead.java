package week2.day2;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		
		Thread.sleep(2000);

		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test leaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Prem kumar");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Jagannathan");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
	
		
	
		
	}

}
