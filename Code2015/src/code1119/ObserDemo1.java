/**
 * /code1119/ObserDemo1.java
 * author: ZhuKuanxin
 * date: 2015/11/19
 * time: 21:53
 * description: 观察者模式
 */
package code1119;

import java.util.Observable;
import java.util.Observer;

class House extends Observable {
    private float price;

    public House(float price) {
        this.price = price;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        setChanged();
        notifyObservers(price);
        this.price = price;
    }

    public String toString() {
        return "房子价格为: " + price;
    }
}

class HousePriceObserver implements Observer {
    private String name;

    public HousePriceObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof Float) {
            System.out.println(name + "观察到价格更改为: " +
                    ((Float) arg).floatValue());
        }
    }
}

public class ObserDemo1 {

    public static void main(String[] args) {
        House h = new House(1000000);
        HousePriceObserver hpo1 = new HousePriceObserver("A");
        HousePriceObserver hpo2 = new HousePriceObserver("B");
        HousePriceObserver hpo3 = new HousePriceObserver("B");

        h.addObserver(hpo1);
        h.addObserver(hpo2);
        h.addObserver(hpo3);

        System.out.println(h);
        h.setPrice(900000);
        System.out.println(h.countObservers());
        System.out.println(h.hasChanged());
        System.out.println(h);
    }
}