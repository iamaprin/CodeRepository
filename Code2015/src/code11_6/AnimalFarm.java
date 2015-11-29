/**
 * CodeRepository/code11_6/AnimalFarm.java
 * author: ZhuKuanxin
 * date: 2015/11/6
 * time: 19:58
 */
package code11_6;

public class AnimalFarm {

    public static void main(String[] args) {
        final String pig = "length: 10";
        final String dog = "length: " + pig.length();
        System.out.println("Animals are equal: " + pig==dog);
    }
}
