package Annotations.BforeSuite;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CS1 {
    //go to xml file
    @Test
    void abc(){
        System.out.println("method1");
    }
    @BeforeTest

    void efg(){
        System.out.println("Before Test");
    }
    @AfterTest

    void efg2(){
        System.out.println("After Test");
    }

}


