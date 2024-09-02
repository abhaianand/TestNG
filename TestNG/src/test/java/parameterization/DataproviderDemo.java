package parameterization;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.time.Duration;
public class DataproviderDemo {
    WebDriver driver;
    @BeforeClass
    void setup(){

        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");

    }
    @Test(dataProvider = "login_data_provider")
    void TestLogin(String email,String password) throws InterruptedException {

        driver.findElement(By.xpath("//input[@id=\"input-email\"]")).clear();
        driver.findElement(By.xpath("//input[@id=\"input-password\"]")).clear();
        driver.findElement(By.xpath("//input[@id=\"input-email\"]")).sendKeys(email); //user id
        driver.findElement(By.xpath("//input[@id=\"input-password\"]")).sendKeys(password); //password
        driver.findElement(By.xpath("//input[@type=\"submit\"]")).click(); //login button
        Thread.sleep(3000);
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "My Account";
        Assert.assertEquals(expectedTitle,actualTitle);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"column-right\"]/div/a[13]")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();

    }
    @AfterClass
    void tearDown(){
        driver.quit();
    }

    @DataProvider(name = "login_data_provider")
    Object[][] loginData(){

        Object data [][] = { {"abc@gmail.com","test@123"},
                              {"xyz@gmail.com","test123"},
                             {"babu@gmail.com","noway@123"},
                           {"pavanol123@gmail.com","test@123"}};
        return data;
// the reason we dont use string as datatype because ,as test data there is a possibility for string,int and all type of data
        //the object can hold any type of data
    }
}
