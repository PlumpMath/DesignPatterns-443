package behavioural.command.homeAutomation;

import java.util.ArrayList;

/**
 * Created by thomas on 08/03/15.
 */
public class RemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        GarageDoor door = new GarageDoor();
        GarageDoorOpenCommand doorOpen = new GarageDoorOpenCommand(door);
        GarageDoorCloseCommand doorClose = new GarageDoorCloseCommand(door);

        remote.setCommant(0, lightOn, lightOff);
        remote.setCommant(1, doorOpen, doorClose);

        System.out.println(remote.toString());

        remote.onButtonWasPushed(0);
        remote.offButtonWasPushed(0);
        remote.undoButtonWasPushed();
        remote.onButtonWasPushed(1);
        remote.offButtonWasPushed(1);
        remote.undoButtonWasPushed();
        remote.undoButtonWasPushed();
        remote.undoButtonWasPushed();
        remote.undoButtonWasPushed();
        System.out.println(remote.toString());

    }
}
