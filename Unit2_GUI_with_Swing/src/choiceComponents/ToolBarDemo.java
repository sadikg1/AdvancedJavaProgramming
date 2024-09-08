package choiceComponents;



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToolBar;

public class ToolBarDemo extends JFrame {
	JToolBar tbar;
	JPanel panel;
	public ToolBarDemo() {
		setTitle("ToolBar Frame");
		setSize(300,300);
		panel=new JPanel();
		Action runaction=new AbstractAction("Color",new ImageIcon(getClass().getResource("run.PNG"))) {//upcasting
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				panel.setBackground(Color.GREEN);
				
			}
		};
		Action openaction=new AbstractAction("Open", new ImageIcon(getClass().getResource("open.PNG"))) {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				new JFileChooser().showOpenDialog(panel);
				
			}
		};
		add(panel);
		tbar=new JToolBar();
		tbar.add(runaction);
		tbar.add(openaction);
		add(tbar,BorderLayout.NORTH);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ToolBarDemo();

	}

}
