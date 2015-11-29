/**
 * /code1119/TestTask.java
 * author: ZhuKuanxin
 * date: 2015/11/19
 * time: 22:29
 * description:
 */
package code1119;

import java.util.Timer;

public class TestTask {

    public static void main(String[] args) {
        Timer timer = new Timer();
        MyTask myTask = new MyTask();
        timer.schedule(myTask, 1000, 2000);
    }
}