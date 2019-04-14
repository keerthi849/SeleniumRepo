package com.selenium.elements.practise;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputBox {
	
	@Test
	public void testInputBox() throws InterruptedException {
		//System.setProperty(ChromeDriver.SystemProperty.BROWSER_LOGFILE, "null");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Keerthi\\Documents\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.rediff.com/");
		driver.get("https://www.amazon.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		/*//clicking on login
		driver.findElement(By.xpath("//*[@id='signin_info']/a[1]")).click();
		
		//Registering as a user
		//clicking on create a new account
		driver.findElement(By.xpath("//div[@class='create-new-account f15 alignC bold']/a")).click();
		
		//Filling the text boxes
		String createUserText=driver.findElement(By.xpath("//td[text()='Create a Rediffmail account']")).getText();
	    System.out.println(createUserText);
	    
	    //username 
	    driver.findElement(By.xpath("//table[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("Keerthi");
	    
	    //email
	    driver.findElement(By.xpath("//input[starts-with(@name,'login') and @type='text']")).sendKeys("keerthi");
	    
	    //check availability
	    driver.findElement(By.xpath("//input[starts-with(@name,'btnchkavail') and @type='button']")).click();
	    
	    //Fetch the elements that are suggested for email
	    List<WebElement> emailOptions=driver.findElements(By.xpath("//div[@id='recommend_text']/table/tbody/tr/td[2]"));
	    
	    for(WebElement ele:emailOptions) {
	    	System.out.println(ele.getText());
	    }
	    
	    Assert.assertTrue(emailOptions.size()>0);
	    
	    //check box
        String altText=driver.findElement(By.xpath("//div[@id='altid_msg']")).getText();
        System.out.println(altText);
        
        //click the checkbox
        boolean enabled=driver.findElement(By.xpath("//input[starts-with(@name,'chk_altemail') and @type='checkbox']")).isSelected();
        System.out.println(enabled);
        if(!enabled) {
        	driver.findElement(By.xpath("//input[starts-with(@name,'chk_altemail') and @type='checkbox']")).click();
        }
        
        //Drop Down
        WebElement dropDown=driver.findElement(By.xpath("//select[starts-with(@name,'hint')]"));
        Select s=new Select(dropDown);
        
        List<WebElement> options=s.getOptions();
        System.out.println(options.size());
        
        for(WebElement ele:options) {
        	System.out.println(ele.getText());
        }
        
        s.selectByVisibleText("What is the name of your first school?");
        System.out.println(s.getFirstSelectedOption().getText());
        
        //Gender radios
        boolean isGenderFemaleSelected=driver.findElement(By.xpath("//input[starts-with(@name,'gender') and @value='f']")).isSelected();
        System.out.println("Gender selected F:"+isGenderFemaleSelected);
        
        boolean isGenderMaleSelected=driver.findElement(By.xpath("//input[starts-with(@name,'gender') and @value='m']")).isSelected();
        System.out.println("Gender selected M:"+isGenderMaleSelected);

	    //select Female
        driver.findElement(By.xpath("//input[starts-with(@name,'gender') and @value='f']")).click();
        
        isGenderFemaleSelected=driver.findElement(By.xpath("//input[starts-with(@name,'gender') and @value='f']")).isSelected();
        System.out.println("Gender selected F:"+isGenderFemaleSelected);
        
        isGenderMaleSelected=driver.findElement(By.xpath("//input[starts-with(@name,'gender') and @value='m']")).isSelected();
        System.out.println("Gender selected M:"+isGenderMaleSelected);
        
        //Select country
        driver.findElement(By.xpath("//select[starts-with(@name,'country')]")).sendKeys("United States");
	    WebElement countryDropDown=driver.findElement(By.xpath("//select[starts-with(@name,'country')]"));
	    Select country=new Select(countryDropDown);
	    country.selectByVisibleText("Thailand");*/
	    
	    //Amazon Automating Menu
	    //clicking on the menu on the left
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		
		List<WebElement> menuItems=driver.findElements(By.xpath("//ul[@class='hmenu  hmenu-visible']/li/a/div"));
		System.out.println(menuItems.size());
		
		for(WebElement ele:menuItems) {
			System.out.println(ele.getText());
		}
		
		List<WebElement> scrollElements=driver.findElements(By.xpath("//div[@class='a-carousel-col a-carousel-center']/div/ol/li/div/div/div/div/span/a/img"));
		for(WebElement ele:scrollElements) {
			System.out.println(ele.getAttribute("alt"));
		}
		
	}

}
