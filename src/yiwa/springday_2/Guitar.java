package yiwa.springday_2;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("吉他演奏");
    }
}
