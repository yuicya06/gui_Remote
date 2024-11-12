package gui.JList.sample03;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class SampleWindow extends JFrame {
	String[] phoneticCodeNATO = { "Alfa", "Bravo", "Charlie", "Delta", "Echo", "Foxtrot" };

	//イベントリスナー(ListSelectionListener を実装)
	class MyListSelectionListener implements ListSelectionListener {
		JLabel label;
		JList<String> list;

		MyListSelectionListener(JList<String> list, JLabel label) {
			this.list = list;
			this.label = label;
		}

		@Override
		public void valueChanged(ListSelectionEvent e) {
			
			String str;
			
			if (list.getSelectedIndices().length == 1) {
				str = list.getSelectedValue();
				System.out.println("---" + str);
			} else {
				str = list.getSelectedValuesList().toString();
			}
			//ラベルに変数strを反映
			label.setText(str);
		}
	}

	SampleWindow(String title) {
		setTitle(title);
		setSize(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ラベルの生成
		JLabel label = new JLabel(" "); // ラベルの高さの目安がないので空白１字
		//JListの生成
		JList<String> list = new JList<>(phoneticCodeNATO);
		//ScrollPaneの生成
		JScrollPane scrollPane = new JScrollPane(list);
		
		//セレクションモードの設定
		list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		
		//イベントの登録
		list.addListSelectionListener(
				new MyListSelectionListener(list, label));
		add(scrollPane, BorderLayout.NORTH);
		
		
		//ScrollPaneとラベルを追加
		add(label, BorderLayout.SOUTH);
		pack();
		
		ImageIcon icon = new ImageIcon("icon\\icons8-java-coffee-cupのロゴ-500.png");
		setIconImage(icon.getImage());
	
	}
}