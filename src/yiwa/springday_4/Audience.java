package yiwa.springday_4;

import org.aspectj.lang.ProceedingJoinPoint;

public class Audience {
    public void takeSeats(){
        System.out.println("观众入席就坐");
    }
    public void turnOffCellPhones(){
        System.out.println("请观众关掉手机");
    }
    public void applaud(){
        System.out.println("观众喝彩");
    }
    public void demandRefound(){
        System.out.println("喝倒彩要求退票");
    }

    public void watchPerformce(ProceedingJoinPoint joinPoint){
        try {
            System.out.println("the audience is taking their seats.");
            System.out.println("the audience is turning off their cellphones.");
            long start =System.currentTimeMillis();
            joinPoint.proceed();
            long end =System.currentTimeMillis();
            System.out.println("CLAP CLAP CLAP CLAP.");
            System.out.println("the performance took "+(end-start)+" milliseconds");
        } catch (Throwable throwable) {
            System.out.println("Boo we want our money back.");
        }

    }
}
