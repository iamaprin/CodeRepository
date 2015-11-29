/**
 * /code1119/CloneDemo1.java
 * author: ZhuKuanxin
 * date: 2015/11/19
 * time: 21:16
 * description:
 */
package code1119;


class Person implements Cloneable {
    private String name = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {

        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String toString() {
        return "姓名: " + getName();
    }
}

public class CloneDemo1 {

    public static void main(String[] args) throws CloneNotSupportedException {
        Person p1 = new Person("zhangsan");
        Person p2 = (Person)p1.clone();
        //p2.setName("lisi");
        System.out.println(p1);
        System.out.println(p2);
    }
}