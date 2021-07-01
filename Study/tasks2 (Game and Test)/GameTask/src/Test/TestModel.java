package Test;

import MVC.Model;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class TestModel {
    private static Model m = new Model();
    int i;


    @Test
    public void testRandomizer() {
        while (i != 10000000) {
            m.randomizer();
            int rand = m.getRand();
            Assert.assertNotEquals(rand, 100);
            i++;
        }
        i = 0;

        while (i != 10000000) {
            m.randomizer();
            int rand = m.getRand();
            Assert.assertNotEquals(rand, 0);
            i++;
        }
    }

    @Test
    public void testRandomizer2() {
        while (i != 10000000) {
            m.randomizer();
            int rand = m.getRand();
            boolean b = rand<100;
            Assert.assertTrue(b);
            i++;
        }
        i = 0;

        while (i != 10000000) {
            m.randomizer();
            int rand = m.getRand();
            boolean b = rand>0;
            Assert.assertTrue(b);
            i++;
        }
    }

    @Test
    public void testAdderSmaller() {
        m.setRand(1);
        m.setArg(0);
        m.adder(m.getArg());

        Assert.assertEquals(m.getAnswerNumber(), -1);
    }

    @Test
    public void testAdderBigger() {
        m.setRand(1);
        m.setArg(2);
        m.adder(m.getArg());

        Assert.assertEquals(m.getAnswerNumber(), 1);
    }

    @Test
    public void testAdderEqual() {
        m.setRand(1);
        m.setArg(1);
        m.adder(m.getArg());

        Assert.assertEquals(m.getAnswerNumber(), 0);
    }


    @Test
    public void testAdderPriviouslyAdded(){
        m.setRand(25);
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        m.setList(list);
        m.setArg(1);
        m.adder(m.getArg());

        Assert.assertEquals(m.getAnswerNumber(), 2);
    }

    @Test

    public void testSetBarriers(){
        m.setBarriers(0,1);
        Assert.assertEquals(m.getMax(),1);
        Assert.assertEquals(m.getMin(),0);
    }


}
