package assertion;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int value = calculator.addition(10,22);
        Assert.assertEquals (value,32,"Calculator Assertion Failed");
        int valu2 = calculator.addition (6,3);
        int valu3 = calculator.addition (2,2);
        int valu4 = calculator.addition (1,5);

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals (valu2,9,"1st Calculator Assertion Failed");
        softAssert.assertEquals (valu3,4 ,"2nd Calculator Assertion Failed");
        softAssert.assertEquals (valu4,6,"3rd Calculator Assertion Failed");
        softAssert.assertAll ();
    }
}
