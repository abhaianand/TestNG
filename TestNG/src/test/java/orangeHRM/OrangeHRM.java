package orangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class OrangeHRM {
    //verify the logo
    // verify login
    // verify logout
    //close web
    WebDriver driver = new ChromeDriver();
    @Test(priority = 1)
      void logo(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        boolean logopresent = driver.findElement(By.xpath("//img[@alt=\"company-branding\"]")).isDisplayed();
    }
    @Test(priority = 2)
      void login(){

        driver.findElement(By.xpath("//input[@name=\"username\"]")).sendKeys("Admin"); //user id
        driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123"); // password
        driver.findElement(By.xpath("//button[text()=\" Login \"]")).click();
        String actual_titile =  driver.getTitle();
        String expceted_title = "OrangeHRM";
        System.out.println(actual_titile);
    }
    @Test(priority = 3)
     void logout(){
        driver.findElement(By.xpath("//span[@class=\"oxd-userdropdown-tab\"]")).click();
        //a[text()="Logout"]
        driver.findElement(By.xpath("//a[text()=\"Logout\"]")).click();
    }
    @Test(priority = 4)
    void quit_browser(){
        driver.close();
    }
}
