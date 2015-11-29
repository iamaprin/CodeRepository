/**
 * /code1122/ClassArrayDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/22
 * time: 20:41
 * description:
 */
package code1122;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ClassArrayDemo {

    public static void main(String[] args) {
        int[] temp = {1, 2, 3};
        Class<?> c = temp.getClass().getComponentType();
        System.out.println(c.getName());
        System.out.println(Array.getLength(temp));
        System.out.println(Array.get(temp, 0));

        Array.set(temp, 0, 6);
        System.out.println(Array.get(temp, 0));
    }
}