package gui.start_with_gui_programing.sample03;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SampleWindow extends JFrame{
	String msg;
	SampleWindow(String title, String msg, int position){
	super(title);
	this.msg = msg;
	setSize(250, 100);
	JLabel lbl = new JLabel(this.msg);
	lbl.setHorizontalAlignment(position);
	
	Container cont = getContentPane();
	cont.add(lbl);
	}

}
