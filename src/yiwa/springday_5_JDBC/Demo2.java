package yiwa.springday_5_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static java.sql.Types.NULL;

public class Demo2 {
    public static void main(String[] args) throws SQLException {
        add();
    }
    public static void add() throws SQLException {
        Connection conn=JDBCUtils.getConn();
        String sql="insert into student(pkid,name,age,sex,school,grade,class,address,phone,email) values" +
                " (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement pst=conn.prepareStatement(sql);

      for (int i=0;i<100;i++) {
          int x=i+20;
          int y=i%2;
          pst.setLong(1,NULL);
          pst.setString(2, "能能");
          pst.setInt(3, x);
          pst.setInt(4, y);
          if (Math.random()%2==0) {
              pst.setString(5, "清华大学");
          }else {
              pst.setString(5, "电子科技大学");
          }
          pst.setInt(6, 4);
          pst.setInt(7, 2);
          pst.setString(8, "中国甘肃");
          pst.setLong(9, 123456);
          pst.setString(10, "438957@qq.com");
          int row = pst.executeUpdate();
      }
        JDBCUtils.close(conn,pst);
    }
}
