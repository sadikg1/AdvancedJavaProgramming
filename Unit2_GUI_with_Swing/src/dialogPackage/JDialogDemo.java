package dialogPackage;


import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;


class MyInfo extends JDialog{
	JLabel infolbl;
	public MyInfo() {
		setTitle("My Information");
		infolbl=new JLabel("<html>My name is <h1 style='color:red'>Sadik Ghimire</h1></html>");
		add(infolbl);
		setSize(200,200);
		setVisible(true);

		
	}
}

public class JDialogDemo extends JFrame {
	JButton btn;
	public JDialogDemo() {
		setTitle("Dialog Parent FRame");
		btn=new JButton("Display Info");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new MyInfo();
				
			}
		});
		setSize(400,400);
		setVisible(true);
		add(btn,BorderLayout.NORTH);
		
	}
	public static void main(String[] args) {
		new JDialogDemo();
	}

}
