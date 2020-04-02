package yiwa.springday_1;

public class Juggler implements Performer {
    private int beanBags=3;
    public Juggler(){}
    public Juggler(int bags){
        this.beanBags=bags;
    }

    @Override
    public void perform() throws PerformanceException {
        System.out.println("{ "+beanBags+"}");
    }
}
