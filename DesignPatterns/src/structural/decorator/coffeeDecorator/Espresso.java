package structural.decorator.coffeeDecorator;

/**
 * Created by thomas on 08/03/15.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
