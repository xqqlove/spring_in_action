package yiwa.springday_1;

import java.util.Map;

public class OneManBand1 implements Performer {
    public OneManBand1(){}
    private Map<String ,Instrument> instrumentMap;
    public void setInstrumentMap(Map<String,Instrument> instruments){
        this.instrumentMap=instruments;
    }
    @Override
    public void perform() throws PerformanceException {
       for (String key:instrumentMap.keySet()){
           System.out.println(key+":");
           Instrument instrument=instrumentMap.get(key);
           instrument.play();
       }
    }
}
