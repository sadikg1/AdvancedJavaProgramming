package layoutManagement;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FlowLayoutDemo extends JFrame {
	JButton btn1,btn2,btn3,btn4;
	JPanel panel;
	public FlowLayoutDemo() {
		setTitle("FlowLayout Frame");
		setSize(300,300);
		btn1=new JButton("Button1");
		btn2=new JButton("Button2");
		btn3=new JButton("Button3");
		btn4=new JButton("Button4");
		panel=new JPanel();
		panel.setBackground(Color.CYAN);
		panel.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		
		//setLayout(new FlowLayout(FlowLayout.LEFT,10,10));//10-hgap, 10-vgap
		panel.add(btn1);//added to JPanel according to FLowLayout
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		add(panel);//added to JFrame
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutDemo();

	}

}
