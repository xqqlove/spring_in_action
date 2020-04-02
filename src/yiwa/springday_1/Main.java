package yiwa.springday_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring_day_1.xml");
//        Performer performer= (Performer) ctx.getBean("duke");
//        performer.perform();
//        Performer performer1= (Performer) ctx.getBean("poetDuke");
//        performer1.perform();
//        Stage stage= (Stage) ctx.getBean("theStage");
//        stage.display();
        OneManBand1 oneManBand= (OneManBand1) ctx.getBean("bank1");
        oneManBand.perform();
    }
}
