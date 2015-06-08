package versi2;

import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JButton;


import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class TampilanKelas extends JPanel {


	private static final long serialVersionUID = 1L;
	private JTable table;
	JButton editButton = new JButton("Edit");
	JButton hapusButton = new JButton("Hapus");
	JButton backButton = new JButton("Back");

	public void init(RuangKelas kelas, boolean login) {
		
		setSize(850,500);
		setLayout(null);
		setBackground(Color.GRAY);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.RAISED, new Color(255, 0, 0), null, new Color(255, 0, 0), null));
		panel.setBounds(10, 11, 725, 66);
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
		
		JLabel namaRuang = new JLabel(kelas.getNama());
		namaRuang.setBounds(120, 11, 100, 14);
		panel.add(namaRuang);
		
		JLabel lokasi = new JLabel(kelas.getLokasi());
		lokasi.setBounds(120, 25, 100, 14);
		panel.add(lokasi);
		
		JLabel label = new JLabel(kelas.getFakultas());
		label.setBounds(120, 40, 100, 14);
		panel.add(label);
		
		editButton.setBounds(622, 11, 89, 43);
		editButton.setEnabled(false);
		panel.add(editButton);
		
		hapusButton.setBounds(523, 11, 89, 43);
		hapusButton.setEnabled(false);
		panel.add(hapusButton);
		
		backButton.setBounds(424, 11, 89, 43);
		panel.add(backButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.GRAY);
		panel_2.setBounds(230, 11, 4, 44);
		panel.add(panel_2);
		
		JLabel lblLuas = new JLabel("Luas");
		lblLuas.setBounds(244, 11, 46, 14);
		panel.add(lblLuas);
		
		JLabel luas = new JLabel(""+kelas.ukurLuas());
		luas.setBounds(300, 11, 46, 14);
		panel.add(luas);
		
		JLabel lblRasio = new JLabel("Rasio");
		lblRasio.setBounds(244, 25, 46, 14);
		panel.add(lblRasio);
		
		JLabel rasio = new JLabel(kelas.hitungRasio());
		rasio.setBounds(300, 25, 46, 14);
		panel.add(rasio);
		
		JLabel lblBentuk = new JLabel("Bentuk");
		lblBentuk.setBounds(244, 40, 46, 14);
		panel.add(lblBentuk);
		
		JLabel bentuk = new JLabel(kelas.ukurBentuk());
		bentuk.setBounds(300, 40, 46, 14);
		panel.add(bentuk);
		
		if(login){
			editButton.setEnabled(true);
			hapusButton.setEnabled(true);
		}
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 88, 725, 250);
		add(panel_1);
		
		
		DefaultTableModel model = new DefaultTableModel();
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
		panel_1.setLayout(null);
		
		
		
		
		
		table = new JTable();
		table.setBounds(0, 0, 725, 425);
		table.setModel(model);
		table.setFillsViewportHeight(true);
		
		
		JScrollPane scrollPane = new JScrollPane(table);
		scrollPane.setBounds(0, 0, 725, 250);
		panel_1.add(scrollPane);
		

	}
}
