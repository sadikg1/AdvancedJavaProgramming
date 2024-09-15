package eventHandling;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseAdapterDemo extends MouseAdapter {
	JLabel label;
	JFrame frame;
	public MouseAdapterDemo() {
		frame=new JFrame();
		frame.setTitle("MouseEvent JFrame");
		frame.setSize(300,300);
		frame.addMouseListener(this);
		label=new JLabel();
		frame.add(label);
		frame.setVisible(true);
//		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseAdapterDemo();

	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setText("Clicked at: ("+e.getX()+" , "+e.getY()+")");
		
	}

}
