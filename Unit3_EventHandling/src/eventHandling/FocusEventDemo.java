package eventHandling;

import java.awt.BorderLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FocusEventDemo extends JFrame implements FocusListener {
	JTextField text;
	JButton btn;
	
	public FocusEventDemo() {
		text=new JTextField(20);
		btn=new JButton("Focus Frame");
		setTitle("Handling Focus Frame");
		text.addFocusListener(this);
		add(text,BorderLayout.NORTH);
		add(btn,BorderLayout.SOUTH);
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new FocusEventDemo();

	}
	@Override
	public void focusGained(FocusEvent e) {
		System.out.println("Focus Gained");
		
	}
	@Override
	public void focusLost(FocusEvent e) {
		System.out.println("Focus Lost");
		
	}

}
