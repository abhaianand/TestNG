package Annotations;

import org.testng.annotations.*;

public class C1_BFC_and_AFC {

    //TC1
    //login
    //search
    //logout

    //TC2
    //login
    //cart
    //logout

    //before and after class run before all the test and after test , even if we have multiple test inside the class the before/after test do not account it just like beofre/afer method
    //it run only one times but bf/af methods run for every @test bf and after
    @BeforeClass
    void login(){
        System.out.println("login");
    }
    @Test(priority = 1)
    void search(){
        System.out.println("search");
    }
    @AfterClass
    void logout(){
        System.out.println("logout");
    }
    @Test(priority = 2)
    void cart(){
        System.out.println("cart");
    }


}
