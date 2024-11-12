package gui.JTable.sample01;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SampleWindow extends JFrame {
	public SampleWindow(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		// テーブルの列名
		String[] columnNames = { "名前", "年齢", "都市" };
		//データを定義
		Object[][] data = {
				{ "Alice", 25, "New York" },
				{ "Bob", 30, "Los Angeles" },
				{ "Charlie", 22, "Chicago" },
				{ "David", 35, "San Francisco" },
				{ "Eve", 28, "Miami" }
		};
		// DefaultTableModel を使用して JTable を作成
		DefaultTableModel model = new DefaultTableModel(data, columnNames);
		JTable table = new JTable(model);
		// テーブルをスクロール可能にする
		JScrollPane scrollPane = new JScrollPane(table);
		
		//フレームにScrollPaneを追加
		add(scrollPane);
	}
}