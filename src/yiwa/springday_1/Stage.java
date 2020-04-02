package yiwa.springday_1;

public class Stage {
    private Stage(){
    }
    public void display(){
        System.out.println("yiyiyiyyi");
    }
    private static class StageSingletonHolder{
        static Stage instance=new Stage();
    }
    public static Stage getInstance(){
        System.out.println("返回实例");
        return  StageSingletonHolder.instance;
    }
}
