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
		String[] columnNames = { "名前", "年齢", "都市", "出身" };
		Object[][] data = {
				{ "Alice", 25, "New York", "America"},
				{ "Bob", 30, "Los Angeles", "America" },
				{ "Charlie", 22, "Chicago", "America" },
				{ "David", 35, "San Francisco", "America" },
				{ "Eve", 28, "Miami", "America" }
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