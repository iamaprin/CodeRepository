/**
 * CodeRepository/code11_17/SystemMethod.java
 * author: ZhuKuanxin
 * date: 2015/11/17
 * time: 10:22
 * description:
 */
package code11_17;

import java.util.Iterator;
import java.util.Map;

public class SystemMethod {

    public static void main(String[] args) {
        Map<String, String> map = System.getenv();
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            if (key != null) {
                System.out.println(key + ": " + map.get(key));
            }
        }
    }
}