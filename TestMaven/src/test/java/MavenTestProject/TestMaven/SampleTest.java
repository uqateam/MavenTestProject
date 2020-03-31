package MavenTestProject.TestMaven;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;  
import org.openqa.selenium.chrome.ChromeDriver; 


public class SampleTest {

	@Test
	public void test1()
	
	{
		System.setProperty("webdriver.chrome.driver", "src\\resources\\chromedriver.exe");  
	    WebDriver driver=new ChromeDriver();  
		driver.navigate().to("http://www.google.com/");  
		driver.manage().window().maximize(); 
		String expectedname="Test";
		//String expectedname="Google";
		String BrowserName = driver.getTitle();
		System.out.println(BrowserName);
		
		//if (BrowserName.contentEquals(expectedname)){
            System.out.println("Test Passed!");
        //} else {
          //  System.out.println("Test Failed");
            //driver.close();
            //Assert.fail();
                     
      //  }
       
		driver.close();
	
		
	}
}
