package versi2;



import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Tampilan3 extends JFrame {

	private JPanel contentPane;
	private JTextField IntensitasCahaya;
	private JTextField Kelembapan;
	private JTextField Suhu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tampilan3 frame = new Tampilan3();
					frame.setSize(500,641);
					frame.setResizable(false);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tampilan3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 499, 641);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblLingkunganRuangKelas = new JLabel("Lingkungan Ruang Kelas");
		lblLingkunganRuangKelas.setBounds(10, 11, 184, 14);
		contentPane.add(lblLingkunganRuangKelas);
		
		JLabel label_1 = new JLabel("_____________________________________________________________________");
		label_1.setBounds(0, 14, 484, 14);
		contentPane.add(label_1);
		
		JLabel lblKondisiLantai = new JLabel("Kondisi Lantai");
		lblKondisiLantai.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblKondisiLantai.setBounds(20, 45, 172, 19);
		contentPane.add(lblKondisiLantai);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Baik");
		rdbtnNewRadioButton.setBounds(198, 44, 109, 23);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Kurang Baik");
		rdbtnNewRadioButton_1.setBounds(309, 44, 109, 23);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JLabel lblKondisiDinding = new JLabel("Kondisi Dinding");
		lblKondisiDinding.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblKondisiDinding.setBounds(20, 75, 172, 19);
		contentPane.add(lblKondisiDinding);
		
		JRadioButton rdbtnBaik = new JRadioButton("Baik");
		rdbtnBaik.setBounds(198, 74, 109, 23);
		contentPane.add(rdbtnBaik);
		
		JRadioButton rdbtnKurangBaik = new JRadioButton("Kurang Baik");
		rdbtnKurangBaik.setBounds(309, 74, 109, 23);
		contentPane.add(rdbtnKurangBaik);
		
		JLabel lblKondisiAtap = new JLabel("Kondisi Atap");
		lblKondisiAtap.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblKondisiAtap.setBounds(20, 105, 172, 19);
		contentPane.add(lblKondisiAtap);
		
		JRadioButton rdbtnBaik_1 = new JRadioButton("Baik");
		rdbtnBaik_1.setBounds(198, 104, 109, 23);
		contentPane.add(rdbtnBaik_1);
		
		JRadioButton rdbtnKurangBaik_1 = new JRadioButton("Kurang Baik");
		rdbtnKurangBaik_1.setBounds(309, 104, 109, 23);
		contentPane.add(rdbtnKurangBaik_1);
		
		JLabel lblKondisiPintu = new JLabel("Kondisi Pintu");
		lblKondisiPintu.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblKondisiPintu.setBounds(20, 136, 172, 19);
		contentPane.add(lblKondisiPintu);
		
		JRadioButton rdbtnBaik_2 = new JRadioButton("Baik");
		rdbtnBaik_2.setBounds(198, 135, 109, 23);
		contentPane.add(rdbtnBaik_2);
		
		JRadioButton rdbtnKurangBaik_2 = new JRadioButton("Kurang Baik");
		rdbtnKurangBaik_2.setBounds(309, 135, 109, 23);
		contentPane.add(rdbtnKurangBaik_2);
		
		JLabel lblKondisiCendela = new JLabel("Kondisi Cendela");
		lblKondisiCendela.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblKondisiCendela.setBounds(20, 166, 172, 19);
		contentPane.add(lblKondisiCendela);
		
		JRadioButton rdbtnBaik_3 = new JRadioButton("Baik");
		rdbtnBaik_3.setBounds(198, 165, 109, 23);
		contentPane.add(rdbtnBaik_3);
		
		JRadioButton rdbtnKurangBaik_3 = new JRadioButton("Kurang Baik");
		rdbtnKurangBaik_3.setBounds(309, 165, 109, 23);
		contentPane.add(rdbtnKurangBaik_3);
		
		JLabel lblKebersihanRuangKelas = new JLabel("Kebersihan Ruang kelas");
		lblKebersihanRuangKelas.setBounds(10, 206, 184, 14);
		contentPane.add(lblKebersihanRuangKelas);
		
		JLabel label_2 = new JLabel("_____________________________________________________________________");
		label_2.setBounds(0, 209, 484, 14);
		contentPane.add(label_2);
		
		JLabel lblSirkulasiUdara = new JLabel("Sirkulasi Udara");
		lblSirkulasiUdara.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblSirkulasiUdara.setBounds(20, 240, 172, 19);
		contentPane.add(lblSirkulasiUdara);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Lancar");
		rdbtnNewRadioButton_2.setBounds(198, 239, 109, 23);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnTidakLancar = new JRadioButton("Tidak Lancar");
		rdbtnTidakLancar.setBounds(309, 239, 109, 23);
		contentPane.add(rdbtnTidakLancar);
		
		JLabel lblIntensitasCahaya = new JLabel("Intensitas Cahaya");
		lblIntensitasCahaya.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblIntensitasCahaya.setBounds(20, 279, 172, 19);
		contentPane.add(lblIntensitasCahaya);
		
		IntensitasCahaya = new JTextField();
		IntensitasCahaya.setBounds(198, 279, 38, 20);
		contentPane.add(IntensitasCahaya);
		IntensitasCahaya.setColumns(10);
		
		JLabel lblKelembapan = new JLabel("Kelembapan");
		lblKelembapan.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblKelembapan.setBounds(20, 319, 172, 19);
		contentPane.add(lblKelembapan);
		
		Kelembapan = new JTextField();
		Kelembapan.setBounds(198, 319, 38, 20);
		contentPane.add(Kelembapan);
		Kelembapan.setColumns(10);
		
		JLabel lblSuhu = new JLabel("Suhu");
		lblSuhu.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblSuhu.setBounds(20, 364, 172, 19);
		contentPane.add(lblSuhu);
		
		Suhu = new JTextField();
		Suhu.setBounds(199, 364, 37, 20);
		contentPane.add(Suhu);
		Suhu.setColumns(10);
		
		JLabel lblC = new JLabel("C");
		lblC.setFont(new Font("Times New Roman", Font.BOLD, 12));
		lblC.setBounds(246, 367, 46, 14);
		contentPane.add(lblC);
		
		JLabel label = new JLabel("Kebersihan Ruang kelas");
		label.setBounds(10, 399, 184, 14);
		contentPane.add(label);
		
		JLabel label_3 = new JLabel("_____________________________________________________________________");
		label_3.setBounds(0, 402, 484, 14);
		contentPane.add(label_3);
		
		JLabel lblTingkatKebisingan = new JLabel("Tingkat Kebisingan");
		lblTingkatKebisingan.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTingkatKebisingan.setBounds(10, 424, 172, 19);
		contentPane.add(lblTingkatKebisingan);
		
		JRadioButton rdbtnBising = new JRadioButton("Bising ");
		rdbtnBising.setBounds(198, 423, 109, 23);
		contentPane.add(rdbtnBising);
		
		JRadioButton rdbtnTidakBising = new JRadioButton("Tidak Bising");
		rdbtnTidakBising.setBounds(322, 423, 109, 23);
		contentPane.add(rdbtnTidakBising);
		
		JLabel lblBau = new JLabel("Bau");
		lblBau.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblBau.setBounds(10, 450, 172, 19);
		contentPane.add(lblBau);
		
		JRadioButton rdbtnBau = new JRadioButton("Bau");
		rdbtnBau.setBounds(198, 449, 109, 23);
		contentPane.add(rdbtnBau);
		
		JRadioButton rdbtnTidakBau = new JRadioButton("Tidak Bau");
		rdbtnTidakBau.setBounds(322, 449, 109, 23);
		contentPane.add(rdbtnTidakBau);
		
		JLabel lblKebocoran = new JLabel("Kebocoran");
		lblKebocoran.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblKebocoran.setBounds(10, 474, 172, 19);
		contentPane.add(lblKebocoran);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Bocor");
		rdbtnNewRadioButton_3.setBounds(198, 473, 109, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Tidak Bocor");
		rdbtnNewRadioButton_4.setBounds(322, 473, 109, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JLabel lblKerusakan = new JLabel("Kerusakan");
		lblKerusakan.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblKerusakan.setBounds(10, 498, 172, 19);
		contentPane.add(lblKerusakan);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Rusak");
		rdbtnNewRadioButton_5.setBounds(198, 497, 109, 23);
		contentPane.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnTidakRusak = new JRadioButton("Tidak Rusak");
		rdbtnTidakRusak.setBounds(322, 497, 109, 23);
		contentPane.add(rdbtnTidakRusak);
		
		JLabel lblKeausan = new JLabel("Keausan");
		lblKeausan.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblKeausan.setBounds(10, 523, 172, 19);
		contentPane.add(lblKeausan);
		
		JRadioButton rdbtnAus = new JRadioButton("Aus");
		rdbtnAus.setBounds(198, 522, 109, 23);
		contentPane.add(rdbtnAus);
		
		JRadioButton rdbtnTidakAus = new JRadioButton("Tidak Aus");
		rdbtnTidakAus.setBounds(322, 523, 109, 23);
		contentPane.add(rdbtnTidakAus);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(291, 572, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(390, 572, 89, 23);
		contentPane.add(btnNext);
	}

}
