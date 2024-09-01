package Annotations;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Before_After_method_annotation {

    //lets consider we have two testcase and in each case we have same steps in common , so commom steps we manage with before and after methods
    // in this before and after method, it will repeatedly execute before and after for every @test- how may number of @test we have the before and after
    //will execute same number of time

    //TC1
    //login
    //search
    //logout

    //TC2
    //login
    //cart
    //logout

    @BeforeMethod
    void login(){
        System.out.println("login");
    }

    @Test(priority = 1)
    void search(){
        System.out.println("search");
    }
    @AfterMethod
    void logout(){
        System.out.println("logout");
    }
    @Test(priority = 2)
    void cart(){
        System.out.println("cart");
    }
}
