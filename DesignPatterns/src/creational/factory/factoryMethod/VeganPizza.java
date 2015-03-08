package creational.factory.factoryMethod;

/**
 * Created by thomas on 08/03/15.
 */
public class VeganPizza extends Pizza{
    public VeganPizza() {
        name = "Awesome Vegan Pizza";
        dough = "Traditional italian egg- and milk-free dough";
        sauce = "Tomato Sauce";

        toppings.add("Hummus");
        toppings.add("Broccoli");
        toppings.add("Vegan Cheese");
    }
}
