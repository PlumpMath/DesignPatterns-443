package other.mvc.hello;

public class HelloModel {
    private final String INITIAL_VALUE = "Hello";
    private String theText;

    public HelloModel() {
        reset();
    }

    public void reset() {
        theText = INITIAL_VALUE;
    }

    public void setTheText(String newText) {
        this.theText = newText;
    }

    public String getTheText() {
        return this.theText;
    }
}
