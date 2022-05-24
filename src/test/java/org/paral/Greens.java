package org.paral;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Greens {
	WebDriver driver;
	
	@Parameters({"Bname"})
	@Test
	private void cross(String Bname) {
if (Bname.startsWith("chrome")) {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();	
}
else if (Bname.equals("ffox")) {
	WebDriverManager.firefoxdriver().setup();
	driver=new FirefoxDriver();
}		
else {
	WebDriverManager.edgedriver().setup();
	driver=new EdgeDriver();
}

driver.get("http://www.greenstechnologys.com/");
	driver.manage().window().maximize();
	}
	

}
