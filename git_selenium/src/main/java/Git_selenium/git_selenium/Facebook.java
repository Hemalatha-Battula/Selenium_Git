package Git_selenium.git_selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
		//setting up drivers
				System.setProperty("webdriver.chrome.driver", "./Drivers/ChromeDriver.exe");
				ChromeDriver driver = new ChromeDriver();
				
				//Opening the chrome Browser
				driver.get("https://www.facebook.com/");
				
				driver.manage().window().maximize();
				
				//finding the mandatory elements
				driver.findElementById("email").sendKeys("abc@gmail.com");
				driver.findElementById("pass").sendKeys("abc@123");
				driver.findElementById("loginbutton").click();
	}

}
