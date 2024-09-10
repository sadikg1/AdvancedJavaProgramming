package eventHandling;


import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class HandlingKeyEvent extends JFrame implements KeyListener {
	JLabel firstlbl,secondlbl,resultlbl;
	JTextField firsttxt,secondtxt,resulttxt;
	public HandlingKeyEvent() {
		setTitle("ActionEvent Frame");
		setSize(300,300);
		setLayout(new GridLayout(3,2,5,5));
		firstlbl=new JLabel("First Number: ");
		secondlbl=new JLabel("Second Number: ");
		resultlbl=new JLabel("Result: ");
		firsttxt=new JTextField(20);
		secondtxt=new JTextField(20);
		resulttxt=new JTextField(20);
		resulttxt.addKeyListener(this);
		
		add(firstlbl);
		add(firsttxt);
		add(secondlbl);
		add(secondtxt);
		add(resultlbl);
		add(resulttxt);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new HandlingKeyEvent();

	}


	@Override
	public void keyTyped(KeyEvent e) {//justType
		// TODO Auto-generated method stub
		
	}


	@Override
	public void keyPressed(KeyEvent e) {//long press
		// TODO Auto-generated method stub
		int a,b,c=0;
		a=Integer.parseInt(firsttxt.getText());
		b=Integer.parseInt(secondtxt.getText());
		char choice=e.getKeyChar();
		switch(choice) {
		case '+':
			c=a+b;
			break;
		case '-':
			c=Math.abs(a-b);
			break;
		case '*':
			c=a*b;
			break;
		case '%':
			c=a%b;
			break;
		case '/':
			if(a>b) {
				c=a/b;
			}
			else
				c=b/a;
			break;
		default:
			resultlbl.setText("Invalid Choice");
		}
		resultlbl.setText(String.valueOf(c));
		
	}


	@Override
	public void keyReleased(KeyEvent e) {//releasing key after press
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(firstlbl, "Key Released");
		
	}



}
