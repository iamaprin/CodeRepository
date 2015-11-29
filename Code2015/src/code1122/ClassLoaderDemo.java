/**
 * /code1122/ClassLoaderDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/22
 * time: 20:46
 * description:
 */
package code1122;

public class ClassLoaderDemo {

    public static void main(String[] args) {
        Person stu = new Person();
        System.out.println(stu.getClass().getClassLoader().getClass().getName());

    }
}