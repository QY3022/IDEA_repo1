package com.sql;

import java.sql.*;

public class mysql {
    public static void main(String[] args) {
        Connection con;
        //驱动程序名
        String driver = "com.mysql.jdbc.Driver";
        //URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://localhost:3306/test1?useUnicode=true&characterEncoding=utf-8&useSSL=false";
        //MySQL配置时的用户名
        String user = "root";
        //MySQL配置时的密码
        String password = "mysql";
        //遍历查询结果集
        try {
            //加载驱动程序
            Class.forName(driver);
            //1.getConnection()方法，连接MySQL数据库！！
            con = DriverManager.getConnection(url,user,password);
            if(!con.isClosed()){
                System.out.println("Succeeded connecting to the Database!");
            }
            //要执行的SQL语句
            String sql = "select * from user";
            //2.创建statement类对象，用来执行SQL语句！！
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            //3.ResultSet类，用来存放获取的结果集！！
            ResultSet rs = preparedStatement.executeQuery();
            String id = null;
            String username = null;
            Double rows = 0.00;
            while(rs.next()){
                //获取stuname这列数据
                id = rs.getString("id");
                //获取stuid这列数据
                username = rs.getString("username");
                //输出结果
                System.out.println(id + " : " + username);
                rows++;
            }
            rows =(double) Math.round(rows*100) / 100;
            System.out.println(rows);
            rs.close();
            con.close();
        } catch(ClassNotFoundException e) {
            //数据库驱动类异常处理
            System.out.println("Sorry,can`t find the Driver!");
            e.printStackTrace();
        } catch(SQLException e) {
            //数据库连接失败异常处理
            e.printStackTrace();
        }catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            System.out.println("数据库数据成功获取！！");
        }
    }
}
