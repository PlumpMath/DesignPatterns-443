package behavioural.command.homeAutomation;

/**
 * Created by thomas on 08/03/15.
 */
public class GarageDoorCloseCommand implements Command {
    private GarageDoor door;

    public GarageDoorCloseCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.down();
    }

    @Override
    public void undo() {

        int previousState = door.getPreviousState();
        if(previousState == 0){
            door.down();
        }
        else {
            door.up();
        }
    }
}
