package yiwa.springday_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

public class Instrumentalist implements Performer {
    @Value("两只老鼠")
    private String song;

    @Autowired
    @Qualifier("guitar")
    private Instrument instrument;
    @Override
    public void perform() {
        System.out.println("playing "+song+" :");
        instrument.play();
    }
    public void setSong(String song){
        System.out.println("注入歌曲");
        this.song=song;
    }
}
