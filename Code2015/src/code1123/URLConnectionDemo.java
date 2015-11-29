/**
 * /code1122/URLConnectionDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/23
 * time: 20:19
 * description:
 */
package code1123;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionDemo {

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://zhukuanxin.cn");
        URLConnection urlConn = url.openConnection();
        System.out.println(urlConn.getContentLengthLong());
        System.out.println(urlConn.getContentType());
        System.out.println(urlConn.getContentEncoding());
    }
}