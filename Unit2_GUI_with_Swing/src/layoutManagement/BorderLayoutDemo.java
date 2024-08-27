package layoutManagement;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutDemo extends JFrame {
	JButton btn1,btn2,btn3,btn4,btn5;
	public BorderLayoutDemo() {
		setTitle("BorderLayout Frame");
		setSize(300,300);
		setLayout(new BorderLayout(10,10));
		btn1=new JButton("Button1");
		btn2=new JButton("Button2");
		btn3=new JButton("Button3");
		btn4=new JButton("Button4");
		btn5=new JButton("Button5");
		add(btn1,BorderLayout.NORTH);
		add(btn2,BorderLayout.SOUTH);
		add(btn3,BorderLayout.WEST);
		add(btn4);
		add(btn5,BorderLayout.EAST);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new BorderLayoutDemo();
		

	}

}
