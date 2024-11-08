package gui.JButton.sample05;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

class MyActionListener implements ActionListener {
	/*feilds*/
	JButton btn1 = null;
	JButton btn2 = null;
	JButton btn3 = null;

	/*constructor*/
	MyActionListener(JButton btn1, JButton btn2, JButton btn3) {
		this.btn1 = btn1;
		this.btn2 = btn2;
		this.btn3 = btn3;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		//イベントの発生源 btn
		//ボタンの背景色の切り替え
		if (btn == btn1) {
			btn1.setBackground(Color.RED);
			btn2.setBackground(Color.GREEN);
		} else if (btn == btn2) {
			btn1.setBackground(Color.BLUE);
			btn2.setBackground(Color.RED);
		}

		else if (btn == btn3) {
			btn1.setBackground(Color.BLUE);
			btn3.setBackground(Color.PINK);
		}

	}
}

public class SampleWindow extends JFrame {
	public SampleWindow(String title) {
		super(title);
		JButton btn1 = new JButton("Click Me!");
		JButton btn2 = new JButton("Yes, yes, yes,,,");
		JButton btn3 = new JButton("No, no, noooo,,,");

		//コンポーネントに登録
		//リスナーのインスタンスの生成
		MyActionListener mal = new MyActionListener(btn1, btn2, btn3);
		//ボタンにリスナーを登録
		btn1.addActionListener(mal);
		btn2.addActionListener(mal);
		btn3.addActionListener(mal);

		//ボタン中央揃え
		btn1.setAlignmentX(CENTER_ALIGNMENT);
		btn2.setAlignmentX(CENTER_ALIGNMENT);
		btn3.setAlignmentX(CENTER_ALIGNMENT);

		//コンテントペインの生成
		Container contPane = this.getContentPane();
		//コンテントペインのレイアウトを設定
		contPane.setLayout(new BoxLayout(contPane, BoxLayout.Y_AXIS));
		//コンテントペインにボタンを追加
		contPane.add(btn1);
		contPane.add(btn2);
		contPane.add(btn3);
		pack();
	}
}