/**
 * /code1122/ConstructorEnum.java
 * author: ZhuKuanxin
 * date: 2015/11/22
 * time: 20:10
 * description:
 */
package code1122;

enum Color {
    RED("红色"), GREEN("绿色"), BLUE("蓝色");
    private Color(String name) {
        setName(name);
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class ConstructorEnum {

    public static void main(String[] args) {
        for (Color c : Color.values()) {
            System.out.println(c.ordinal() + "-->" +
                    c.name() + "(" + c.getName() + ")");
        }
    }
}