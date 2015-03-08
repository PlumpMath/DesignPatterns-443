package creational.factory.factoryMethod;

/**
 * Created by thomas on 08/03/15.
 */
public class NYStyleMeatPizza extends Pizza {
    public NYStyleMeatPizza() {
        name = "NY Style Sauce and Meat Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";

        toppings.add("Salami");
        toppings.add("Grated Reggiano Cheese");
    }
}
