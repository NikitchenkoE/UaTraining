package Test;

import Calculation.Arithmetics;

import junit.framework.Assert;

import org.junit.*;
import org.junit.internal.runners.statements.ExpectException;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class TestArithmetics {

    private static Arithmetics a;

    @Rule
    public final ExpectedException exp =  ExpectedException.none();

    @Rule
    public final Timeout timeout = new Timeout(1000);

    @BeforeClass
    public static void runT() {
        a = new Arithmetics();
    }


    /*
    @After - after each test
    @AfterClass - after all test

    * */
    @Test
    public void testAdd() {
        double res = a.add(3, 7);
        Assert.assertEquals(res, 10.0);
    }

    @Test
    public void testMult() {
        double res = a.mult(3, 7);
        Assert.assertEquals(res, 21.0);
    }

    @Ignore
    @Test
    public void testDeduct() {
        double res = a.deduct(7, 3);
        Assert.assertEquals(res, 4.0);
    }

    @Test
    public void testDiv() {
        double res = a.div(10, 2);
        Assert.assertEquals(res, 5.0);

    }

   // @Test(expected = ArithmeticException.class)
    @Test
    public void testDivEx() {
        exp.expect(ArithmeticException.class);
        a.div(10.0, 0.0);

    }

    //@Test(timeout = 1000)
    @Test
    public void testN(){
        for(;;);
        }
    }



