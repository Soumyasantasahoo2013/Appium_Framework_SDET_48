package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void demo()
	{
		WebDriver driver= new ChromeDriver();//*[name()='path' and @class='highcharts-point highcharts-color-0']();
		driver.manage().window().maximize();
	}

}
