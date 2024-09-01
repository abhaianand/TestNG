package Annotations.Before_AfterTest;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class C1 {

    //go to xml file
    @Test
    void abc(){
        System.out.println("C1");
    }
    @BeforeTest

    void efg(){
        System.out.println("BeforeTest");
    }
    @AfterTest

    void efg2(){
        System.out.println("AfterTest");
    }

}
