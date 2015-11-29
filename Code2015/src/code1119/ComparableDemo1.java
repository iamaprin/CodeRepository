/**
 * /code1119/Student.java
 * author: ZhuKuanxin
 * date: 2015/11/19
 * time: 21:27
 * description:
 */
package code1119;

import java.util.Arrays;

class Student implements Comparable<Student>{

    private String name;
    private int age;
    private float score;

    public Student(String name, float score, int age) {
        this.name = name;
        this.score = score;
        this.age = age;
    }

    public String toString() {
        return name + "\t\t" + age + "\t\t" + score;
    }

    @Override
    public int compareTo(Student stu) {
        if (this.score > stu.score) {
            return -1;
        } else if (this.score < stu.score) {
            return 1;
        } else {
            if (this.age > stu.age) {
                return 1;
            } else if(this.age < stu.age) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}

public class ComparableDemo1 {
    public static void main(String[] args) {
        Student[] stus = {new Student("zhangsan", 90.0f, 20),
                new Student("lisi", 90.0f, 22),
                new Student("wangwu", 99.0f, 20),
                new Student("zhaoliu", 70.0f, 20),
                new Student("sunqi", 100.0f, 22)};

        Arrays.sort(stus);
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i]);
        }
     }
}

