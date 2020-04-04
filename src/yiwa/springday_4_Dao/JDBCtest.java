package yiwa.springday_4_Dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component("jdbc")
public class JDBCtest {
    @Autowired
    private DataSource dataSource;

//    public Student getOne(int stuId){
//
//    }
}
