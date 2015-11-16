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
        System.out.println("Area is" + rObj.getArea());
        System.out.println("Perimeter is" + rObj.getPerimeter());
  
    }
  public static int retArea() {
  return i*j;
  }
    public static int retPerimeter() { return 3*(i+j); }
    public static int retA()
    { return i; }
    public static int retB() { return  j; }

}
