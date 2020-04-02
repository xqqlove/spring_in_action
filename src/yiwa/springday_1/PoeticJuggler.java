package yiwa.springday_1;

public class PoeticJuggler extends Juggler{
  private Peom peom;
  public PoeticJuggler(Peom peom){
      super();
      this.peom=peom;
  }
  public PoeticJuggler(int bags,Peom peom){
      super(bags);
      this.peom=peom;
  }
  public void perform() throws PerformanceException{
      super.perform();
      System.out.println("................");
      peom.recite();
  }
}
