package creational.factory.factoryMethod;

/**
 * Created by thomas on 08/03/15.
 */
public class BerlinPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        if(type.equals("vegan")) {
            return new VeganPizza();
        }
        else {
            return new VeggiePizza();
        }
    }

}
