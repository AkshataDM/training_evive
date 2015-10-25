
/**
 * Created by akshata on 18/10/15.
 */
public class StringSample {
    public static void main(String args[]) {
    String sample = "HelloHiHolaHey";
        String subSample = sample.substring(2,8);
        System.out.println("Main string" + sample);
        System.out.println("Sub string" + subSample);
        subSample.toUpperCase();
        System.out.println("Sub string in upper case" + subSample);
        boolean a = subSample.equals(sample);
        System.out.println("Are the two strings the same?" + a);
        sample.contains("Hi");
    }
}
