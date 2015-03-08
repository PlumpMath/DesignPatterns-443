package behavioural.command.homeAutomation;

import creational.abstractFactory.MarinaraSauce;

/**
 * Created by thomas on 08/03/15.
 */
public class CompositeCommand implements Command {
    Command[] commands;

    public CompositeCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for(Command command : commands) {
            command.execute();
        }
    }

    @Override
    public void undo() {
        for(Command command : commands) {
            command.undo();
        }
    }
}
