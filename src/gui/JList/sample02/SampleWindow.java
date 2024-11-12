package gui.JList.sample02;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class SampleWindow extends JFrame {
	String[] phoneticCodeNATO = { "Alfa", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot" , "Delta", "Echo", "Fあああああああああああああああああoxtrot", "Delta", "Echo", "Foxtrot"};

	SampleWindow(String title) {
		setTitle(title);
		setSize(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//JListの生成
		JList<String> list = new JList<>(phoneticCodeNATO);
		//ScrollPaneの生成
		JScrollPane scrollPane = new JScrollPane(list);
		//フレームにスクロールパネルを追加
		add(scrollPane, BorderLayout.CENTER);
		pack();
	}
}