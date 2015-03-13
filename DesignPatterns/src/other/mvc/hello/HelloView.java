package other.mvc.hello;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class HelloView extends JFrame {
    HelloModel model;

    //Components
    private JTextField userInputField = new JTextField(20);
    private JTextField outputField = new JTextField(20);
    private JButton showTextButton = new JButton("Show");
    private JButton clearTextButton = new JButton("Reset");


    public HelloView(HelloModel model) {
        this.model = model;

        outputField.setText(model.getTheText());
        outputField.setEditable(false);

        //Layout the components.
        JPanel content = new JPanel();
        content.setLayout(new FlowLayout());
        content.add(new JLabel("Input"));
        content.add(userInputField);
        content.add(showTextButton);
        content.add(new JLabel("Output"));
        content.add(outputField);
        content.add(clearTextButton);

        //finalize layout
        this.setContentPane(content);
        this.pack();

        this.setTitle("Simple Text - MVC");
        // The window closing event should probably be passed to the
        // Controller in a real program, but this is a short example.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void reset() {
        outputField.setText(model.getTheText());
    }

    public String getUserInput() {
        return userInputField.getText();
    }

    public void setOutput(String out) {
        outputField.setText(out);
    }

    public void addShowListener(ActionListener sal) {
        showTextButton.addActionListener(sal);
    }

    public void addClearListener(ActionListener cal) {
        clearTextButton.addActionListener(cal);
    }
}
