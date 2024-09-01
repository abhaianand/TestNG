package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Abhai {
    @Test
    void method(){
        String Expected_value = "Haii";
        String Actual_value = "OK";
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(Expected_value, Actual_value);

        System.out.println("hello");
        sa.assertAll(); //mandatory
    }


}
