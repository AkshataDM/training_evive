/**
 * Created by akshata on 23/10/15.
 */

public class RectangleMain
{
   static int i,j;
    RectangleMain() {
     i = 2; j = 4;
    }
    public static void main(String[] args) {
        RectanglePlus rObj = new RectanglePlus(i,j);
        System.out.println(rObj.getArea());
  
    }
  public static int retArea() {
  return i*j;
  }
    public static int retA()
    { return i; }
    public static int retB() { return  j; }

}
