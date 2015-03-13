package other.mvc.hello;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelloController {
    private HelloModel model;
    private HelloView view;

    public HelloController(HelloModel model, HelloView view) {
        this.model = model;
        this.view = view;

        view.addShowListener(new SetTextListener());
        view.addClearListener(new ClearListener());
    }

    class SetTextListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String userInput = view.getUserInput();
            model.setTheText(userInput);
            view.setOutput((model.getTheText()));
        }
    }

    class ClearListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            model.reset();
            view.reset();
        }
    }
}
