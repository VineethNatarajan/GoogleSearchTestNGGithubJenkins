package s1googlesearch;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class TC3GoogleSearchResultCountGITHUB {
	public WebDriver driver=null;
	public WebDriverWait wait=null;
	
	@Test(priority=1)
	public void googleSearchResultCount(){
		//Launch the browser
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserExeFiles\\chromedriver.exe");
		driver=new ChromeDriver();	
		wait=new WebDriverWait(driver, 50);		
		
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("GITHUB");
		driver.findElement(By.id("lst-ib")).submit();
		wait.until(ExpectedConditions.titleContains("GITHUB"));
		String txt=driver.findElement(By.id("resultStats")).getText();
		String[] str=txt.split(" ");
		System.out.println("SearchResult: "+str[1]);
		driver.quit();
	}	
	
	@AfterClass
	public void closingBrowser() {
		driver.quit();
	}


}
