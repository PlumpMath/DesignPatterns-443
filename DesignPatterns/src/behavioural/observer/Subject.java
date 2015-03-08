package behavioural.observer;

/**
 * Created by thomas on 07/03/15.
 */
public interface Subject {
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObservers();
}
