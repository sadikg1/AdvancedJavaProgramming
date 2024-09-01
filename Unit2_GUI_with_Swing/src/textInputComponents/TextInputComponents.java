package textInputComponents;

import java.awt.GridLayout;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TextInputComponents extends JFrame {
	JLabel userlbl,passlbl,iconlbl;
	JTextField usertxt;
	JPasswordField passtxt;
	JButton login;
	
	public TextInputComponents() {
		userlbl=new JLabel("Username");
		passlbl=new JLabel("Password");
		usertxt=new JTextField(20);
		passtxt=new JPasswordField(20);
		iconlbl=new JLabel();
		Icon icon=new ImageIcon("E:\\OneDrive\\Pictures\\Screenshots\\icon.PNG");
		iconlbl.setIcon(icon);
		login=new JButton("Login");
		setTitle("Login Frame");
		setLayout(new GridLayout(3,2,5,5));
		setSize(400,200);
		add(userlbl);add(usertxt);
		add(passlbl);add(passtxt);
		add(iconlbl);
		add(login);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TextInputComponents();
	}

}
//Text INput Components are those components that are used to input and display the texts. E.g Jlabel,JTextFiels 
//JPAsswordField,JTextArea