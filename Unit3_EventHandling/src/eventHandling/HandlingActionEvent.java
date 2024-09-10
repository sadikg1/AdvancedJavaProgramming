package eventHandling;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class HandlingActionEvent extends JFrame implements ActionListener {
	JLabel firstlbl,secondlbl,resultlbl;
	JTextField firsttxt,secondtxt,resulttxt;
	JButton plus,minus; 
	public HandlingActionEvent() {
		setTitle("ActionEvent Frame");
		setSize(300,300);
		setLayout(new GridLayout(4,2,5,5));
		firstlbl=new JLabel("First Number: ");
		secondlbl=new JLabel("Second Number: ");
		resultlbl=new JLabel("Result: ");
		firsttxt=new JTextField(20);
		secondtxt=new JTextField(20);
		resulttxt=new JTextField(20);
		plus=new JButton("Add");
		plus.setActionCommand("+");
		plus.addActionListener(this);
		minus=new JButton("Subtract");
		minus.setActionCommand("-");
		minus.addActionListener(this);
		add(firstlbl);add(firsttxt);
		add(secondlbl);add(secondtxt);
		add(resultlbl);add(resulttxt);
		add(plus);add(minus);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		int a,b,c=0;
		a=Integer.parseInt(firsttxt.getText());
		b=Integer.parseInt(secondtxt.getText());
		if(event.getActionCommand()=="+") {
			c=a+b;
		}
		else {
			c=Math.abs(a-b);
		}
		resulttxt.setText(String.valueOf(c));//int to string
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HandlingActionEvent();

	}

}
