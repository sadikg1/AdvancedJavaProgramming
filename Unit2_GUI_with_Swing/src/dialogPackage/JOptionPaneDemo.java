package dialogPackage;

import javax.swing.JOptionPane;

public class JOptionPaneDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,sum;
		num1=Integer.parseInt(JOptionPane.showInputDialog("Enter number one: ","0"));
		num2=Integer.parseInt(JOptionPane.showInputDialog("Enter number one: ","0"));
		sum=num1+num2;
		JOptionPane.showConfirmDialog(null,"The addition is: "+sum,"Summation",JOptionPane.OK_CANCEL_OPTION,
				JOptionPane.ERROR_MESSAGE);


	}

}
