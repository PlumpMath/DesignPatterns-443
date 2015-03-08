package creational.factoryMethod;

/**
 * Created by thomas on 08/03/15.
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza;

        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // factory method
    abstract Pizza createPizza(String type);
}
