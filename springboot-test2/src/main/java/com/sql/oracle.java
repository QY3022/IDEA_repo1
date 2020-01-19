package com.sql;

import java.sql.*;

/**
 * @author QY3022
 */
public class oracle {

    /**
     * 连接mysql数据库查询单个表所占空间大小
     */
    public void queryAllSpace() {
        //声明Connection对象
        Connection con;
        //驱动程序名
        String driver = "oracle.jdbc.driver.OracleDriver";
        //URL指向要访问的数据库名mydata
        String url = "jdbc:oracle:thin:@nhc.smart-info.cn:8521:orcl?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        //MySQL配置时的用户名
        String user = "c##dgioc";
        //MySQL配置时的密码
        String password = "bigdata@0769";
        //遍历查询结果集
        try {
            //加载驱动程序
            Class.forName(driver);
            //1.getConnection()方法，连接MySQL数据库！！
            con = DriverManager.getConnection(url, user, password);
            if (!con.isClosed()) {
                System.out.println("Succeeded connecting to the Database!");
            }
            //要执行的SQL语句
            String allSpaceSql = "SELECT segment_name AS TABLENAME," +
                    "BYTES / 1024 / 1024 MB" +
                    "FROM user_segments" +
                    "WHERE segment_name = 'BI_REPORT_DATA'";
            //2.创建statement类对象，用来执行SQL语句！！
            Statement statement = con.createStatement();
            //3.ResultSet类，用来存放获取的结果集！！
            ResultSet rs = statement.executeQuery(allSpaceSql);
            Double allSpace = 0.00;
            while (rs.next()) {
                String mb = rs.getString("MB");
                allSpace = Double.parseDouble(mb);
            }
            System.out.println(allSpace);
            rs.close();
            con.close();
        } catch (ClassNotFoundException e) {
            //数据库驱动类异常处理
            System.out.println("Sorry,can`t find the Driver!");
            e.printStackTrace();
        } catch (SQLException e) {
            //数据库连接失败异常处理
            System.out.println("数据库连接失败异常处理");
            e.printStackTrace();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Exception");
            e.printStackTrace();
        } finally {
            System.out.println("数据库数据成功获取！！");
        }
    }

    public static void main(String[] args) {
        oracle o = new oracle();
        o.queryAllSpace();
    }
}
