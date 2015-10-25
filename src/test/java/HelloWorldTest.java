import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by akshata on 19/10/15.
 */
public class HelloWorldTest {

    @Test
    public void test1(){
        String str = "Hello World application testing";
        Assert.assertEquals("Hello World application testing", str);
        Assert.assertEquals(HelloWorld.getHelloWorld(), "Hello World");
    }
}
