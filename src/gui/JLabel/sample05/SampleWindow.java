package gui.JLabel.sample05;

import java.awt.Container;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class SampleWindow extends JFrame {
	SampleWindow(String title) {
		super(title);
		setSize(500, 500);
		Container cntr = this.getContentPane();
		JLabel txtImgLbl = new JLabel("Hell",
				new ImageIcon("./img/Neru_32x32.gif"),
				JLabel.RIGHT);
		txtImgLbl.setIconTextGap(100);
		txtImgLbl.setHorizontalTextPosition(JLabel.CENTER);
		txtImgLbl.setVerticalTextPosition(JLabel.CENTER);
		cntr.add(txtImgLbl);
		// pack();
	}
}