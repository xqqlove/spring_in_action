package yiwa.springday_5_JDBC;

import java.sql.*;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");//注册驱动 驱动是数据库开发商实现的java.sql.Driver接口(JDBC)类，
        // 在mysql官网下载
        String url="jdbc:mysql://localhost:3306/my_study?useUnicode=true&characterEncoding=UTF-8";
        String user="root";
        String password="21040408";
        Connection conn= DriverManager.getConnection(url,user,password);
        Statement sta=conn.createStatement();
        String sql="insert into student(name,age,sex,school,grade,class,address,phone,email) values('张飞',24,1,'电子科技大学','3','1','中国北京',1893294324,'2018340@qq.com')";
        String sql1="select * from student";
//        int row=sta.executeUpdate(sql);
        ResultSet row1=sta.executeQuery(sql1);
        ArrayList<Student> students=new ArrayList<>();
        while (row1.next()){
            Student student=new Student();
            student.setPkid(row1.getLong("pkid"));
            student.setName(row1.getString("name"));
            student.setAge(row1.getInt("age"));
            student.setSex(row1.getInt("sex"));
            student.setSchool(row1.getString("school"));
            student.setGrade(row1.getInt("grade"));
            student.setClassName(row1.getInt("class"));
            student.setAddress(row1.getString("address"));
            student.setPhone(row1.getLong("phone"));
            student.setEmail(row1.getString("email"));
            students.add(student);
        }
        for (Student student:students){
            System.out.println(student.toString());
        }
        System.out.println(row1.toString());
        sta.close();
        conn.close();
    }
}
