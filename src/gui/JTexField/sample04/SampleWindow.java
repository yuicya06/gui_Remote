package gui.JTexField.sample04;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class SampleWindow extends JFrame {
	JLabel label;
	JTextField textFld;
	int count = 0;

	class TFKeyListener extends KeyAdapter {
		JTextField textFld = null;
		boolean is1stInput = true;

		TFKeyListener(JTextField textFld) {
			this.textFld = textFld;
		}

		@Override
		public void keyPressed(KeyEvent e) {
			count++;
			if (is1stInput) {
				is1stInput = false;
				this.textFld.setText("");
			}
			System.out.println(count);
			System.out.println(is1stInput);
		}
	}

	SampleWindow(String title) {
		super(title);
		this.setSize(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//名前の入力用に JTextField を使う
		textFld = new JTextField("名前を入れてください：", 30);
		textFld.setForeground(Color.gray);
		TitledBorder tborder = new TitledBorder(new LineBorder(Color.black, 2));
		textFld.setBorder(tborder);
		//textFld.setBorder( new TitledBorder("Name") );
		//キーリスナーを使って最初の表示を消す
		textFld.addKeyListener(new TFKeyListener(textFld));
		//表示用のラベル
		label = new JLabel();
		label.setPreferredSize(textFld.getPreferredSize());
		//パスワード入力用に JPasswordField を使う
		JPasswordField passFld = new JPasswordField("●●●●●", 30);
		//アクションリスナーをラムダ式を使って登録
		//ラムダ式中で外部変数を使っているので記述場所に注意
		passFld.addActionListener(
				(e) -> label.setText(String.valueOf(passFld.getPassword())));
		//キーリスナーを使って最初の表示を消す
		passFld.addKeyListener(new TFKeyListener(passFld));
		passFld.setBorder(new TitledBorder("Password"));
		Container contPane = this.getContentPane();
		contPane.add(textFld, BorderLayout.NORTH);
		contPane.add(passFld, BorderLayout.CENTER);
		contPane.add(label, BorderLayout.SOUTH);
		pack();
	}
}