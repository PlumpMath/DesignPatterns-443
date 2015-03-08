package creational.factory.factoryMethod;

/**
 * Created by thomas on 08/03/15.
 */
public class Client {
    public static void main(String[] args) {
        PizzaStore berlinPizzaStore = new BerlinPizzaStore();
        Pizza pizza = berlinPizzaStore.orderPizza("vegan");
        System.out.println("We got a " + pizza.getName());

        System.out.println("---");

        PizzaStore nyStore = new NyPizzaStore();
        Pizza nyPizza = nyStore.orderPizza("cheese");
        System.out.println("We got a " + pizza.getName());
    }
}
