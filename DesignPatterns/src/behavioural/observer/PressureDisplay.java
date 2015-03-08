package behavioural.observer;

/**
 * Created by thomas on 07/03/15.
 */
public class PressureDisplay implements Observer, DisplayElement{
    private float pressure;
    private Subject weatherData;

    public PressureDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
        this.display();
    }

    @Override
    public void display() {
        System.out.println("Current barometric pressure is: " + this.pressure + " bar.");
    }
}
