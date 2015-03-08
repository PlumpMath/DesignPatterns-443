package structural.decorator.streamDecorator;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by thomas on 08/03/15.
 */
public class Client {
    public static void main(String[] args) throws IOException {
        int c;
        try {
            // decorate FIleInputStream with a BufferedInputStream which is then decorated with our custom LowerCaseInputStream
            InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream("/Users/thomas/Desktop/test.txt")));

            while((c = in.read()) > 0) {
                System.out.println((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
