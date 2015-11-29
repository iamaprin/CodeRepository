/**
 * CodeRepository/code11_18/RuntimeDemo2.java
 * author: ZhuKuanxin
 * date: 2015/11/18
 * time: 20:35
 * description:
 */
package code11_18;

public class RuntimeDemo2 {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        Process process = null;

        try {
            process = runtime.exec("notepad.exe");
            System.out.println(process);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (process != null) {
            process.destroy();
            System.out.println(process);
        }

    }
}