package structural.decorator;

/**
 * Created by thomas on 08/03/15.
 */
public class HouseBlend extends Beverage{

    public HouseBlend() {
        description = "HouseBlend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
