package creational.singleton;

/**
 * Created by thomas on 28/02/15.
 */
public class ASingleton {
    private static ASingleton instance = null;

    private ASingleton() {}

    public static ASingleton getInstance() {
        if(instance == null) {
            instance = new ASingleton();
        }

        return instance;
    }

    private String infoText;

    public String getInfoText() {
        return infoText;
    }

    public void setInfoText(String infoText) {
        this.infoText = infoText;
    }


}
