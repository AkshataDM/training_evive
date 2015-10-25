/**
 * Created by akshata on 11/10/15
 */
import java.lang.annotation.*;
import java.util.logging.Logger;

@Documented
@interface Sample {
    String name();
}
@Sample( name = "Akshata")

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Hello World");
        for(int i=0;i<=10;i++)
            System.out.println(i);
    }


    public static String getHelloWorld() {

        return "Hello World";

    }
}
