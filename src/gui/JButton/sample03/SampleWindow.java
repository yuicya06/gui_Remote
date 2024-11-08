package gui.JButton.sample03;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SampleWindow extends JFrame implements ActionListener {
	public SampleWindow(String title) {
		super(title);
		
		//ボタンの生成
		JButton btn = new JButton("Click Me!");
		
		//(this) ActionListenerを実装した自分自身
		btn.addActionListener(this);//イベントの登録
		
		//コンテントペインの生成
		Container contPane = this.getContentPane();
		//コンテントペインにボタンを追加
		contPane.add(btn);
		
		pack();
	}
	
		@Override
		public void actionPerformed(ActionEvent e) {
			final String txt1 = "Click Me!";
			final String txt2 = "No Click!";
			
			//equalsメソッドのやつと一緒
			//イベントを登録したコンポーネントの情報をそのコンポーネント型にキャスト
			JButton btn = (JButton) e.getSource();
			System.out.println("btn : text:" + btn.getText());
			
			//ボタンのテキストが等しければ、違うテキストを表示
			if (btn.getText().equals(txt2)) {
				btn.setText(txt1);
			} else {
				btn.setText(txt2);
			}
		}
		

}