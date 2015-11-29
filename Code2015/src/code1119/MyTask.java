/**
 * /code1119/MyTask.java
 * author: ZhuKuanxin
 * date: 2015/11/19
 * time: 22:27
 * description:
 */
package code1119;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class MyTask extends TimerTask {
    @Override
    public void run() {
        SimpleDateFormat sdf = null;
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        System.out.println("当前系统时间为: " + sdf.format(new Date()));
    }
}