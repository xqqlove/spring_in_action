package yiwa.springday_1;

import java.util.Collection;

public class OneManBand implements Performer {
    public OneManBand(){}
    private Collection<Instrument> instruments;
    @Override
    public void perform() throws PerformanceException {
        for (Instrument item:instruments){
            item.play();
        }
    }
    public void setInstruments(Collection<Instrument> instruments){
        this.instruments=instruments;
    }
}
