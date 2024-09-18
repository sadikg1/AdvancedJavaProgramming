package firstLab;
import java.awt.*;
import javax.swing.*;

public class SadikAWTSwingComparison {

	public static void main(String[] args) {
		// AWT Example
        Frame awtFrame = new Frame("AWT Example");
        awtFrame.setSize(300, 200);
        awtFrame.setLayout(new FlowLayout());
        awtFrame.add(new Button("AWT Button"));
        awtFrame.add(new TextField("AWT TextField", 20));
        awtFrame.setVisible(true);

        // Swing Example
        JFrame swingFrame = new JFrame("Swing Example");
        swingFrame.setSize(300, 200);
        swingFrame.setLayout(new FlowLayout());
        swingFrame.add(new JButton("Swing Button"));
        swingFrame.add(new JTextField("Swing JTextField", 20));
        swingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        swingFrame.setVisible(true);

	}

}
