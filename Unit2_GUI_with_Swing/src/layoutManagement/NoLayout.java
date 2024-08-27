package layoutManagement;

import javax.swing.JButton;
import javax.swing.JFrame;

public class NoLayout extends JFrame {
	JButton btn1,btn2,btn3,btn4;
	public NoLayout(){
		setTitle("No layout frane");
		btn1=new JButton("Button One");
		btn1.setBounds(10,10,110,20);
		btn2=new JButton("Button Two");
		btn2.setBounds(130,10,110,20);
		btn3=new JButton("Button Three");
		btn3.setBounds(10,40,110,20);
		btn4=new JButton("Button Four");
		btn4.setBounds(130,40,110,20);
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new NoLayout();
	}

}
//NoLayout
//FlowLayout:add components left to right, default center;
//Default for JPanel. java.awt.FlowLayout

//BorderLayout: add components in five directions north,east,west,south,center. java.awt.BorderLayout
//GridLayout:JFrame is decomposed into multiple grids, according to the given no. of rows and columns. Added left to right
//java.awt.GridLayout

//GridBagLayoput:We can merge multiple rows or columns during the addition of components
//java.awt.GridBagLayoput

//GroupLayout:imported from javax.swing and used tom add the components using horizontal and vertical groups

