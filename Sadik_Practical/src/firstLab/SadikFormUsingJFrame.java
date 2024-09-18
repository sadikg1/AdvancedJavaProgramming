package firstLab;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class SadikFormUsingJFrame extends JFrame{
	public SadikFormUsingJFrame() {
		setTitle("Sadik Form Frame");
        setSize(400, 300);
        

        // Create a panel
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2)); // Use GridLayout for a simple form

        // Create labels and text fields
        JLabel nameLabel = new JLabel("Name:");
        JTextField nameField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password:");
        JPasswordField passwordField = new JPasswordField(20);

        JLabel commentsLabel = new JLabel("Comments:");
        JTextArea commentsArea = new JTextArea(3, 20);

        // Create a submit button
        JButton submitButton = new JButton("Submit");

        // Add components to the panel
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(commentsLabel);
        panel.add(new JScrollPane(commentsArea));
        panel.add(new JLabel()); // Empty label for alignment
        panel.add(submitButton);

        // Add panel to the frame
        add(panel);

        // Event handling for the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String password = new String(passwordField.getPassword());
                String comments = commentsArea.getText();

                // Display the entered information in a dialog box
                JOptionPane.showMessageDialog(null, "Name: " + name + "\nPassword: " + password + 
                		"\nComments: " + comments);
            }
        });

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new SadikFormUsingJFrame();

	}

}
