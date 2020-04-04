package yiwa.springday_5_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
//使用事务
public class Demo3 {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement pst=null;
        try {
            conn=JDBCUtils.getConn();
            conn.setAutoCommit(false);
            String sql="update account set funds=funds-100000 where id='1'";
            pst=conn.prepareStatement(sql);
            pst.executeUpdate();
            String sql1="update account set funds=funds+100000 where id='2'";
            pst=conn.prepareStatement(sql1);
            pst.executeUpdate();
            conn.commit();
            System.out.println("转账成功");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
