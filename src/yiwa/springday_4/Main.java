package yiwa.springday_4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring_day_4.xml");
        Thinker thinker= (Thinker) applicationContext.getBean("volunteer");
        thinker.thinkOfSomething("哈哈哈哈");
    }
}
