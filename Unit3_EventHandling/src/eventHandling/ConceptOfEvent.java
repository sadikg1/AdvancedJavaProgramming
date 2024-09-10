package eventHandling;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ConceptOfEvent extends JFrame implements ActionListener {
	JButton clickme;
	
	public ConceptOfEvent() {
		setTitle("Event Concept");
		clickme=new JButton("EXIT");
		clickme.addActionListener(this);
		add(clickme,BorderLayout.NORTH);
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ConceptOfEvent();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
		
	}

}
