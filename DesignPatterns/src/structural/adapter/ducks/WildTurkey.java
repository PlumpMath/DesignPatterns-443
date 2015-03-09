package structural.adapter.ducks;

/**
 * Created by thomas on 09/03/15.
 */
public class WildTurkey implements Turkey{
    @Override
    public void gobble() {
        System.out.println("Gobble gobble!");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying a bit!");
    }
}
