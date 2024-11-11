package gui.JTable.sample02;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class SampleWindow extends JFrame {
	public SampleWindow(String title) {
		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 300);
		// DefaultTableModel を使用して JTable を作成
		DefaultTableModel model = new DefaultTableModel();
		// テーブルの列名とデータを定義
		String[] columnNames = { "名前", "年齢", "都市" };
		Object[][] data = {
				{ "Alice", 25, "New York" },
				{ "Bob", 30, "Los Angeles" },
				{ "Charlie", 22, "Chicago" },
				{ "David", 35, "San Francisco" },
				{ "Eve", 28, "Miami" }
		};
		// 列名を DefaultTableModel に追加
		model.setColumnIdentifiers(columnNames);
		// 行データを DefaultTableModel に追加
		for (Object[] o : data) {
			model.addRow(o);
		}
		// DefaultTableModel を JTable に追加
		JTable table = new JTable(model);
		// テーブルをスクロール可能にする
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane);
	}
}