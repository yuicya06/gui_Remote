package gui.Chooser.sample;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.filechooser.FileNameExtensionFilter;

public class SampleWindow extends JFrame implements ActionListener {
	//=======拡張子による選別========
	static FileNameExtensionFilter fileExtensionfilter = new FileNameExtensionFilter(" テキストファイル", "txt", "text");
	JTextField txfFileName = null;

	SampleWindow(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container contPane = getContentPane();
		contPane.setLayout(new BorderLayout());
		//pane1 にラベル・テキストフィールドを加える
		JPanel pane1 = new JPanel();
		JLabel lblFileName = new JLabel(" ファイル名： ");
		txfFileName = new JTextField("<<ファイル名>>", 20);
		pane1.add(lblFileName);
		pane1.add(txfFileName);
		JButton btnFileChooser = new JButton(" ファイルを選択 ");
		btnFileChooser.addActionListener(this);
		//pane0 に pane1、ボタンを追加
		JPanel pane0 = new JPanel();
		pane0.setLayout(new BoxLayout(pane0, BoxLayout.Y_AXIS));
		pane0.add(pane1);
		pane0.add(btnFileChooser);
		contPane.add(pane0, BorderLayout.NORTH);
		pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//JFileChooser インスタンス生成
		JFileChooser fileChooser = new JFileChooser();
		//setFileFilter(引数)：ファイルフィルターの設定
		fileChooser.setFileFilter(fileExtensionfilter);
		//setCurrentDirectory()：デフォルトのフォルダーの設定
		fileChooser.setCurrentDirectory(new File("C:\\Temp"));
		//ファイル選択ダイアログボックスの表示:
		int selected = fileChooser.showOpenDialog(this);
		//ファイル選択ダイアログボックスの表示:
		if (selected == JFileChooser.APPROVE_OPTION) {
			File file = fileChooser.getSelectedFile();
			String fileName = file.getName();
			txfFileName.setText(fileName);
			System.out.println(fileChooser.getSelectedFile());
		}
	}
}