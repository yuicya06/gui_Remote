package gui.MacroCalculator;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractAction;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class StartWindow extends JFrame {
	StartWindow(String title) {
		super(title);
		//setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 500);
		//setLocation(100, 150);
		
		//Startボタン
		JButton startButton = new JButton("クリックしてください");
		startButton.addActionListener(new ButtonAbstractAction());
		//Stopボタン
		JButton stopButton = new JButton("クリックしてください");
		stopButton.addActionListener(new ButtonAbstractAction());
		
		Container cont = getContentPane();
		cont.add(startButton, BoxLayout.Y_AXIS);
		cont.add(stopButton, BoxLayout.Y_AXIS);

	}

}

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

