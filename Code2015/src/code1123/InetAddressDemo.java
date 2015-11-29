/**
 * /code1122/InetAddressDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/23
 * time: 20:10
 * description:
 */
package code1123;

import java.io.IOException;
import java.net.InetAddress;

public class InetAddressDemo {

    public static void main(String[] args) throws IOException {
        InetAddress localAdd = null;
        InetAddress remoteAdd = null;

        localAdd = InetAddress.getLocalHost();
        remoteAdd  = InetAddress.getByName("zhukuanxin.cn");

        System.out.println(localAdd);
        System.out.println(remoteAdd);
        System.out.println(localAdd.isReachable(5000));
    }
}