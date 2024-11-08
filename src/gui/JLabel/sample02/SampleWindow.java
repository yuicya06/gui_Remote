package gui.JLabel.sample02;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SampleWindow extends JFrame {
	public SampleWindow(String title) {
		super(title);
		setSize(200, 150);
		
		//コンテントペインの生成
		Container cntr = this.getContentPane();
		//ラベルの生成
		JLabel imgLbl = new JLabel(new ImageIcon("img\\Neru_32x32.gif"));
		
		//コンテントペインにラベルを貼り付け
		cntr.add(imgLbl);
		pack();
	}
}