package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertion {

    @Test
    void method(){
        String Expected_value = "Haii";
        String Actual_value = "Haii";
        Assert.assertEquals(Actual_value,Expected_value);
        System.out.println("hello");
    }
}
