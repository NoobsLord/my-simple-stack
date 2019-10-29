package MySimpleSteak;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import MySimpleSteak.*;
import static org.junit.Assert.*;


public class SimpleSteakImplTest {

    SimpleSteak simpleSteak;

    @Before
    public void setUp() throws Exception {
        simpleSteak = new SimpleSteakImpl();
        System.out.println("Préparation du Bourreau");
    }

    @Test
    public void TestIsEmpty() throws Exception{
        Assert.assertEquals(true, simpleSteak.isEmpty());
        String element1 = "Belzébuth";
        simpleSteak.push(new Item(new String(element1)));
        Assert.assertEquals(false, simpleSteak.isEmpty());
    }

    /**
     * exigence #2
     *
     */
    @Test
    public void TestGetSize() throws Exception{
        Assert.assertEquals(0, simpleSteak.getSize());
        String element1 = "Baphomet";
        simpleSteak.push(new Item(new String(element1)));
        simpleSteak.push(new Item(new String(element1 + " <3")));
        Assert.assertEquals(2, simpleSteak.getSize());
    }

    @Test
    public void push() {
    }

    @Test
    public void peek() {
    }

    @Test
    public void pop() {
    }
}
