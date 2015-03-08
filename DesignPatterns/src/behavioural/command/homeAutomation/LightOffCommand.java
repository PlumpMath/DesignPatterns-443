package behavioural.command.homeAutomation;

/**
 * Created by thomas on 08/03/15.
 */
public class LightOffCommand implements Command {
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        int previousState = light.getPreviousState();
        if(previousState == 0){
            light.off();
        }
        else {
            light.on();
        }
    }
}
