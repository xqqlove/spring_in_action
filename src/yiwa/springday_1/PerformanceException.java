package yiwa.springday_1;

public class PerformanceException extends RuntimeException {
    public PerformanceException(){
        super();
    }
    public PerformanceException(String message){
        super(message);
    }
    public PerformanceException(String message, Throwable cause){
        super(message,cause);
    }
    public PerformanceException(Throwable cause){
        super(cause);
    }
}
