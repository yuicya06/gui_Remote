package gui.JTexArea;

import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class SampleWindow extends JFrame {
	String text = "import javax.swing.JFrame;\n" + "import javax.swing.JPanel;\n" ;

	SampleWindow(String title) {
		super(title);
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//コンテントペインの取得
		Container contPane = getContentPane();
		//パネルの生成
		JPanel panel = new JPanel();
		//テキストエリアの生成
		JTextArea textArea = new JTextArea(text, 10, 20);
		
		//スクロールさせたいときには、この行をコメントアウト
//		panel.add(textArea);
		
		// スクロールさせたいときには、この 2 行のコメントアウトを外す
		JScrollPane scrollPane = new JScrollPane(textArea);
		panel.add(scrollPane);
		
		//コンテントペインにパネルの取得
		contPane.add(panel);
		// 下の行を加えると初期化に用いたテキストが上書きされる
//		textArea.setText("Hello");
//		pack();
	}
}