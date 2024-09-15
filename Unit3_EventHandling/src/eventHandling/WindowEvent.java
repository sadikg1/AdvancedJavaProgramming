package eventHandling;

import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class WindowEvent extends JFrame implements WindowListener{
	JLabel label;
	public WindowEvent() {
		setTitle("WindowEvent JFrame");
		setSize(300,300);
		label=new JLabel();
		addWindowListener(this);
		add(label);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WindowEvent();

	}

	@Override
	public void windowOpened(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(label, "Welcome");
		
	}

	@Override
	public void windowClosing(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(label, "Bye Bye!!");
		
	}

	@Override
	public void windowClosed(java.awt.event.WindowEvent e) {
		JOptionPane.showMessageDialog(label, "Good Bye");
		
	}

	@Override
	public void windowIconified(java.awt.event.WindowEvent e) {
		JOptionPane.showMessageDialog(label, "Wait");
		
	}

	@Override
	public void windowDeiconified(java.awt.event.WindowEvent e) {
		JOptionPane.showMessageDialog(label, "Welcome Back");
		
	}

	@Override
	public void windowActivated(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window Activated");
		
	}

	@Override
	public void windowDeactivated(java.awt.event.WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Window Deactivated ");
		
	}

}
