import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SwingConcept extends JFrame {
	// references
	JLabel usernamelbl, passwordlbl;
	JTextField usertxt, passtxt;
	JButton btn;

	//shift+ctrl+f = autoformatting, ctrl+space=auto-complete
	public SwingConcept() {
		usernamelbl = new JLabel("Enter Username");
		passwordlbl = new JLabel("Enter Password");
		usertxt = new JTextField(20);// 20 characters or columns
		passtxt = new JTextField(20);
		btn = new JButton("Login");
		//jframe has a add function to add components in JFrame
		add(usernamelbl);
		add(usertxt);
		add(passwordlbl);
		add(passtxt);
		add(btn);
		setLayout(new FlowLayout());
		setTitle("First Frame");
		setBounds(850, 400, 300, 300);// x=500,y=400,size=300 by 300
		// setSize(300, 300);// 300-horizontal,300-vertical pixels
		setResizable(false);// by default true
		setVisible(true);// by default false
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SwingConcept();
	}
}