package gui.mouse.sample01;

import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

class TestMouseListener extends MouseAdapter {
	@Override
	public void mouseClicked(MouseEvent e) {
		// マウスがクリックされたときに実行したいコードをここに記述します
		int x = e.getX(); // マウスイベントの X 座標を取得
		int y = e.getY(); // マウスイベントの Y 座標を取得
		System.out.println("マウスがクリックされました。座標: (" + x + ", " + y + ")");
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