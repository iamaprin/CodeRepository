/**
 * /code1122/InstanceDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/22
 * time: 20:35
 * description:
 */
package code1122;

class Person {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "姓名: " + name + ", 年龄: " + age;
    }
}

public class InstanceDemo {

    public static void main(String[] args) {
        Class<?> c = null;
        try {
            c = Class.forName("code1122.Person");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Person person = null;
        try {
            if (c != null) {
                person = (Person)c.newInstance();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        assert person != null;
        person.setName("zhukuanxin");
        person.setAge(22);
        System.out.println(person);
    }
}