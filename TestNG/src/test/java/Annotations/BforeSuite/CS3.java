package Annotations.BforeSuite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CS3 {

    @Test
    void abc3(){
        System.out.println("method3");
    }
    @BeforeSuite

    void suite1(){
        System.out.println("Before suite");
    }

    @AfterSuite

    void suite2(){
        System.out.println("After suite");
    }
}
