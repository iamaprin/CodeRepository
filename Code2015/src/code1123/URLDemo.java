/**
 * /code1122/URLDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/23
 * time: 20:14
 * description:
 */
package code1123;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Scanner;

public class URLDemo {

    public static void main(String[] args) throws IOException {
        URL url = new URL("http", "zhukuanxin.cn", 80, "/");
        InputStream input = url.openStream();
        Scanner scanner = new Scanner(input);
        scanner.useDelimiter("\n");
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}