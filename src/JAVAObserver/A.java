package JAVAObserver;

import java.util.Observable;
import java.util.Observer;

public class A implements Observer ,Display{
    Observable o;
    private float a;
    public A(Observable o){
        this.o=o;
        o.addObserver(this);
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData=(WeatherData)o;
            this.a=weatherData.getA();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("A的a是"+a);
    }
}
