package secondLab;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class KeyEventsDemo extends JFrame implements KeyListener {
	JTextArea textArea;
	public KeyEventsDemo() {
		setTitle("Sadik KeyEvent Frame-");
        setSize(400, 300);
        

        // Create a JTextArea
        textArea = new JTextArea();
        textArea.setEditable(false); // Make the text area read-only
        
        JScrollPane scrollPane = new JScrollPane(textArea);
        add(scrollPane);
        
        textArea.addKeyListener(this);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
	

	public static void main(String[] args) {
		new KeyEventsDemo();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// Called when a key is typed (pressed and released)
        textArea.append("Key Typed: " + e.getKeyChar() + "\n");
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		textArea.append("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()) + "\n");
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		textArea.append("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()) + "\n");
		
	}

}
