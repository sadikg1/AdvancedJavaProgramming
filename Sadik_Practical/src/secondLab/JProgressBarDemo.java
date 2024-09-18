package secondLab;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JProgressBarDemo extends JFrame {
	JProgressBar progressBar;
    JButton startButton;
    Timer timer;
    int progress = 0;
    public JProgressBarDemo() {
    	setTitle("Sadik JProgressBar Frame");
        setSize(400, 250);
       

        // Create a progress bar
        progressBar = new JProgressBar(0, 100);
        progressBar.setValue(0);
        progressBar.setStringPainted(true); // Display percentage value

        // Create a start button
        startButton = new JButton("Start");

        // Event handling for the start button
        startButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                startProgress();
            }
        });

        // Add components to the frame
        add(progressBar, "North");
        add(startButton, "South");

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void startProgress() {
        timer = new Timer(100, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                progress += 5;  // Increment the progress by 5
                progressBar.setValue(progress);

                // Stop the timer when progress reaches 100
                if (progress >= 100) {
                    timer.stop();
                    JOptionPane.showMessageDialog(null, "Task Completed!");
                }
            }
        });
        timer.start();  // Start the timer
    }

	public static void main(String[] args) {
		new JProgressBarDemo();

	}

}
