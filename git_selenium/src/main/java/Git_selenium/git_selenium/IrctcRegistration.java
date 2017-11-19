package Git_selenium.git_selenium;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcRegistration {

	public static void main(String[] args) throws InterruptedException {
		//setting up drivers
		System.setProperty("webdriver.chrome.driver", "./Drivers/ChromeDriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		//Opening the chrome Browser
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.manage().window().maximize();
		
		//finding the mandatory elements
		driver.findElementById("userRegistrationForm:userName").sendKeys("Hema206");
		driver.findElementById("userRegistrationForm:password").sendKeys("Hema@206");
		
		//selecting the security question from the drop down
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Hema@206");
		WebElement secQ = driver.findElementById("userRegistrationForm:securityQ");
		Select Ques= new Select(secQ);
		Ques.selectByValue("1");
		
		//giving security question answer
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("ABC");
		
		//selecting the language from the drop down
		WebElement lan = driver.findElementById("userRegistrationForm:prelan");
		Select prefLan= new Select(lan);
		prefLan.selectByVisibleText("English");
		
		//finding the elements to enter the personal details
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Hemalatha");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Battula");
		driver.findElementById("userRegistrationForm:gender:1").click();
		driver.findElementById("userRegistrationForm:maritalStatus:1").click();
		
		//selecting day in the DOB drop down
		WebElement dobDay= driver.findElementById("userRegistrationForm:dobDay");
		Select dayDd= new Select(dobDay);
		List<WebElement>dayOptions = dayDd.getOptions();
		int countDayOpt = dayOptions.size();
		System.out.println(countDayOpt);
		
		//selecting the day drop down value
		dayDd.selectByIndex(countDayOpt-15);
		
		//selecting month in DOB drop down
		WebElement monthDd= driver.findElementById("userRegistrationForm:dobMonth");
		Select month= new Select(monthDd);
		month.selectByVisibleText("AUG");
		
		//selecting the year in the dob
		WebElement yearDd= driver.findElementById("userRegistrationForm:dateOfBirth");
		Select year= new Select(yearDd);
		year.selectByVisibleText("1994");
		
		//selecting occupation in the dropdown
		WebElement occupation= driver.findElementById("userRegistrationForm:occupation");
		Select occup= new Select(occupation);
		occup.selectByVisibleText("Private");
		
		//entering email
		driver.findElementById("userRegistrationForm:email").sendKeys("abc@gmial.com");
		//entering mobile number
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9876543210");
		
		//selecting nationality in the drop down
		WebElement nationality= driver.findElementById("userRegistrationForm:nationalityId");
		Select nation= new Select(nationality);
		nation.selectByVisibleText("India");
		
		//finding elements to give residential details
		driver.findElementById("userRegistrationForm:address").sendKeys("123/2");
		
		//selecting county in the drop down 
		WebElement country= driver.findElementById("userRegistrationForm:countries");
		Select cntry= new Select(country);
		cntry.selectByVisibleText("India");
		Thread.sleep(2000);
		
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600089");
		
		Thread.sleep(10000);
		driver.findElementById("userRegistrationForm:statesName").click();
		
		Thread.sleep(20000);
		//selecting value in the city/town drop down
		WebElement city= driver.findElementById("userRegistrationForm:cityName");
		Select cityTown= new Select(city);
		cityTown.selectByVisibleText("Kanchipuram");
		
		Thread.sleep(20000);
		//selecting value in the postOffice drop down
		WebElement postOffice= driver.findElementById("userRegistrationForm:postofficeName");
		Select postoffc= new Select(postOffice);
		postoffc.selectByVisibleText("Nandambakkam Kudiyiruppu S.O");
		
		//finding phone
		driver.findElementById("userRegistrationForm:landline").sendKeys("033-897897");
		
		//clicking on the radio button to copy address 
		driver.findElementById("userRegistrationForm:resAndOff:0").click();
		
		System.out.println("assignment completed");
		
		
	}

}
