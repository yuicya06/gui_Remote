package gui.start_with_gui_programing.sample02;

import javax.swing.JFrame;

public class SampleWindow extends JFrame{
	SampleWindow(String title){
		super(title);
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(100, 150);
		}


}
