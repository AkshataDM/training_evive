/**
 * Created by akshata on 23/10/15.
 */
import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

public class RectangleMainTest {
    @Test
    public void TestArea() {
    Assert.assertEquals(RectangleMain.retArea(), RectangleMain.retA()*RectangleMain.retB());
    }
}
