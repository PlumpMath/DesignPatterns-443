package creational.factoryMethod;

/**
 * Created by thomas on 08/03/15.
 */
public class NyPizzaStore extends PizzaStore{

    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        else if(type.equals("meat")) {
            return new NYStyleMeatPizza();
        }
        else {
            return new VeganPizza();
        }
    }
}
