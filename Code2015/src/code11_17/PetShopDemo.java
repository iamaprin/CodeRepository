/**
 * CodeRepository/code11_17/PetShopDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/17
 * time: 19:49
 * description:
 */
package code11_17;

public class PetShopDemo {
    public static void main(String args[]) {
        PetShop ps = new PetShop(5);
        ps.add(new Cat("白猫", "白色的", 2));
        ps.add(new Cat("黑猫", "黑色的", 3));
        ps.add(new Cat("花猫", "花色的", 3));
        ps.add(new Dog("拉布拉多", "黄色的", 3));
        ps.add(new Dog("金毛", "金色的", 3));
        ps.add(new Dog("黄狗", "黑色的", 3));
        print(ps.search("黑"));
    }

    public static void print(Pet[] p) {
        for (int i = 0; i < p.length; i++) {
            if (p[i] != null) {
                System.out.println(p[i].getName() + "," +
                        p[i].getColor() + "," + p[i].getAge());
            }
        }
    }
}