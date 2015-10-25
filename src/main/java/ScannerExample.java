/**
 * Created by akshata on 25/10/15.
 */

import java.io.*;
import java.util.Scanner;
public class ScannerExample {

        public static void main(String[] args) throws IOException {

            Scanner s = null;

            try {
                s = new Scanner(new BufferedReader(new FileReader("input.txt")));
                s.useDelimiter(",\\s*");
                while (s.hasNext()) {
                    System.out.println(s.next());
                }
            } finally {
                if (s != null) {
                    s.close();
                }
            }
        }
    }