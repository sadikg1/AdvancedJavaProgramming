package dialogPackage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class FileColorChooser extends JFrame {
	JButton filebtn,colorbtn;
	JPanel panel;
	public FileColorChooser() {
		setTitle("File and color Frame");
		setSize(200,200);
		filebtn=new JButton("Open File");
		filebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new JFileChooser().showOpenDialog(panel);
				
			}
		});
		colorbtn= new JButton("Choose Color");
		colorbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Color c= new JColorChooser().showDialog(panel, "Select Color",Color.WHITE);
				panel.setBackground(c);
				
			}
		});
		panel=new JPanel();
		add(filebtn,BorderLayout.NORTH);
		add(panel);
		add(colorbtn,BorderLayout.SOUTH);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileColorChooser();

	}

}
