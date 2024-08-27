package layoutManagement;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutDemo extends JFrame {
	JButton btn1,btn2,btn3,btn4,btn5;
	public GridLayoutDemo(){
		setTitle("BorderLayout Frame");
		setSize(300,300);
		setLayout(new GridLayout(3,2,10,10));
		btn1=new JButton("Button1");
		btn2=new JButton("Button2");
		btn3=new JButton("Button3");
		btn4=new JButton("Button4");
		btn5=new JButton("Button5");
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayoutDemo();
	}

}
