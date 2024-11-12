package gui.DrawingTest.sample01;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

//JFrame を継承
public class BasicDrawing extends JFrame {
	public static void main(String args[]) {
		BasicDrawing frame = new BasicDrawing("ゲーム画面");//引数はWindow Title
		frame.setVisible(true);
	}

	//constructor. フレームの設定関係を行う
	BasicDrawing(String title) {
		setTitle(title);
		setSize(300, 300);
		setLocationRelativeTo(null);//初期画面表示位置を中央に
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//CLOSEでプログラム終了

		Container CP = getContentPane();//getContentPane()はJFrameクラスに定義されている
		//CP.setLayout(null);//レイアウトマネージャを停止

		//上部の背景色を橙に設定する
		JPanel panel = new JPanel();
		panel.setBackground(Color.ORANGE);
		CP.add(panel, BorderLayout.NORTH);

		//Mainパネルの作成、フレームへのセット
		MainPanel MP = new MainPanel();
		CP.add(MP);
		//CP.remove(MP);//フレームを外す
		addKeyListener(MP);//KeyListenerをフレームにセット
		//CP.removeKeyListener(MP);//KeyListenerを外す

		ImageIcon icon = new ImageIcon("icon\\icons8-java-coffee-cupのロゴ-500.png");
		setIconImage(icon.getImage());
	}
}

class MainPanel extends JPanel implements Runnable, KeyListener {
	int x = 100, y = 100;
	boolean state = true;
	Thread t;

	MainPanel() {
		//setLayout(null);
		setBackground(Color.blue);//背景色を青に
		t = new Thread(this);//Thread instance
		t.start();//Thread Start
	}

	//Runnableによるrun() method
	public void run() {
		//無限ループでThreadが終了しないようにする
		while (true) {
			//矩形の大きさを変更する
			if (x < 300 && state) {
				x++;
				y++;
			} else if (x > 0 && !(state)) {
				x--;
				y--;
			}

			try {
				t.sleep(100);//100ms毎に実施
			} catch (InterruptedException e) {
			}

			repaint();
		}
	}

	//JComponentによるpaintComponent method
	//JPanel は JComponent を継承している
	public void paintComponent(Graphics g) {
		//赤い矩形を描画する
		g.setColor(Color.red);
		g.fillRect(x, y, 20, 20);//引数は(X座標,Y座標,Width,height)
	}

	/**********************
	    KeyEvent
	**********************/
	//Keyが押された場合
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {
		case KeyEvent.VK_SPACE:
		case KeyEvent.VK_A:
			System.out.println("KeyPressed");
			if (state)
				state = false;
			else
				state = true;
			break;
		}
	}

	//Keyが離された場合
	public void keyReleased(KeyEvent e) {
	}

	//Keyが押された場合
	public void keyTyped(KeyEvent e) {
	}
}