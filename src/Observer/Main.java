package Observer;

import java.util.Optional;

public class Main {
    public static void main(String args[]){
        WeatherData weatherData=new WeatherData();
        A a=new A(weatherData);
        B b=new B(weatherData);
        C c=new C(weatherData);
        weatherData.setMeasurements(1,2,3);
    }
}
