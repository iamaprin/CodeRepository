/**
 * /code1122/FactoryDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/22
 * time: 20:49
 * description:
 */
package code1122;

import com.sun.media.sound.FFT;

interface Fruit {
    public void eat();
}

class Apple implements Fruit {
    @Override
    public void eat() {
        System.out.println("--eat apple--");
    }
}

class Orange implements Fruit {
    @Override
    public void eat() {
        System.out.println("--eat orange--");
    }
}

class Factory {
    public static Fruit getInstance(String className) {
        Fruit fruit = null;
        try {
            fruit = (Fruit) Class.forName(className).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return fruit;
    }
}

public class FactoryDemo {

    public static void main(String[] args) {
        Fruit fruit = Factory.getInstance("code1122.Apple");
        if (fruit != null) {
            fruit.eat();
        }
    }
}