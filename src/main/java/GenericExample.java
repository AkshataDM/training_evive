import java.util.List;

/**
 * Created by akshata on 24/10/15.
 */
public class GenericExample<T> {
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void printList(List<?> list) {
        for (Object e : list) {
            System.out.println(e);
            System.out.println("\n");
        }
    }
}



