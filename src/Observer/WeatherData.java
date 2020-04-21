package Observer;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float a;
    private float  b;
    private float c;

    public WeatherData(){
        observers =new ArrayList();
    }
    @Override
    public void register(Observer o) {
        observers.add(o);
    }

    @Override
    public void remove(Observer o) {
        if(observers.contains(o))
            observers.remove(o);
    }

    @Override
    public void notifyObervers() {
        for(int i=0;i<observers.size();i++) {
            observers.get(i).update(a,b,c);
        }
    }

    public void measureChanged(){
        notifyObervers();
    }

    public void setMeasurements(float a,float b,float c){
        this.a=a;
        this.b=b;
        this.c=c;
        measureChanged();
    }
}
