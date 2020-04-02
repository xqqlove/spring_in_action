package yiwa.springday_2;

import org.springframework.stereotype.Component;

@Component
public class Saxophone implements Instrument {
    @Override
    public void play() {
        System.out.println("萨克斯演唱");
    }
}
