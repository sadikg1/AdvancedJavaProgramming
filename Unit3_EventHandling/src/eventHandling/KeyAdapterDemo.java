package eventHandling;

import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class KeyAdapterDemo extends KeyAdapter {
	JFrame frame;
	JLabel firstlbl,secondlbl,resultlbl;
	JTextField firsttxt,secondtxt,resulttxt;
	public KeyAdapterDemo() {
		frame=new JFrame();
		frame.setTitle("ActionEvent Frame");
		frame.setSize(300,300);
		frame.setLayout(new GridLayout(3,2,5,5));
		firstlbl=new JLabel("First Number: ");
		secondlbl=new JLabel("Second Number: ");
		resultlbl=new JLabel("Result: ");
		firsttxt=new JTextField(20);
		secondtxt=new JTextField(20);
		resulttxt=new JTextField(20);
		resulttxt.addKeyListener(this);
		
		frame.add(firstlbl);
		frame.add(firsttxt);
		frame.add(secondlbl);
		frame.add(secondtxt);
		frame.add(resultlbl);
		frame.add(resulttxt);
		frame.setVisible(true);
//		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);	
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyAdapterDemo();

	}

}
