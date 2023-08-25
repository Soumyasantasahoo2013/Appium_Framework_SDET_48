package DriverMethods;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class DriverMethodTest {
	
	@Test
	public void driverMethod() throws Throwable
	{
        File f=new File("C:\\Users\\Soumya Santa\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		
		AppiumDriverLocalService service=new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1")
				.usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
		
		service.start();
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy M30s");
		dc.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
		dc.setCapability(MobileCapabilityType.UDID, "RZ8M83ZJH2W");
		dc.setCapability("appPackage", "io.appium.android.apis");
		dc.setCapability("appActivity", ".ApiDemos");
//		dc.setCapability("unlockType", "password");
//		dc.setCapability("unlockKey", "xyz@1234");
		
		URL u=new URL("http://localhost:4723");
		
		AndroidDriver driver=new AndroidDriver(u,dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Installing App
        //driver.installApp("apk file path");
		
		//verify app is installed or not
        //System.out.println(driver.isAppInstalled("io.appium.android.apis"));
		
		//Uninstall the app
        //driver.removeApp("package name");
		
		//Run app in background
		//driver.runAppInBackground(Duration.ofSeconds(30));
		
		//Verify wheather app running in Background
		//System.out.println(driver.queryAppState("packageName"));
		
		//Orientation
		ScreenOrientation s=driver.getOrientation();
		driver.rotate(s.PORTRAIT);
		
		driver.openNotifications();
		driver.hideKeyboard();
		driver.isDeviceLocked();
		
		//Context Handle
		driver.getContextHandles();
		driver.context(null);
	}

}
