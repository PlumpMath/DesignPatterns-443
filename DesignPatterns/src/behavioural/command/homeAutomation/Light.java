package behavioural.command.homeAutomation;

/**
 * Created by thomas on 08/03/15.
 */
public class Light {
    private int previousState = 0;
    private int currentState = 0;
    public Light() {}

    public void on() {
        System.out.println("Lights went on!");
        previousState = currentState;
        currentState = 1;
    }

    public void off() {
        System.out.println("Lights went off!");
        previousState = currentState;
        currentState = 0;
    }

    public int getPreviousState() {
        return previousState;
    }
}
