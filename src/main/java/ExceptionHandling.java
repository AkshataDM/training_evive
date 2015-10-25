/**
 * Created by akshata on 25/10/15.
 */
import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class ExceptionHandling {
    private List<Integer> list;
    private static final int SIZE = 10;

    public ExceptionHandling() {

    list = new ArrayList<Integer>(SIZE);
        for(int i=0;i<SIZE;i++)
            list.add(new Integer(i));

    }

    public void writeList() {
    try {
        for(int i=0; i<=SIZE;i++)
            System.out.println(list.get(i));

    }
    catch(ArrayIndexOutOfBoundsException cause) {
        StackTraceElement elements[] = cause.getStackTrace();
        for (int i = 0, n = elements.length; i < n; i++) {
            System.err.println(elements[i].getFileName()
                    + ":" + elements[i].getLineNumber()
                    + ">> "
                    + elements[i].getMethodName() + "()");
        }
    }

    }

    public void tryResources(String zipFileName,
                             String outputFileName)
            throws java.io.IOException {
        java.nio.charset.Charset charset =
                java.nio.charset.StandardCharsets.US_ASCII;
        java.nio.file.Path outputFilePath =
                java.nio.file.Paths.get(outputFileName);
      /*  try (
                java.util.zip.ZipFile zf =
                        new java.util.zip.ZipFile(zipFileName);
                java.io.BufferedWriter writer =
                        java.nio.file.Files.newBufferedWriter(outputFilePath, charset)
        ) {
            // Enumerate each entry
            for (java.util.Enumeration entries =
                 zf.entries(); entries.hasMoreElements();) {
                // Get the entry name and write it to the output file
                String newLine = System.getProperty("line.separator");
                String zipEntryName =
                        ((java.util.zip.ZipEntry)entries.nextElement()).getName() +
                                newLine;
                writer.write(zipEntryName, 0, zipEntryName.length());
            }
        }
  */  }
    }

