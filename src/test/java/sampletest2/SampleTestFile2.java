package sampletest2;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleTestFile2 {
	@Test
	public void test() throws IOException{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.google.com");
	
	File src = ((TakesScreenshot)(driver)).getScreenshotAs(OutputType.FILE);
	FileHandler.copy(src, new File("D:\\surya\\E1_GitTest\\Screenshot\\GitHubTest.png"));
    driver.close();
	}

}
