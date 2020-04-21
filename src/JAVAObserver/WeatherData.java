package JAVAObserver;
import java.util.Observable;
import java.util.Observer;

public class WeatherData extends Observable{
    private float a;
    private float b;
    private float c;
    public WeatherData(){}

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float a,float b,float c){
        this.a=a;
        this.b=b;
        this.c=c;
        measurementsChanged();
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }
}
