package gui.JTexField.sample01;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SampleWindow extends JFrame implements ActionListener {
	/*fields*/
	JLabel label;
	JTextField textFld;
	int count = 0;

	SampleWindow(String title) {
		//フレームについての設定
		super(title);
		this.setBounds(100, 500, 600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//テキストフィールドの生成
		textFld = new JTextField(20);
		//テキストフィールドにリスナーを登録
		textFld.addActionListener(this);
		//ラベルの生成
		label = new JLabel();
		//ラベルのサイズの設定
		label.setPreferredSize(textFld.getPreferredSize());
		//コンテントペインの生成
		Container contPane = this.getContentPane();
		//コンテントペインにテキストフィールドを貼り付け
		contPane.add(textFld, BorderLayout.CENTER);
		contPane.add(label, BorderLayout.SOUTH);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("テキストフィールドのイベント発生");
	
		count++;
		System.out.println("count:" + count);
		
		//イベント発生源をテキストフィールド型に変換
		JTextField textFld = (JTextField) e.getSource();
		//ラベルにテキストフィールドをセット
		label.setText(textFld.getText());
	}
}