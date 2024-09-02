package choiceComponents;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class RadioButtonDemo extends JFrame {
	JRadioButton male,female,notspeci;
	JLabel genderlbl;
	ButtonGroup group;
	public RadioButtonDemo() {
		setTitle("Gender Frame");
//		setSize(200,200);
		setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
		setBounds(1000,350,200,200);
		setResizable(false);
		group=new ButtonGroup();
		male=new JRadioButton("MALE");
		female=new JRadioButton("FEMALE");
		notspeci=new JRadioButton("NOT SPECIFIED");
		genderlbl=new JLabel("Choose Gender: ");
		group.add(male);
		group.add(female);
		group.add(notspeci);
		add(genderlbl);
		add(male);
		add(female);
		add(notspeci);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new RadioButtonDemo();

	}

}
