package creational.singleton;

/**
 * Created by thomas on 28/02/15.
 */
public class Client {
    public static void main (String[] args) {

        // egt singleton instance
        ASingleton singleton = ASingleton.getInstance();
        singleton.setInfoText("Hallo");

        // ASingleton laSingleton = new ASingleton(); // this doesn't work, because constructor is private

        // and this is the same instance of ASingleton class
        ASingleton anotherSingleton = ASingleton.getInstance();
        singleton.setInfoText("What???");

        // because singleton and anotherSingleton are actually the same object,
        // "What???" will be printed
        System.out.println(singleton.getInfoText());
    }
}
