package gui.JButton.sample01;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SampleWindow extends JFrame implements ActionListener {
	public SampleWindow(String title) {
		super(title);
		
		
		//ボタンの生成
		JButton btn = new JButton("Click111");
		//ボタンにイベントを登録
		btn.addActionListener(this);
		
		//コンテントペインの作成
		Container contPane = this.getContentPane();
		
		//コンテントペインにボタンを追加
		contPane.add(btn);
		
		//いい感じにウィンドウ（のサイズなど）を表示してくれるもの
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		System.out.printf("Text:%s\n", btn.getText());
	}
}
