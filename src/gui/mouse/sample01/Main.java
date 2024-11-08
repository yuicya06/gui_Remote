package gui.mouse.sample01;

import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		SampleWindow sw = new SampleWindow("Window Sample04");
		sw.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sw.setLocation(100, 150);
		sw.setVisible(true);
	}

}
