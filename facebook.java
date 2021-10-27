package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
          WebDriverManager.chromedriver().setup();
          ChromeDriver driver = new ChromeDriver();
          driver.get("https://en-gb.facebook.com/");
          driver.manage().window().maximize();
          Thread.sleep(2500);
          driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
          Thread.sleep(3000);
          driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Prem");
          driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jagannathan");
          driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Test@gmail.com");
          driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("password");
         
          WebElement dropdown1 = driver.findElement(By.id("day"));
          Select date = new Select(dropdown1);
          date.selectByIndex(29);
          
          WebElement dropdown2 = driver.findElement(By.id("month"));
          Select month = new Select(dropdown2);
          month.selectByValue("8");
          
          WebElement dropdown3 = driver.findElement(By.id("year"));
          Select year = new Select(dropdown3);
          year.selectByVisibleText("1990");
          
          driver.findElement(By.xpath("//label[text()='Male']")).click();
          
          
          
          
          

	}

}
