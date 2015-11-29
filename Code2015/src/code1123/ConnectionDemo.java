/**
 * /code1122/ConnectionDemo.java
 * author: ZhuKuanxin
 * date: 2015/11/23
 * time: 19:23
 * description:
 */
package code1123;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDemo {

    public static final String DRIVE = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/mysql";
    public static final String USER = "root";
    public static final String PAAWORD = "";

    public static void main(String[] args) {
        Connection conn = null;
        try {
            Class.forName(DRIVE);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        try {
            conn = DriverManager.getConnection(URL, USER, PAAWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        System.out.println(conn);

        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}