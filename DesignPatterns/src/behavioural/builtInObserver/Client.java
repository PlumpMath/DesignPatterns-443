package behavioural.builtInObserver;

/**
 * Created by thomas on 07/03/15.
 */
public class Client {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(30, 20, 10);
        weatherData.setMeasurements(30, 30, 10);
    }
}
