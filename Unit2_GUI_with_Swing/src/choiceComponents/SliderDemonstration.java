package choiceComponents;

import java.awt.BorderLayout;
import java.awt.Component;
import java.util.Dictionary;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SliderDemonstration extends JFrame {
	JSlider slider;
	JTextField valuetxt;
	
	public SliderDemonstration() {
		setTitle("Slider Demo Frame");
		setBounds(1000,350,200,200);
		setLayout(new BorderLayout(10,10));//hgap=10,vgap=10
		//ChangeListener class is active when the value of JSlider are changed
		ChangeListener listener=new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {//event Handler
				JSlider source=(JSlider)e.getSource();
				valuetxt.setText(String.valueOf(source.getValue()));
				
			}
		};
		slider=new JSlider(SwingConstants.HORIZONTAL,0,100,20);//default horizontal,start val=0,final=100
		Dictionary<Integer, Component> labelTable=new Hashtable<Integer, Component>();
		labelTable.put(0, new JLabel("A"));
		labelTable.put(20, new JLabel("B"));
		labelTable.put(40, new JLabel("C"));
		labelTable.put(60, new JLabel("D"));
		labelTable.put(80, new JLabel("E"));
		labelTable.put(100, new JLabel("F"));
		slider.setLabelTable(labelTable);
		
		slider.setMajorTickSpacing(20);
		slider.setMinorTickSpacing(5);
		slider.setSnapToTicks(true);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.addChangeListener(listener);
		add(slider,BorderLayout.NORTH);
		valuetxt=new JTextField(20);
		add(valuetxt,BorderLayout.SOUTH);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SliderDemonstration();
		

	}

}
