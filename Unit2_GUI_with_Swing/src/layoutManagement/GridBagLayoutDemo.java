package layoutManagement;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridBagLayoutDemo extends JFrame{
	JButton btn1,btn2,btn3,btn4,btn5;
	GridBagConstraints gbc= new GridBagConstraints();
	public GridBagLayoutDemo() {
		setTitle("GridBagLayout Frame");
		setSize(500,300);
		setLayout(new GridBagLayout());
		btn1=new JButton("Button1");
		gbc.gridx=0;
		gbc.gridy=0;
		gbc.gridheight=5;
		gbc.fill=GridBagConstraints.VERTICAL;
		add(btn1,gbc);
		btn2=new JButton("Button2");
		gbc.gridx=1;
		gbc.gridy=1;
		gbc.gridheight=1;
		add(btn2,gbc);
		btn3=new JButton("Button3");
		gbc.gridx=2;
		gbc.gridy=2;
		gbc.gridheight=1;
		add(btn3,gbc);
		btn4=new JButton("Button4");
		gbc.gridx=3;
		gbc.gridy=3;
		gbc.gridheight=1;
		add(btn4,gbc);
		btn5=new JButton("Button5");
		gbc.gridx=1;
		gbc.gridy=4;
		gbc.gridheight=1;
		gbc.gridwidth=3;
		gbc.fill=GridBagConstraints.HORIZONTAL;
		add(btn5,gbc);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridBagLayoutDemo();

	}

}
