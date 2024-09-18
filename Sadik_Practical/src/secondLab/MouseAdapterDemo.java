package secondLab;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class MouseAdapterDemo extends MouseAdapter {
	JLabel label;
	JFrame frame;
	public MouseAdapterDemo() {
		frame = new JFrame(); // Initialize JFrame
        
        frame.setTitle("MouseEvent Example");
        frame.setSize(400, 300);
        frame.setLayout(null);

        // Create a JLabel to display mouse events
        label = new JLabel("Hover over or click me!");
        label.setBounds(100, 100, 200, 50);
        label.setHorizontalAlignment(SwingConstants.CENTER);
        frame.add(label);
        
        label.addMouseListener(this); // Add MouseAdapter as listener
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       
	}
	@Override
    public void mouseEntered(MouseEvent e) {
        label.setText("Mouse Entered!");
    }
	public static void main(String[] args) {
		new MouseAdapterDemo();

	}

}
