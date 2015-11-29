/**
 * /code1122/GetClassDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/22
 * time: 20:25
 * description:
 */
package code1122;

class X {

}

public class GetClassDemo {

    public static void main(String[] args) {
        Class<?> c1 = null;
        Class<?> c2 = null;
        Class<?> c3 = null;

        try {
            c1 = Class.forName("code1122.X");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        c2 = new X().getClass();

        c3 = X.class;
        System.out.println(c1.getName());
        System.out.println(c2.getName());
        System.out.println(c3.getName());

    }
}