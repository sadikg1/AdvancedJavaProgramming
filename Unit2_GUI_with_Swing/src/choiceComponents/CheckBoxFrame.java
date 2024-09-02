package choiceComponents;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class CheckBoxFrame extends JFrame {
	JLabel courselbl, displaylbl;
	JCheckBox bca,csit,bbm,bbs,bit;
	JButton btn;
	public CheckBoxFrame() {
		setTitle("Checkbox Frame");
//		setSize(200,200);
		setLayout(new FlowLayout(FlowLayout.LEFT,30,10));
		setBounds(1000,350,350,500);
		setResizable(false);
		//obj creation
		courselbl=new JLabel("Choose Program: ");
		displaylbl=new JLabel();
		bca=new JCheckBox("BCA");
		csit=new JCheckBox("CSIT");
		bbm=new JCheckBox("BBM");
		bbs=new JCheckBox("BBS");
		bit=new JCheckBox("BIT");
		btn= new JButton("DISPLAY");
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
//				StringBuilder selectedPrograms = new StringBuilder("Selected Programs: ");
//
//                if (bca.isSelected()) {
//                    selectedPrograms.append("BCA ");
//                }
//                if (csit.isSelected()) {
//                    selectedPrograms.append("CSIT ");
//                }
//                if (bbm.isSelected()) {
//                    selectedPrograms.append("BBM ");
//                }
//                if (bbs.isSelected()) {
//                    selectedPrograms.append("BBS ");
//                }
//                if (bit.isSelected()) {
//                    selectedPrograms.append("BIT ");
//                }
//
//                displaylbl.setText(selectedPrograms.toString());
				
//				or
				ArrayList<String> selectedPrograms = new ArrayList<String>();

                if (bca.isSelected()) {
                    selectedPrograms.add("BCA");
                }
                if (csit.isSelected()) {
                    selectedPrograms.add("CSIT");
                }
                if (bbm.isSelected()) {
                    selectedPrograms.add("BBM");
                }
                if (bbs.isSelected()) {
                    selectedPrograms.add("BBS");
                }
                if (bit.isSelected()) {
                    selectedPrograms.add("BIT");
                }

                if (selectedPrograms.isEmpty()) {
                    displaylbl.setText("No programs selected.");
                } else {
                    displaylbl.setText("Selected Programs: " + String.join(", ", selectedPrograms));
                }
				
			}
		});
		add(courselbl);
		add(bca);
		add(csit);
		add(bbm);
		add(bbs);
		add(bit);
		add(btn);
		add(displaylbl);
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CheckBoxFrame();

	}

}
