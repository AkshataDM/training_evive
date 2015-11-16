/**
 * Created by akshata on 31/10/15.
 */
public class SubclassThread extends Thread {
    public void run() {
        System.out.println("Extends thread");
    }

    public static void main(String[] args) {
        (new SubclassThread()).start();
    }
}
