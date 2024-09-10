package eventHandling;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Factorial extends JFrame implements ActionListener {
	JLabel firstlbl,resultlbl;;
	JTextField firsttxt,resulttxt;
	JButton fact; 
	public Factorial() {
		setTitle("ActionEvent Frame");
		setSize(300,300);
		setLayout(new GridLayout(3,2,5,5));
		firstlbl=new JLabel("First Number: ");
		firsttxt=new JTextField(20);
		resultlbl=new JLabel("Result: ");
		
		resulttxt=new JTextField(20);
		resulttxt.setEditable(false); // Make the result field read-only
		fact=new JButton("Find Factorial");
		fact.addActionListener(this);
		add(firstlbl);add(firsttxt);
		add(fact);
		add(new JLabel());
		add(resultlbl);add(resulttxt);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Factorial();

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		try {
            int num = Integer.parseInt(firsttxt.getText());
            long factorial = calculateFactorial(num);
            resulttxt.setText(String.valueOf(factorial));
        } catch (NumberFormatException ex) {
            resulttxt.setText("Invalid input");
        }
			
	}
	private long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }

}
