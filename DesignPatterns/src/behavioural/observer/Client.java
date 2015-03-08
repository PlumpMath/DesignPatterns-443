package behavioural.observer;

/**
 * Created by thomas on 07/03/15.
 */
public class Client {
    public static void main(String[] args) {
        WeatherData wd = new WeatherData();
        new CurrentConditionsDisplay(wd);
        new PressureDisplay(wd);

        wd.setMeasurements(30, 60, 20);
        wd.setMeasurements(29, 40, 20);
        wd.setMeasurements(2, 10, 20);
    }
}
