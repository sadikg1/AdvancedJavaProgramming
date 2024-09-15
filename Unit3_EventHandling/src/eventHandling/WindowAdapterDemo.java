package eventHandling;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class WindowAdapterDemo extends JFrame {
    JLabel label;

    public WindowAdapterDemo() {
        setTitle("WindowEvent JFrame");
        setSize(300, 300);
        label = new JLabel();
        add(label);

        // Create an anonymous WindowAdapter
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                JOptionPane.showMessageDialog(label, "Welcome");
            }
        });

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new WindowAdapterDemo();
    }
}
