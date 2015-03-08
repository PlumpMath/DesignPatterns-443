package structural.decorator.coffeeDecorator;

/**
 * Created by thomas on 08/03/15.
 */
public abstract class Beverage {
    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
