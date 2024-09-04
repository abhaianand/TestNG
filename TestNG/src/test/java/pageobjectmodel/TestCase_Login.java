package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestCase_Login {
    WebDriver driver;
    @BeforeClass
   public void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test
   public void TestLogin(){
        Login lp = new Login(driver);
        lp.setUserName("Admin");
        lp.setpassword("admin123");
        lp.click_login_button();
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}
