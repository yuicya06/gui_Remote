package gui.JButton.sample02;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SampleWindow extends JFrame implements ActionListener {
	public SampleWindow(String title) {
		super(title);

		/*ボタンについて*/
		//ボタン生成
		JButton btn = new JButton("Click");

		//ボタンに名前を付与
		btn.setName("Button 1");
		//ボタンにアクションコマンドをセット
		btn.setActionCommand("I got a click!");
		//ボタンにイベントを登録
		btn.addActionListener(this);

		//コンテントペインの取得
		Container contPane = this.getContentPane();
		//コンテントペインにボタンを追加
		contPane.add(btn, BorderLayout.NORTH);

		//ボタン生成
		JButton btn2 = new JButton("Click");

		//ボタンに名前を付与
		btn2.setName("Button 2");
		//ボタンにアクションコマンドをセット
		btn2.setActionCommand("I got a click!");
		//ボタンにイベントを登録
		btn2.addActionListener(this);

		contPane.add(btn2, BorderLayout.SOUTH);

		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		System.out.printf("Text:%s Name:%s Command:%s\n", btn.getText(), btn.getName(), e.getActionCommand());
	}
}