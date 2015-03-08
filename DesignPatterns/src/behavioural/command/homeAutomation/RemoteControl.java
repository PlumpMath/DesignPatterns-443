package behavioural.command.homeAutomation;

import java.util.ArrayList;

/**
 * Created by thomas on 08/03/15.
 */
public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;
    ArrayList<Command> undoCommands = new ArrayList<Command>();

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        // using a Null Object to avoid having to handle null references
        Command noCommand = new NoCommand();
        for (int i = 0; i < onCommands.length; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
    }

    public void setCommant(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommands.add(onCommands[slot]);
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommands.add(offCommands[slot]);
    }

    public void undoButtonWasPushed() {
        if(undoCommands.size() > 0) {
            undoCommands.get(undoCommands.size() - 1).execute();
            undoCommands.remove(undoCommands.size() - 1);
        }
    }

    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("\n----- Remote Control -----\n");
        for (int i = 0; i < onCommands.length; i++) {
            buffer.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
        }

        buffer.append("undo stack: \n");
        for(Command command : undoCommands) {
            buffer.append(command.getClass().getName() + "\n");
        }

        return buffer.toString();
    }
}
