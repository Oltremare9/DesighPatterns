package JAVAObserver;

public class Main {
    public static void main(String args[]){
        WeatherData weatherData=new WeatherData();

        A a=new A(weatherData);
        weatherData.setMeasurements(1,2,3);
        weatherData.setMeasurements(3,2,1);
        weatherData.deleteObserver(a);
        weatherData.setMeasurements(1,2,3);
        weatherData.addObserver(a);
        weatherData.setMeasurements(4,5,6);
        weatherData.deleteObservers();
        weatherData.setMeasurements(1,2,3);
    }
}
