/**
 * /code1122/CodeDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/23
 * time: 20:22
 * description:
 */
package code1123;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class CodeDemo {

    public static void main(String[] args) throws UnsupportedEncodingException {
        String word = "english, 汉字";
        String encodeWord = URLEncoder.encode(word, "UTF-8");
        System.out.println(encodeWord);
        String decodeWord = URLDecoder.decode(encodeWord, "UTF-8");
        System.out.println(decodeWord);
    }
}