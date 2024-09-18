package firstLab;
import javax.swing.*;

public class JComboBoxAndJList extends JFrame {
	public JComboBoxAndJList() {
		setTitle("Sadik JComboBox and JList Example");
        setSize(400, 300);
        

        // Create a panel
        JPanel panel = new JPanel();

        // Create a JComboBox with options
        String[] colors = {"Red", "Green", "Blue", "Yellow"};
        JComboBox<String> colorComboBox = new JComboBox<>(colors);
        
        // Create a JList with options
        String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
        JList<String> fruitList = new JList<>(fruits);
        fruitList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        fruitList.setVisibleRowCount(4); // Set how many rows are visible
        JScrollPane listScrollPane = new JScrollPane(fruitList); // Add list to a scroll pane
        
        // Add components to the panel
        panel.add(new JLabel("Choose a color:"));
        panel.add(colorComboBox);
        panel.add(new JLabel("Choose a fruit:"));
        panel.add(listScrollPane);

        // Add panel to the frame
        add(panel);
        


        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JComboBoxAndJList();

	}

}
