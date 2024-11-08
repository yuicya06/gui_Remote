package gui.start_with_gui_programing.sample04;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class ButtonAbstractAction extends AbstractAction {
	@Override
	public void actionPerformed(ActionEvent e) {
		JOptionPane.showMessageDialog(null, "ボタンがクリックされました");
	}
}

class ButtonActionListener extends JFrame implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("btn2");
		System.exit(0);
	}
}

public class SampleWindow extends JFrame {
	SampleWindow(String title) {
		super(title);
		setSize(280, 100);
		
		JButton btn1 = new JButton("クリックしてください");
		btn1.addActionListener(new ButtonAbstractAction());
		
		JButton btn2 = new JButton("終了します");
		btn2.addActionListener(new ButtonActionListener());
		
		Container cont = getContentPane();
		cont.add(btn1, BorderLayout.NORTH);
		cont.add(btn2, BorderLayout.SOUTH);
	}

}
