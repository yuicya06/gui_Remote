package gui.start_with_gui_programing.sample01;

import javax.swing.JFrame;

public class SampleWindow {
	
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("Window Sample");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setLocation(100, 150);
		frame.setVisible(true);
		}

}
