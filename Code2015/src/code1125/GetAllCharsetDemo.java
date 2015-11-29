/**
 * /code1125/GetAllCharsetDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/25
 * time: 14:49
 * description:
 */
package code1125;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;

public class GetAllCharsetDemo {

    public static void main(String[] args) {
        SortedMap<String, Charset> all = null;
        all = Charset.availableCharsets();
        Iterator<Map.Entry<String, Charset>> iterator = null;
        iterator = all.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Charset> me = iterator.next();
            System.out.println(me.getKey() + "--->" + me.getValue());
        }
    }
}