package TestNG_listners_ExtendReport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.time.Duration;

public class OrangeHRM {
    // verify the logo
    // verify login
    // app url
    //title
    //close web
    WebDriver driver;
    @BeforeClass
    void setup(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @Test(priority = 1)
    void logo() throws InterruptedException {

     Thread.sleep(3000);
        boolean logopresent = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
        Assert.assertEquals(logopresent,true);
    }
    @Test(priority = 2,dataProvider = "datalogin")
    void login(String email,String pass){

        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys(email); //user id
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys(pass); // password
        driver.findElement(By.xpath("//button[text()=\" Login \"]")).click();
    }
    @Test(priority = 3,dependsOnMethods = "login")
    void appurl(){
        String actualcurrenturl = driver.getCurrentUrl();
        String  expectedurl = "ttps://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
        Assert.assertEquals(actualcurrenturl,expectedurl);
    }
    @Test(priority = 4,dependsOnMethods ={"appurl"})
    void testhomepageTitle(){
        String actual_titile =  driver.getTitle();
        String expceted_title = "OrangeHRM";
        Assert.assertEquals(actual_titile,expceted_title);
    }
    @Test(priority = 5,dependsOnMethods ={"testhomepageTitle"})
    void logout() throws InterruptedException {
        driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()=\"Logout\"]")).click();
        Assert.assertEquals(true,true);
    }
    @AfterClass
    void quit_browser(){
        driver.quit();
    }

    @DataProvider(name = "datalogin")
    Object[][] datalogin(){
        Object data[][] = {{"Admin","admin123"}};
        return data;
    }
}
