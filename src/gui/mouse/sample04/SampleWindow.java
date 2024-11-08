package gui.mouse.sample04;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

class TestMouseListener extends MouseAdapter {
	@Override
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		System.out.println("マウスがドラッグされました。座標: (" + x + ", " + y + ")");
	}
}

public class SampleWindow extends JFrame {
	SampleWindow(String title) {
		setTitle(title);
		setBounds(10, 10, 300, 200);
		setName("Main");
		addMouseMotionListener(new TestMouseListener());
	}
}
