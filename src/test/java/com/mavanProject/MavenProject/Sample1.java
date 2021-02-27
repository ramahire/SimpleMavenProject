package com.mavanProject.MavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Sample1 {
	WebDriver driver=null;
	
	@Test
	public void login() {
		driver=new ChromeDriver();
		driver.get("https://web.whatsapp.com");
		driver.quit();
	}
	
	
}
