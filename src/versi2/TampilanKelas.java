package versi2;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.BorderLayout;

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ScrollPaneConstants;



public class TampilanKelas extends JPanel {
	
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setVisible(true);
		f.add(new TampilanKelas(new RuangKelas("a", "", "")));
	}
	
	private JTable table;

	public TampilanKelas(RuangKelas kelas) {
		
		setSize(500, 650);
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 0, 0), null, new Color(255, 0, 0), null));
		panel.setBounds(10, 11, 480, 66);
		add(panel);
		panel.setLayout(null);
		
		JLabel lblNamaRuangan = new JLabel("Nama Ruangan");
		lblNamaRuangan.setBounds(10, 11, 100, 14);
		panel.add(lblNamaRuangan);
		
		JLabel lblLokasi = new JLabel("Lokasi");
		lblLokasi.setBounds(10, 25, 100, 14);
		panel.add(lblLokasi);
		
		JLabel lblProgStudi = new JLabel("Prog. Studi");
		lblProgStudi.setBounds(10, 40, 100, 14);
		panel.add(lblProgStudi);
		
		JLabel namaRuang = new JLabel("");
		namaRuang.setBounds(120, 11, 100, 14);
		panel.add(namaRuang);
		
		JLabel lokasi = new JLabel("");
		lokasi.setBounds(120, 25, 100, 14);
		panel.add(lokasi);
		
		JLabel label = new JLabel("");
		label.setBounds(120, 40, 100, 14);
		panel.add(label);
		
		JButton editButton = new JButton("Edit");
		editButton.setBounds(381, 11, 89, 43);
		panel.add(editButton);
		
		JButton hapusButton = new JButton("Hapus");
		hapusButton.setBounds(286, 11, 89, 43);
		panel.add(hapusButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 88, 480, 551);
		add(panel_1);
		panel_1.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		DefaultTableModel model = new DefaultTableModel();
		table.setModel(model);
		String[] coloumndata = new String[] {
				"Nama", "Jumlah", "Kondisi", "Posisi", "Nilai", "Min", "Max", "Sesuai?"
			};
		for(int i=0; i<coloumndata.length; i++){
			model.addColumn(coloumndata[i]);
		}
		for(ObjekBenda a:kelas.daftarObjekBenda)
		model.addRow(kelas.getData(a.getNama()));
		for(ObjekNonBenda a:kelas.daftarObjekNonBenda)
		model.addRow(kelas.getData(a.getNama()));
		for(ObjekTerukur a:kelas.daftarObjekTerukur)
		model.addRow(kelas.getData(a.getNama()));
		
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		panel_1.add(scrollPane, BorderLayout.CENTER);
		table.setFillsViewportHeight(true);
		table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
		
		
		

	}
}
