package versi2;



import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Tampilan extends JFrame  {
	private JPanel contentPane;
	private JTextField namaRuang;
	private JTextField lokasiRuang;
	private JTextField ProgStudi;
	private JTextField panjangRuangan;
	private JTextField LebarRuangan;
	private JTextField JumlahKursi;
	private JTextField JumlahPintu;
	private JTextField JumlahCendela;
	private JTextField JumlahStopKontak;
	private JTextField JumlahKabelLCD;
	private JTextField JumlahLampu;
	private JTextField LampuYangHidup;
	private JTextField LampuYangMati;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tampilan frame = new Tampilan();
					frame.setSize(500,544);
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Tampilan() {
		
		setTitle("Inventaris Kelas");
		
		
		getContentPane().setLayout(null);
		
		JLabel lblNamaRuangan = new JLabel("Nama Ruangan");
		lblNamaRuangan.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNamaRuangan.setBounds(20, 71, 98, 19);
		getContentPane().add(lblNamaRuangan);
		
		JLabel lblIdentitasRuangKelas = new JLabel("IDENTITAS RUANG KELAS");
		lblIdentitasRuangKelas.setBounds(20, 24, 191, 26);
		getContentPane().add(lblIdentitasRuangKelas);
		
		JLabel label = new JLabel("_____________________________________________________________________");
		label.setBounds(10, 45, 484, 14);
		getContentPane().add(label);
		
		namaRuang = new JTextField();
		namaRuang.setBounds(221, 71, 165, 20);
		getContentPane().add(namaRuang);
		namaRuang.setColumns(10);
		
		JLabel lblLokasiRuang = new JLabel("Lokasi Ruang");
		lblLokasiRuang.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblLokasiRuang.setBounds(20, 104, 98, 19);
		getContentPane().add(lblLokasiRuang);
		
		lokasiRuang = new JTextField();
		lokasiRuang.setBounds(221, 104, 165, 20);
		getContentPane().add(lokasiRuang);
		lokasiRuang.setColumns(10);
		
		JLabel lblProgramStudi = new JLabel("Program Studi/Fakultas");
		lblProgramStudi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblProgramStudi.setBounds(20, 134, 142, 19);
		getContentPane().add(lblProgramStudi);
		
		ProgStudi = new JTextField();
		ProgStudi.setBounds(221, 134, 165, 20);
		getContentPane().add(ProgStudi);
		ProgStudi.setColumns(10);
		
		JLabel lblPanjangRuangan = new JLabel("Panjang Ruangan");
		lblPanjangRuangan.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPanjangRuangan.setBounds(20, 243, 142, 19);
		getContentPane().add(lblPanjangRuangan);
		
		JLabel label_1 = new JLabel("_____________________________________________________________________");
		label_1.setBounds(10, 203, 484, 14);
		getContentPane().add(label_1);
		
		JLabel lblKondisiRuangKelas = new JLabel("KONDISI RUANG KELAS");
		lblKondisiRuangKelas.setBounds(10, 182, 191, 26);
		getContentPane().add(lblKondisiRuangKelas);
		
		panjangRuangan = new JTextField();
		panjangRuangan.setBounds(221, 243, 165, 20);
		getContentPane().add(panjangRuangan);
		panjangRuangan.setColumns(10);
		
		JLabel lblLebarRuangan = new JLabel("Lebar Ruangan");
		lblLebarRuangan.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblLebarRuangan.setBounds(20, 288, 142, 19);
		getContentPane().add(lblLebarRuangan);
		
		LebarRuangan = new JTextField();
		LebarRuangan.setBounds(221, 288, 165, 20);
		getContentPane().add(LebarRuangan);
		LebarRuangan.setColumns(10);
		
		JLabel lblJumlahKursi = new JLabel("Jumlah Kursi");
		lblJumlahKursi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblJumlahKursi.setBounds(20, 328, 142, 19);
		getContentPane().add(lblJumlahKursi);
		
		JumlahKursi = new JTextField();
		JumlahKursi.setBounds(221, 328, 165, 20);
		getContentPane().add(JumlahKursi);
		JumlahKursi.setColumns(10);
		
		JLabel lblJumlahPintu = new JLabel("Jumlah Pintu");
		lblJumlahPintu.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblJumlahPintu.setBounds(20, 371, 142, 19);
		getContentPane().add(lblJumlahPintu);
		
		JumlahPintu = new JTextField();
		JumlahPintu.setBounds(221, 371, 165, 20);
		getContentPane().add(JumlahPintu);
		JumlahPintu.setColumns(10);
		
		JLabel lblJumlahJendela = new JLabel("Jumlah Jendela");
		lblJumlahJendela.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblJumlahJendela.setBounds(20, 410, 142, 19);
		getContentPane().add(lblJumlahJendela);
		
		JumlahCendela = new JTextField();
		JumlahCendela.setBounds(221, 410, 165, 20);
		getContentPane().add(JumlahCendela);
		JumlahCendela.setColumns(10);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//pindah frame......
				setVisible(false);
				
				
			}
		});
		
		btnNext.setBounds(395, 441, 70, 26);
		getContentPane().add(btnNext);
	}


	
	
}
