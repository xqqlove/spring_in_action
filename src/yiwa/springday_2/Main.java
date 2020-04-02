package yiwa.springday_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext cxt=new ClassPathXmlApplicationContext("spring_day_2.xml");
        Instrumentalist instrumentalist= (Instrumentalist) cxt.getBean("kenny");
        instrumentalist.perform();
    }
}
