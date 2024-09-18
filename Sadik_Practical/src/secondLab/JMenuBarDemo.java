package secondLab;

import javax.swing.*;

public class JMenuBarDemo extends JFrame {
	public JMenuBarDemo() {
		setTitle("Sadik MenuBar Frame");
        setSize(400, 300);
        

        // Create a menu bar
        JMenuBar menuBar = new JMenuBar();

        // Create "File" menu and add menu items
        JMenu fileMenu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator(); // Add a separator line
        fileMenu.add(exitItem);

        // Create "Edit" menu and add menu items
        JMenu editMenu = new JMenu("Edit");
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        JMenuItem pasteItem = new JMenuItem("Paste");
        editMenu.add(cutItem);
        editMenu.add(copyItem);
        editMenu.add(pasteItem);

        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Set the menu bar for the frame
        setJMenuBar(menuBar);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new JMenuBarDemo();

	}

}
