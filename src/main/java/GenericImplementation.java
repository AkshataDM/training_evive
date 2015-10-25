import java.util.Arrays;
import java.util.List;

/**
 * Created by akshata on 24/10/15.
 */
public class GenericImplementation {
    public static void main(String[] args) {
        Integer p = 8;
        GenericExample<Integer> i = new GenericExample<Integer>();
        i.set(p);
        System.out.println(i.get());
        List<Integer> li = Arrays.asList(1, 2, 3);
        i.printList(li);
        List<String>  ls = Arrays.asList("one", "two", "three");
        i.printList(ls);
    }
}
