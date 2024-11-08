package gui.JButton.sample04;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class SampleWindow extends JFrame implements ActionListener {

	public SampleWindow(String title) {
		super(title);
		
		//ボタン１の生成
		JButton btn1 = new JButton("Click");
		btn1.addActionListener(this);
		//ボタン２の生成
		JButton btn2 = new JButton("Yes, yes, yes ----- !");
		btn2.addActionListener(this);
		
		JButton btn3 = new JButton("No, no, no ----- !");
		btn3.addActionListener(this);
		
		
		//コンテントペインの生成
		Container contPane = this.getContentPane();
		//コンテントペインン上のコンポーネントのレイアウトを設定
		contPane.setLayout(new BoxLayout(contPane, BoxLayout.X_AXIS));
		//コンテントペインにボタン１を追加
		contPane.add(btn1);
		//コンテントペインにボタン２を追加
		contPane.add(btn2);
		contPane.add(btn3);
		
		pack();

	}
	
	//アクション
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource();
		System.out.printf("text:%s\n", btn.getText());
	}
}
