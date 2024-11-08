package gui.JLabel.sample01;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SampleWindow extends JFrame {
	SampleWindow(String title) {
		super(title);
		setSize(200, 150);
		
		//コンテントペインの作成
		Container cntr = this.getContentPane();
		
		//ラベル2つを生成
		JLabel textLbl00 = new JLabel("-- Hello --");
		JLabel textLbl01 = new JLabel("-- Hello --", JLabel.CENTER);
		
		//コンテントペインにラベル2つを生成
		cntr.add(textLbl00, BorderLayout.NORTH);
		cntr.add(textLbl01, BorderLayout.SOUTH);
		//pack();
	}
}
