package secondLab;
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class JSliderDemo extends JFrame {
	public JSliderDemo() {
		setTitle("Sadik JSlider Frame");
        setSize(300, 200);
        

        // Create a JLabel to display the slider value
        JLabel label = new JLabel("Value: 50");

        // Create a JSlider with a range from 0 to 100
        JSlider slider = new JSlider(0, 100, 50); // Initial value set to 50
        slider.setMajorTickSpacing(20);  // Set major tick spacing
        slider.setMinorTickSpacing(5);   // Set minor tick spacing
        slider.setPaintTicks(true);      // Paint ticks on the slider
        slider.setPaintLabels(true);     // Paint numeric labels for ticks

        // Event handling for slider
        slider.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                int value = slider.getValue(); // Get the current value of the slider
                label.setText("Value: " + value); // Update the label with the slider value
            }
        });

        // Add components to the frame
        add(slider, "North");
        add(label, "South");

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JSliderDemo();

	}

}
