package creational.factory;

/**
 * Created by thomas on 05/03/15.
 */
public class Zombie extends Monster {
    public Zombie() {
    }

    @Override
    public void message() {
        System.out.println("I am a Zombie");
    }
}
