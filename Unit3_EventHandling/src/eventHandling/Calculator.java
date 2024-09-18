package eventHandling;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Calculator extends JFrame  {
	JLabel label[]=new JLabel[10];
	JButton btns[]=new JButton[5];
	String[] btntxts= {"+","-","*","=","C"};
    Calculator() {
    	setTitle("JLabel Calculator");
        setSize(300, 300);
        GridLayout layout=new GridLayout(3,5,5,5);
        setLayout(layout);
        for(int i=0;i<label.length;i++) {
        	label[i]=new JLabel(String.valueOf(i));
        	label[i].setBackground(Color.WHITE);
        	label[i].setBorder(BorderFactory.createLineBorder(Color.GREEN));
        	add(label[i]);
        }
        //create buttons
        for(int i=0;i<5;i++) {
        	btns[i]=new JButton(btntxts[i]);
        	btns[i].setBackground(Color.WHITE);
        	btns[i].setBorder(BorderFactory.createLineBorder(Color.GREEN));
        	add(btns[i]);
        }
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
		
	}

	public static void main(String[] args) {
		new Calculator();

	}

}
