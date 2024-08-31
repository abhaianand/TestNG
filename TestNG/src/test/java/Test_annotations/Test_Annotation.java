package Test_annotations;
import org.testng.annotations.Test;

public class Test_Annotation {

    //open url
    //login
    //logout
    @Test(priority = 1)
    public static void open_url(){
        System.out.println("open_url successfully");
    }
    @Test(priority = 2)
    public static void login(){
        System.out.println("login successfully");
    }
    @Test(priority = 3)
    public static void logout(){
        System.out.println("logout successfully");
    }

}
