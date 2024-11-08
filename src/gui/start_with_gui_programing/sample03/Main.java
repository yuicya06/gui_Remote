package gui.start_with_gui_programing.sample03;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main {

	public static void main(String[] args) {
		SampleWindow sw1 
		= new SampleWindow("Window Sample03-01", "Good", JLabel.CENTER);
		sw1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sw1.setLocation(100, 150);
		sw1.setVisible(true);
		int h = sw1.getSize().height;
		
		SampleWindow sw2 
		= new SampleWindow("Window Sample03-02", "Afternoon", JLabel.RIGHT);
		sw2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sw2.setLocation(100, 150 + h);
		sw2.setVisible(true);
	}

}
