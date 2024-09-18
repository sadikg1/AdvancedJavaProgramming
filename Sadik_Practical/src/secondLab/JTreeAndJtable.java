package secondLab;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class JTreeAndJtable extends JFrame {
	public JTreeAndJtable() {
		setTitle("Sadik JTree and JTable Frame");
        setSize(500, 500);
        JPanel panel = new JPanel();
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Programming Languages");
        DefaultMutableTreeNode java = new DefaultMutableTreeNode("Java");
        DefaultMutableTreeNode python = new DefaultMutableTreeNode("Python");
        DefaultMutableTreeNode csharp = new DefaultMutableTreeNode("C#");
        root.add(java);
        root.add(python);
        root.add(csharp);
        JTree tree = new JTree(root);

        String[] columnNames = {"ID", "Name", "Age"};
        Object[][] data = {
            {1, "Sadik", 24},
            {2, "Amar", 20},
            {3, "Prem", 22}
        };
        JTable table = new JTable(new DefaultTableModel(data, columnNames));

        panel.add(new JScrollPane(tree)); // Adding tree to a scroll pane
        panel.add(new JScrollPane(table)); // Adding table to a scroll pane

        add(panel);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new JTreeAndJtable();

	}

}
