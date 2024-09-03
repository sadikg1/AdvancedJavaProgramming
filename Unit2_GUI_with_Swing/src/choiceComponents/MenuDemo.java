package choiceComponents;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.KeyStroke;

public class MenuDemo extends JFrame {
	JMenuBar bar;
	JMenu file,edit;
	JMenuItem open,save,exit,copy,paste,cut;
	JCheckBoxMenuItem status;
	JRadioButtonMenuItem online;
	public MenuDemo() {
		super("Menu Frame");//just like setTitle
		setBounds(1000,350,250,200);
		bar=new JMenuBar();
		//Menu
		file=new JMenu("FILE");
		file.setMnemonic('F');
		edit=new JMenu("EDIT");
		edit.setMnemonic('E');
		bar.add(file);bar.add(edit);
		//MenuItems
		open=new JMenuItem("Open");
		open.setAccelerator(KeyStroke.getKeyStroke("ctrl O"));
		open.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JFileChooser fc=new JFileChooser();
				fc.showOpenDialog(open);
				
			}
		});
		save=new JMenuItem("Save");
		exit=new JMenuItem("Exit");
		exit.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
		exit.addActionListener(e->{System.exit(0);System.out.println("System Exited");});
		file.add(open);file.add(save);file.add(exit);
		copy=new JMenuItem("Copy");
		paste=new JMenuItem("Paste");
		cut=new JMenuItem("Cut");
		edit.add(copy);edit.add(paste);edit.add(cut);
		//check menuitem
		status=new JCheckBoxMenuItem("Status",true);//checked
		edit.add(status);
		//Radio Menuitem
		online=new JRadioButtonMenuItem("Online");
		edit.add(online);
		
		setJMenuBar(bar);//it attaches the menubar into JFrame
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MenuDemo();

	}

}
