/**
 * Created by akshata on 23/10/15.
 */
import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class RectangleMainTest {
    protected int i,j;
    @Before
    public void SetUp(){

        i = 2;
        j = 4;
    }

    @Test
    public void TestArea() {
        Assert.assertEquals(RectangleMain.retArea(), RectangleMain.retA()*RectangleMain.retB());
        Assert.assertEquals(RectangleMain.retPerimeter(), 2*(RectangleMain.retA()+ RectangleMain.retB()));
       // Assert.assertEquals(RectangleMain.retArea(), i*j);
        //Assert.assertEquals(RectangleMain.retPerimeter(), 2*(i+j));
    }
}
