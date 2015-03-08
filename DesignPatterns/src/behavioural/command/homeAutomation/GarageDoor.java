package behavioural.command.homeAutomation;

/**
 * Created by thomas on 08/03/15.
 */
public class GarageDoor {
    private int previousState = 0;
    private int currentState = 0;

    public GarageDoor() {}

    public void up() {
        System.out.println("Garage door opened");
        previousState = currentState;
        currentState = 1;
    }

    public void down() {
        System.out.println("Garage door closed");
        previousState = currentState;
        currentState = 0;
    }

    public void stop() {
        System.out.println("Door was stopped");
    }

    public void lightOn() {
        System.out.println("GarageDoorLight was turned on");
    }

    public void lightOff() {
        System.out.println("GarageDoorLight was turned off");
    }

    public int getPreviousState() {
        return previousState;
    }
}
