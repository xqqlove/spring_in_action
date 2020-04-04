package yiwa.springday_5_JDBC;

import java.sql.*;
import java.util.Objects;

public class JDBCUtils {
    public static Connection getConn(){
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost:3306/my_study?useUnicode=true&characterEncoding=UTF-8";
            String user="root";
            String password="21040408";
            conn= DriverManager.getConnection(url,user,password);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    public static void close(Connection conn, Statement sta){
        if (!Objects.isNull(sta)){
            try {
                sta.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (!Objects.isNull(conn)){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void close(Connection conn, Statement sta, ResultSet resultSet){
        if (!Objects.isNull(resultSet)){
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (!Objects.isNull(sta)){
            try {
                sta.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (!Objects.isNull(conn)){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
