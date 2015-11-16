/**
 * Created by akshata on 31/10/15.
 */
public class CustomExceptionMain {
    public static void main(String[] args) {
        String x = "Play";
        try {
            if (x.contains("l")) {
                throw new CustomException(x);


            }
        } catch (CustomException ex) {
            System.out.println("The string contains the letter l");
        }
    }
}
