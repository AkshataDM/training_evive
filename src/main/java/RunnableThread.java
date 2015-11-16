/**
 * Created by akshata on 31/10/15.
 */
public class RunnableThread implements Runnable {
 @Override
 public void run() {

     System.out.println("Implements runnable thread");
 }

    public static void main(String[] args) {
        (new Thread(new RunnableThread())).start();
    }

}
