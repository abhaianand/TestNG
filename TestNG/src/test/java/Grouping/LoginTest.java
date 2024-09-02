package Grouping;

import org.testng.annotations.Test;

public class LoginTest {
    @Test(priority = 1,groups = {"sanity"})
    void LoginByEmail (){
        System.out.println("this is login by email");

    }

    @Test(priority = 2,groups = {"sanity"})
    void LoginByFacebook (){
        System.out.println("this is login by Facebook");

    }
    @Test(priority = 3,groups = {"sanity"})
    void LoginByTwitter (){
        System.out.println("this is login by Twitter");

    }


}
