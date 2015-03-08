package creational.factory.monsterFactory;

/**
 * Created by thomas on 05/03/15.
 */
public class Alien extends Monster{
    public Alien() {}

    @Override
    public void message() {
        System.out.println("I am an Alien!");
    }
}
