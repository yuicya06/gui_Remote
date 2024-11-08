package gui.JTexField.sample03;

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


/*KeyListener：抽象メソッド（３つ）を実装する必要がある*/
/*KeyAdapter：メソッドがすでに実装されているので、実装不要*/

public class SampleWindow extends JFrame /*implements ActionListener*/ {
	JLabel label;
	JTextField textFld;
	int count = 0;
	//インナークラス  ネストクラス
	class TFKeyListener extends KeyAdapter {
		JTextField textFld = null;
		boolean is1stInput = true;

		TFKeyListener(JTextField textFld) {
			this.textFld = textFld;
		}

		@Override //イベントハンドラーメソッド 具象メソッド
		public void keyPressed(KeyEvent e) {
			count++;
			//キーのファーストプレス時、テキストフィールドのフィールドに
			if (is1stInput) {
				is1stInput = false;
				this.textFld.setText("");
			}
			System.out.println(e.getSource().getClass());
			System.out.println(count);
			System.out.println(is1stInput);
		}
	}

	SampleWindow(String title) {
		//フレームの設定
		super(title);
		this.setSize(400, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*名前の入力用に JTextField を使う*/
		//テキストフィールドの生成
		textFld = new JTextField("名前を入れてください：", 30);
		//文字の色
		textFld.setForeground(Color.RED);
		//枠線の色と太さ
		TitledBorder tborder = new TitledBorder(new LineBorder(Color.blue, 10));
		textFld.setBorder(tborder);
		//枠線のどこかに"Name"と表示
		textFld.setBorder( new TitledBorder("Name") );
		//キーリスナーを使って最初の表示を消す
		textFld.addKeyListener(new TFKeyListener(textFld));
		//表示用のラベル(ラベルの枠を表示させるために、引数に空白か数字を入力)
		label = new JLabel(" ");
		label.setPreferredSize(textFld.getPreferredSize());

		//パスワード入力用に JPasswordField を使う
		//引数は初期値とカラムの文字数（幅）
		JPasswordField passFld = new JPasswordField("●●●●●", 30);
		//パスワードフィールドにアクションリスナーを登録
		//passFld.addActionListener(this);
		passFld.addActionListener((e) -> label.setText(String.valueOf(passFld.getPassword())));
		
		//パスワードフィールドにキーリスナーを登録
		passFld.addKeyListener(new TFKeyListener(passFld));
		//パスワードフィールドに枠線を設定
		passFld.setBorder(new TitledBorder("PASSWORD"));
		
		//コンテントペインの作成
		Container contPane = this.getContentPane();
		
		//コンテントペインにテキストフィールド、パスワードフィールド、ラベルを貼り付け
		contPane.add(textFld, BorderLayout.NORTH);
		contPane.add(passFld, BorderLayout.CENTER);
		contPane.add(label, BorderLayout.SOUTH);
		pack();
	}
	/*
		@Override
		public void actionPerformed(ActionEvent e) {
			JPasswordField passFld = (JPasswordField) e.getSource();
			//ラベルにパスワードフィールドのテキストをセット
			label.setText(String.valueOf(passFld.getPassword()));
		}*/
}