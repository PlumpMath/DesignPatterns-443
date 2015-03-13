package other.mvc.hello;


public class HelloMain {
    public static void main(String[] args) {
        HelloModel model = new HelloModel();
        HelloView view = new HelloView(model);
        HelloController controller = new HelloController(model, view);

        view.setVisible(true);
    }
}
