package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    //constructor
    //locators
    //action methods
    WebDriver driver;
    //constructor
    Login (WebDriver driver){
        this.driver = driver;
    }
    //locators
    String textbox_userName_xpath = "//input[@placeholder='Username']";
    String textbox_password_xpath = "//input[@placeholder='Password']";
    String button_login_xpath = "//button[normalize-space()='Login']";
    //action methods
   public void setUserName(String username){
        driver.findElement(By.xpath(textbox_userName_xpath)).sendKeys(username);
    }
   public   void setpassword(String password){
        driver.findElement(By.xpath(textbox_password_xpath)).sendKeys(password);
    }
   public void click_login_button(){
        driver.findElement(By.xpath(button_login_xpath)).click();
    }

}
