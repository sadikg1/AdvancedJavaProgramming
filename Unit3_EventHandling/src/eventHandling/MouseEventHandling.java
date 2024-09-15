package eventHandling;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventHandling extends JFrame implements MouseListener {
	JLabel label;
	public MouseEventHandling() {
		setTitle("MouseEvent JFrame");
		setSize(300,300);
		addMouseListener(this);
		label=new JLabel();
		add(label);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseEventHandling();

	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setText("Clicked at: ("+e.getX()+" , "+e.getY()+")");
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setText("Mouse Pressed at: ("+e.getX()+" , "+e.getY()+")");
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setText("Mouse Released at: ("+e.getX()+" , "+e.getY()+")");
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setText("Mouse Entered at: ("+e.getX()+" , "+e.getY()+")");
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		label.setText("Mouse Exited at: ("+e.getX()+" , "+e.getY()+")");
		
	}

}
