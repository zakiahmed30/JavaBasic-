package assertion;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class TestAssertion {
    public static void main(String[] args) {
        int x = 10;
        int z = 8;
        int a = 15;
        int b = 20;


        Assert.assertEquals (a,b);
        Assert.assertEquals(x,z, "Custom Message Assertion Failed");
        SoftAssert softAssert = new SoftAssert();
        System.out.println("test");
        softAssert.assertEquals (a,b,"1st try Custom Message Assertion Failed");
        softAssert.assertEquals(x,z,"2nd try Custom Message Assertion Failed");
        softAssert.assertAll();







        if(x==z) {
            System.out.println ( "matched" );
        }else {
            System.out.println ("it didnt match");
        }


        }
    }

