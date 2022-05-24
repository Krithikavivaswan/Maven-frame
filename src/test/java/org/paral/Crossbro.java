package org.paral;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crossbro {
	WebDriver driver;
	
	@Parameters({"Bname"})
	@Test
	private void testcase(String Bname) {
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

driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
	}

}
