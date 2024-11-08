package gui.JTexField.sample02;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class SampleWindow extends JFrame {
	JLabel label;
	JTextField textFld;

	SampleWindow(String title) {
		super(title);
		this.setBounds(100, 100, 600, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		textFld = new JTextField(20);
		
		//アクションリスナーをラムダ式を使って登録
		//addActionの引数は、ActionLitener型
		//ActionListener(インタフェース)のインスタンス化が必要
		//ActionListenerは抽象メソッドが一つしかないので、
		//それを実装したインスタンス化が必要
		
//		textFld.addActionListener((引数（型は省略可能）) -> (メソッド));
		
		textFld.addActionListener((e) -> label.setText(textFld.getText()));
		label = new JLabel();
		
		//アクションリスナーをラムダ式を使って登録
		label.setPreferredSize(textFld.getPreferredSize());
		
		
		Container contPane = this.getContentPane();
		contPane.add(textFld, BorderLayout.CENTER);
		contPane.add(label, BorderLayout.SOUTH);
		pack();
	}
}