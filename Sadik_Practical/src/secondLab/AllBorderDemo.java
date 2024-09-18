package secondLab;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

public class AllBorderDemo extends JFrame{
	public AllBorderDemo() {
		setTitle("Sadik AllBorder Frame");
        setSize(600, 400);
        
        setLayout(new GridLayout(3, 2, 10, 10)); // GridLayout for layout arrangement

        // Create panels with different borders
        JPanel lineBorderPanel = new JPanel();
        lineBorderPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        lineBorderPanel.add(new JLabel("LineBorder"));

        JPanel etchedBorderPanel = new JPanel();
        etchedBorderPanel.setBorder(BorderFactory.createEtchedBorder());
        etchedBorderPanel.add(new JLabel("EtchedBorder"));

        JPanel bevelBorderPanel = new JPanel();
        bevelBorderPanel.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        bevelBorderPanel.add(new JLabel("BevelBorder (Raised)"));

        JPanel emptyBorderPanel = new JPanel();
        emptyBorderPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        emptyBorderPanel.add(new JLabel("EmptyBorder"));

        JPanel titledBorderPanel = new JPanel();
        titledBorderPanel.setBorder(BorderFactory.createTitledBorder("TitledBorder"));
        titledBorderPanel.add(new JLabel("TitledBorder"));

        // Add panels to the frame
        add(lineBorderPanel);
        add(etchedBorderPanel);
        add(bevelBorderPanel);
        add(emptyBorderPanel);
        add(titledBorderPanel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new AllBorderDemo();

	}

}
