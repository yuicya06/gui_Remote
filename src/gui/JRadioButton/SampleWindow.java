package gui.JRadioButton;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class SampleWindow extends JFrame implements ActionListener, ItemListener {
	public SampleWindow(String title) {
		
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ContentPane を Frame に追加
		Container ContentPane = getContentPane();
		
		//panel インスタンス生成
		JPanel panel = new JPanel();
		
		//panelにレイアウトを設定
		panel.setLayout(new FlowLayout());
		
		//①ButtonGroup インスタンス生成
		ButtonGroup BtnGrp = new ButtonGroup();
		
		//②JRadioButton インスタンス３つ生成
		JRadioButton rad1 = new JRadioButton("a) West", true);
		JRadioButton rad2 = new JRadioButton("b) Middle");
		JRadioButton rad3 = new JRadioButton("c) East");
		
		//JRadioButton に名前をセット
		rad1.setName("West");
		rad2.setName("Middle");
		rad3.setName("East");
		//③JRadioButton に ItemListener を追加
		rad1.addItemListener(this);
		rad2.addItemListener(this);
		rad3.addItemListener(this);
		//③JRadioButton に ActionListener を追加
//		rad1.addActionListener(this);
//		rad2.addActionListener(this);
//		rad3.addActionListener(this);
		//④ButtonGroup に各 JRadioButton を追加
		BtnGrp.add(rad1);
		BtnGrp.add(rad2);
		BtnGrp.add(rad3);
		//panel に各 JRadioButton を追加
		panel.add(rad1);
		panel.add(rad2);
		panel.add(rad3);
		//dimension：寸法の設定
		{
			Dimension dim = panel.getPreferredSize();
			dim.width += 20;
			dim.height += 20;
			panel.setPreferredSize(dim);
		}
		//ContentPane に panel を追加
		ContentPane.add(panel);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JRadioButton rbtn = (JRadioButton) e.getSource();
		String state = rbtn.isSelected() ? "selected" : "unselected";
		System.out.printf("Action:%s %s \n", state, rbtn.getName());
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JRadioButton rbtn = (JRadioButton) e.getSource();
		String state = "selected";
		if (e.getStateChange() != ItemEvent.SELECTED) {
			state = "unselected";
		}
		System.out.printf("Item:%s %s\n", state, rbtn.getName());
	}
}