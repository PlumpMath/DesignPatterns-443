package creational.factoryMethod;

/**
 * Created by thomas on 08/03/15.
 */
public class VeggiePizza extends Pizza{
    public VeggiePizza() {
        name = "Veggie Pizza";
        dough = "Traditional italian egg- and milk-free dough";
        sauce = "Tomato Sauce";

        toppings.add("Hummus");
        toppings.add("Broccoli");
        toppings.add("Cheese");
    }
}
