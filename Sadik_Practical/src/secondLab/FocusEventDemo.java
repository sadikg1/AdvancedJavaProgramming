package secondLab;
import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class FocusEventDemo extends JFrame implements FocusListener {
	 JTextField textField1, textField2;
	 JLabel label;
	 public FocusEventDemo() {
		 	setTitle("Sadik FocusEvent Frame");
	        setSize(400, 200);
	        
	        // Create two text fields
	        textField1 = new JTextField("Click to focus");
	        textField1.setBounds(50, 50, 120, 30);
	        textField1.addFocusListener(this); // Add FocusListener

	        textField2 = new JTextField("Click to focus");
	        textField2.setBounds(200, 50, 120, 30);
	        textField2.addFocusListener(this); // Add FocusListener

	        // Create a label to display focus events
	        label = new JLabel("Focus event messages will appear here.");
	        label.setBounds(50, 100, 300, 30);

	        // Add components to the frame
	        add(textField1);
	        add(textField2);
	        add(label);

	        setVisible(true);
	        setDefaultCloseOperation(EXIT_ON_CLOSE);
	 }

	public static void main(String[] args) {
		new FocusEventDemo();

	}

	@Override
	public void focusGained(FocusEvent e) {
		if (e.getSource() == textField1) {
            label.setText("Focus gained by TextField 1");
        } else if (e.getSource() == textField2) {
            label.setText("Focus gained by TextField 2");
        }
		
	}

	@Override
	public void focusLost(FocusEvent e) {
		if (e.getSource() == textField1) {
            label.setText("Focus lost by TextField 1");
        } else if (e.getSource() == textField2) {
            label.setText("Focus lost by TextField 2");
        }
		
	}

}
