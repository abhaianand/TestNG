package DependencyMethods;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency {
    //open app
    //login
    //search
    //logout
@Test(priority = 1)
    void openapp(){
        System.out.println("open app successfully");
    Assert.assertTrue(true);
    }
    @Test(priority = 2,dependsOnMethods = {"openapp"})
    void login(){
        System.out.println("login  successfully");
        Assert.assertTrue(true);
    }
    @Test(priority = 3,dependsOnMethods = {"login"})
    void search(){
        System.out.println("search  successfully");
        Assert.assertTrue(false);

    }
    @Test(priority = 4,dependsOnMethods = {"login","search"})
    void advsearch(){
        System.out.println("search  successfully");
        Assert.assertTrue(true);

    }
    @Test(priority = 5,dependsOnMethods = {"login"})
    void logout(){
        System.out.println("logout  successfully");
        Assert.assertTrue(true);
    }
}
