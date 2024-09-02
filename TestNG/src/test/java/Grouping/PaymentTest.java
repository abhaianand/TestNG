package Grouping;

import org.testng.annotations.Test;

public class PaymentTest {
    @Test(priority = 1,groups = {"sanity","regression","functional"})
    void paymentinRupees(){
        System.out.println("payment in Rupees");

    }
    @Test(priority = 2,groups = {"sanity","regression","functional"})
    void paymentinDollars(){
        System.out.println("payment in Dollars");

    }
}
