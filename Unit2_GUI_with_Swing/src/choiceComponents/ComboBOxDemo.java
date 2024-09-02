package choiceComponents;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBOxDemo extends JFrame {
	JComboBox<String> country;
	JLabel countrylbl,displaylbl;
	public ComboBOxDemo() {
		setTitle("ComboBox Frame");
//		setSize(200,200);
		setLayout(new FlowLayout(FlowLayout.LEFT,30,10));
		setBounds(1000,350,350,500);
		setResizable(false);
		
		displaylbl=new JLabel();
		countrylbl=new JLabel("Choose Country");
		String[] countries= {"Nepal","Bhutan","China"};
		country =new  JComboBox<String>(countries);
		country.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				displaylbl.setText(country.getSelectedItem().toString());
				
			}
		});
		country.addItem("USA");
		country.addItem("UK");
		add(countrylbl);
		add(country);
		add(displaylbl);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ComboBOxDemo();

	}

}
