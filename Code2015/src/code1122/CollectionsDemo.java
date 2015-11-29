/**
 * /code1122/CollectionsDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/22
 * time: 13:12
 * description:
 */
package code1122;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsDemo {

    public static void main(String[] args) {
        List<String> all = new ArrayList<String>();
        Collections.addAll(all, "MLDN", "LXH", "mldnjava");

        int point = Collections.binarySearch(all, "LXH");
        System.out.println(point);
        point = Collections.binarySearch(all, "LI");
        System.out.println(point);

        Iterator<String> iterator = all.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + ", ");
        }
    }
}