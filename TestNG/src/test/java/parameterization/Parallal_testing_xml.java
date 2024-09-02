package parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class Parallal_testing_xml {
    WebDriver driver;
    @BeforeClass
    @Parameters("browser_name")
    void setup(String br){
        switch (br){ //pass the paramenter value from the xml file for cross browser testing
            case "Chrome":driver = new ChromeDriver();break;
            case "Edge": driver = new EdgeDriver();break;
            case "Firefox":driver = new FirefoxDriver();break;
            default: System.out.println("Browser name mismatch");
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @Test(priority = 1)
    void testlogo() throws InterruptedException {
        Thread.sleep(3000);
      boolean logo =  driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
        Assert.assertEquals(logo,true);
    }
    @Test(priority = 2)
    void testingTitle(){
        Assert.assertEquals(driver.getTitle(),"OrangeHRM");
    }
    @Test(priority = 3)
    void testingURL(){
        Assert.assertEquals(driver.getCurrentUrl(),"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @AfterClass
    void tearDown(){
        driver.quit();
    }
}
