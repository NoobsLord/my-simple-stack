package MySimpleSteak;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class SimpleSteakImplTest {
    @Deployment
    public static JavaArchive createDeployment() {
        return ShrinkWrap.create(JavaArchive.class)
                .addClass(SimpleSteakImpl.class)
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Before
    public void setUp() throws Exception {
        simpleStack = new SimpleSstackImpl();
        System.out.println("Préparation du Bourreau");
    }

    @Test
    public void TestIsEmpty() throws Exception{
        Assert.assertEquals(true, simpleStack.isEmpty());
        String element1 = "Belzébuth";
        simpleStack.push(new Item(new String(element1)));
        Assert.assertEquals(false, simpleStack.isEmpty());
    }

    @Test
    public void TestGetSize() throws Exception{
        Assert.assertEquals(0, simpleStack.getSize());
        String element1 = "Baphomet";
        simpleStack.push(new Item(new String(element1)));
        simpleStack.push(new Item(new Sting(element1 + " <3")));
        Assert.assertEquals(2, simpleStack.getSize());
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
