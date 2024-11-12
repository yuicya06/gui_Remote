package gui.JList.sample01;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JList;

public class SampleWindow extends JFrame {
	String[] phoneticCodeNATO = { "Alfa", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot" };

	SampleWindow(String title) {
		setTitle(title);
		setSize(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Jlistの生成
		JList<String> list = new JList<>(phoneticCodeNATO);
		//JScrollPane scrollPane = new JScrollPane(list);
		
		add(list, BorderLayout.CENTER);
		pack();
	}
}