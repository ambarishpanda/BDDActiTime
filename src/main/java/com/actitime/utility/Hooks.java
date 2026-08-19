package com.actitime.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import com.actitime.pages.HomePage;
import com.actitime.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BasePage {

	@Before
	public void setup() throws IOException {
	    Properties p = new Properties();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    initializeDriver();
	    FileInputStream fis = new FileInputStream("./src/main/resources/config.properties");
	    p.load(fis);
	    driver.get(p.getProperty("url"));
	    LoginPage loginPage = new LoginPage(driver);
	    loginPage.loginProcess();
	}

	@After
	public void teardown(Scenario scenario) {
	    if (driver != null) {
	        if (scenario.isFailed()) {
	            TakesScreenshot ts = (TakesScreenshot) driver;
	            byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
	            scenario.attach(
	                    screenshot,
	                    "image/png",
	                    "Failed Screenshot"
	            );
	            File file = ts.getScreenshotAs(OutputType.FILE);
	            Date date = Calendar.getInstance().getTime();
	            String str = date.toString().replaceAll(":", "-");
	            try {
	                File folder = new File("./failedScreenshot");
	                if (!folder.exists()) {
	                    folder.mkdirs();
	                }
	                File destination = new File("./failedScreenshot/" + str + ".png");
	                java.nio.file.Files.copy(
	                        file.toPath(),
	                        destination.toPath(),
	                        java.nio.file.StandardCopyOption.REPLACE_EXISTING
	                );
	            } catch (IOException e) {

	                e.printStackTrace();
	            }
	        }
	        HomePage homePage = new HomePage(driver);
	        homePage.clickOnLogout();
	        driver.quit();
	    }
	}
}