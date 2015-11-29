/**
 * CodeRepository/code11_18/RuntimeDemo1.java
 * author: ZhuKuanxin
 * date: 2015/11/18
 * time: 20:29
 * description:
 */
package code11_18;

public class RuntimeDemo1 {

    public static void main(String[] args) {
        Runtime runtime  = Runtime.getRuntime();
        System.out.println("JVM最大内存量: " + runtime.maxMemory());
        System.out.println("JVM空闲内存量: " + runtime.freeMemory());

        String str = "Hello " + "World " + "!!!" +
                "\t" + "Welcome " + "To " + "MLDN" + "~";
        System.out.println(str);

        for (int i = 0; i < 1000; i++) {
            str += i;
        }
        System.out.println("JVM最大内存量: " + runtime.maxMemory());
        System.out.println("JVM空闲内存量: " + runtime.freeMemory());

        runtime.gc();
        System.out.println("JVM最大内存量: " + runtime.maxMemory());
        System.out.println("JVM空闲内存量: " + runtime.freeMemory());

    }
}