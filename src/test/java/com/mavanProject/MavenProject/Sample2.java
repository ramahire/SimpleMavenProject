package com.mavanProject.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Sample2 {
	WebDriver driver=null;
	@Test
	public void firefoxDemo() {
		driver=new FirefoxDriver();
		
		driver.get("https://fb.com");
		driver.quit();
	}
}
