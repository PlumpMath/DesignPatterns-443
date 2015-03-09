package structural.adapter.ducks;

/**
 * Created by thomas on 09/03/15.
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        // we need to keep a reference of the turkey we are adapting
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        // turkeys gobble!
        turkey.gobble();
    }

    @Override
    public void fly() {
        // because turkeys only fly short distances, we have to make up for it by flying 5 times
        for(int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
