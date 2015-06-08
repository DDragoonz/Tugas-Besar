package versi2;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JTextField;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class Tampilan extends JPanel {

	private static final long serialVersionUID = 1L;

	JTextField namaRuang = new JTextField();
	JTextField lokasiRuang = new JTextField();
	JTextField ProgStudi = new JTextField();
	JTextField panjangRuangan = new JTextField();
	JTextField LebarRuangan = new JTextField();
	JTextField JumlahKursi = new JTextField();
	JTextField JumlahPintu = new JTextField();
	JTextField JumlahCendela = new JTextField();
	
	private Kontrol kontrol = new Kontrol();

	public Tampilan(RuangKelas kelas) {

		setLocation(0, 0);
		setSize(500, 650);
		setLayout(null);

		JLabel lblNamaRuangan = new JLabel("Nama Ruangan");
		lblNamaRuangan.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblNamaRuangan.setBounds(20, 71, 98, 19);
		add(lblNamaRuangan);

		if (kelas != null) {
			namaRuang.setText(kelas.getNama());
			lokasiRuang.setText(kelas.getLokasi());
			ProgStudi.setText(kelas.getFakultas());
			panjangRuangan.setText("" + kelas.getPanjang());
			LebarRuangan.setText("" + kelas.getLebar());
			JumlahKursi.setText(kelas.getJumlahObjek("Kursi"));
			JumlahPintu.setText(kelas.getJumlahObjek("Pintu"));
			JumlahCendela.setText(kelas.getJumlahObjek("Jendela"));
		}

		namaRuang.setBounds(221, 71, 165, 20);
		// getContentPane().
		add(namaRuang);
		namaRuang.setColumns(10);

		JLabel lblLokasiRuang = new JLabel("Lokasi Ruang");
		lblLokasiRuang.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblLokasiRuang.setBounds(20, 104, 98, 19);
		// getContentPane().
		add(lblLokasiRuang);

		lokasiRuang.setBounds(221, 104, 165, 20);
		// getContentPane().
		add(lokasiRuang);
		lokasiRuang.setColumns(10);

		JLabel lblProgramStudi = new JLabel("Program Studi/Fakultas");
		lblProgramStudi.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblProgramStudi.setBounds(20, 134, 200, 19);
		// getContentPane().
		add(lblProgramStudi);

		ProgStudi.setBounds(221, 134, 165, 20);
		// getContentPane().
		add(ProgStudi);
		ProgStudi.setColumns(10);

		JLabel lblPanjangRuangan = new JLabel("Panjang Ruangan *");
		lblPanjangRuangan.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPanjangRuangan.setBounds(20, 243, 142, 19);
		// getContentPane().
		add(lblPanjangRuangan);
		panjangRuangan.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(kontrol.cekFloat(panjangRuangan)||panjangRuangan.getText().isEmpty())panjangRuangan.setBackground(null);
				else panjangRuangan.setBackground(Color.pink);
			}
		});

		panjangRuangan.setBounds(221, 243, 165, 20);
		// getContentPane().
		add(panjangRuangan);
		panjangRuangan.setColumns(10);

		JLabel lblLebarRuangan = new JLabel("Lebar Ruangan *");
		lblLebarRuangan.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblLebarRuangan.setBounds(20, 288, 142, 19);
		// getContentPane().
		add(lblLebarRuangan);
		LebarRuangan.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(kontrol.cekFloat(LebarRuangan)||LebarRuangan.getText().isEmpty())LebarRuangan.setBackground(null);
				else LebarRuangan.setBackground(Color.pink);
			}
		});

		LebarRuangan.setBounds(221, 288, 165, 20);
		// getContentPane().
		add(LebarRuangan);
		LebarRuangan.setColumns(10);

		JLabel lblJumlahKursi = new JLabel("Jumlah Kursi");
		lblJumlahKursi.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblJumlahKursi.setBounds(20, 328, 142, 19);
		// getContentPane().
		add(lblJumlahKursi);
		JumlahKursi.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(kontrol.cekINT(JumlahKursi))JumlahKursi.setBackground(null);
				else JumlahKursi.setBackground(Color.PINK);
			}
		});

		JumlahKursi.setBounds(221, 328, 165, 20);
		// getContentPane().
		add(JumlahKursi);
		JumlahKursi.setColumns(10);

		JLabel lblJumlahPintu = new JLabel("Jumlah Pintu");
		lblJumlahPintu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblJumlahPintu.setBounds(20, 371, 142, 19);
		// getContentPane().
		add(lblJumlahPintu);

		JumlahPintu.setBounds(221, 371, 165, 20);
		// getContentPane().
		add(JumlahPintu);
		JumlahPintu.setColumns(10);
		JumlahPintu.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(kontrol.cekINT(JumlahPintu))JumlahPintu.setBackground(null);
				else JumlahPintu.setBackground(Color.PINK);
			}
		});
		

		JLabel lblJumlahJendela = new JLabel("Jumlah Jendela");
		lblJumlahJendela.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblJumlahJendela.setBounds(20, 410, 142, 19);
		// getContentPane().
		add(lblJumlahJendela);

		JumlahCendela.setBounds(221, 410, 165, 20);
		// getContentPane().
		add(JumlahCendela);
		JumlahCendela.setColumns(10);
		JumlahCendela.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
				if(kontrol.cekINT(JumlahCendela))JumlahCendela.setBackground(null);
				else JumlahCendela.setBackground(Color.PINK);
			}
		});

		JPanel lblIdentitasRuangKelas = new JPanel();
		lblIdentitasRuangKelas.setBounds(11, 34, 456, 149);
		// lblIdentitasRuangKelas.setOpaque(false);
		lblIdentitasRuangKelas.setBorder(new TitledBorder(
				"IDENTITAS RUANG KELAS"));
		// getContentPane().
		add(lblIdentitasRuangKelas);

		JPanel lblKondisiRuangKelas = new JPanel();
		lblKondisiRuangKelas.setBounds(10, 220, 456, 250);
		lblKondisiRuangKelas.setBorder(new TitledBorder("KONDISI RUANG KELAS"));
		add(lblKondisiRuangKelas);
		
		JLabel lblbolehTidakDi = new JLabel("*Boleh TIdak Di isi");
		lblbolehTidakDi.setBounds(20, 481, 104, 14);
		add(lblbolehTidakDi);
	}

}
