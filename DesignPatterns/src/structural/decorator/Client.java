package structural.decorator;

/**
 * Created by thomas on 08/03/15.
 */
public class Client {
    public static void main(String[] argas) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ": " + beverage.cost() + "€");

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + ": " + beverage2.cost() + "€");
    }
}
