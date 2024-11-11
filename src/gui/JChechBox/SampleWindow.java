package gui.JChechBox;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class SampleWindow extends JFrame implements ActionListener, ItemListener {
	
	public SampleWindow(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		//コンテントペインの取得
		Container ContentPane = getContentPane();
		//コンテントペインにレイアウトを設定
		//BoxLayoutで 縦一列のレイアウト
		ContentPane.setLayout(new BoxLayout(ContentPane, BoxLayout.Y_AXIS));
		
		//String型の配列の初期化
		String[] msg = { "わたしは、人です",
				"わたしは、関西に住んでいます",
				"わたしは、猫が好きです",
				"私は、悪人です" };
		//チェックボックスの配列の宣言
		JCheckBox[] jcbs = new JCheckBox[msg.length];
		//チェックボックスの配列にチェックボックスインスタンスを追加
		for (int i = 0; i < msg.length; ++i) {
			String s = msg[i];
			//チェックボックスインスタンスの生成、配列に代入
			//JCheckBoxのコンストラクタは非選択のため、チェックは入らない
			//setSelectedでチェックを入れている
			jcbs[i] = new JCheckBox((i + 1) + ") " + s);
			//各チェックボックスに名前を瀬戸
			jcbs[i].setName(s);
			//iが偶数ならtrueで選択される
			jcbs[i].setSelected((i % 2) == 0);
			//チェックボックスにイベントを登録
			jcbs[i].addActionListener(this);
			jcbs[i].addItemListener(this);
		}
		//コンテントパインにチェックボックスを追加
		for (JCheckBox jc : jcbs) {
			ContentPane.add(jc);
		}
		
		//コンテントペインのサイズ設定
		ContentPane.setPreferredSize(ContentPane.getPreferredSize());
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JCheckBox jcb = (JCheckBox) e.getSource();
		String state = jcb.isSelected() ? "checked" : "unchecked";
		System.out.printf("Action:%s %s \n", state, jcb.getName());
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JCheckBox jcb = (JCheckBox) e.getSource();
		String state = (e.getStateChange() == ItemEvent.SELECTED) ? "checked" : "unchecked";
		System.out.printf("Item:%s %s \n", state, jcb.getName());
	}
}