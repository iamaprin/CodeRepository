/**
 * /code1122/ConnectionDemo1.java
 * author: ZhuKuanxin
 * date: 2015/11/23
 * time: 19:34
 * description:
 */
package code1123;

import java.sql.*;

public class ConnectionDemo1 {
    public static final String DRIVE = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/default";
    public static final String USER = "root";
    public static final String PAAWORD = "";

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM default";

        try {
            Class.forName(DRIVE);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        conn = DriverManager.getConnection(URL, USER, PAAWORD);
        System.out.println(conn);

        stmt = conn.createStatement();
        rs =  stmt.executeQuery(sql);

        while (rs.next()) {
            System.out.println(rs.getString("default"));
        }

        //close
        stmt.close();
        conn.close();
    }

}