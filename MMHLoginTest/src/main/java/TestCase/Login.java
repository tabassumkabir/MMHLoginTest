package TestCase;


import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.DriverSetup;

public class Login extends DriverSetup {
	
	static String Url="https://acc.mypainlog.ai/#/sign-in";
	
	
	@Test
	public void login() {
		
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("Email")).sendKeys("tkabir234@yopmail.com");
		driver.findElement(By.name("Password")).sendKeys("Gallianfg123");
		driver.findElement(By.className("w-100")).click();
		
	}

		
	
		
		
		
		
	}


