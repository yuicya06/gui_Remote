package gui.mouse.sample03;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

class TestMouseListener extends MouseAdapter {
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("マウスがパネルに入りました");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("マウスがパネルから出ました");
	}
}

public class SampleWindow extends JFrame {
	SampleWindow(String title) {
		setTitle(title);
		setBounds(10, 10, 300, 200);
		setName("Main");
		Container contPane = getContentPane();
		contPane.addMouseListener(new TestMouseListener());
	}
}