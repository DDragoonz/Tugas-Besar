package versi2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tampilan3 extends JPanel {

	private JPanel contentPane;
	private JTextField IntensitasCahaya;
	private JTextField Kelembapan;
	private JTextField Suhu;
	
	private ButtonGroup kondisilantai = new ButtonGroup();
	JRadioButton kondisilantai1 = new JRadioButton("Baik");
	JRadioButton kondisilantai2 = new JRadioButton("Kurang Baik");

	private ButtonGroup dinding = new ButtonGroup();
	JRadioButton kondisidinding = new JRadioButton("Baik");
	JRadioButton kondisidinding1 = new JRadioButton("Kurang Baik");
	
	private ButtonGroup atap = new ButtonGroup();
	JRadioButton kondisiAtap = new JRadioButton("Baik");
	JRadioButton kondisiAtap1 = new JRadioButton("Kurang Baik");
	
	private ButtonGroup pintu = new ButtonGroup();
	JRadioButton Kondisipintu = new JRadioButton("Baik");
	JRadioButton Kondisipintu1 = new JRadioButton("Kurang Baik");
	
	private ButtonGroup cendela = new ButtonGroup();
	JRadioButton kondisiCendela = new JRadioButton("Baik");
	JRadioButton kondisiCendela1 = new JRadioButton("Kurang Baik");

	private ButtonGroup udara = new ButtonGroup();
	JRadioButton kondisiudara = new JRadioButton("Lancar");
	JRadioButton kondisiudara1 = new JRadioButton("Tidak Lancar");
	
	private ButtonGroup kebising = new ButtonGroup();
	JRadioButton kebisingan = new JRadioButton("Bising ");
	JRadioButton kebisingan1 = new JRadioButton("Tidak Bising");
	// private ButtonGroup login = new ButtonGroup();

	 
	 
	public Tampilan3() {
		setLayout(null);
		

		
		JLabel lblKondisiLantai = new JLabel("Kondisi Lantai");
		lblKondisiLantai.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKondisiLantai.setBounds(20, 45, 172, 19);
		//
		add(lblKondisiLantai);

		
		kondisilantai1.setBounds(198, 44, 109, 23);
		//
		add(kondisilantai1);

		kondisilantai2.setBounds(309, 44, 109, 23);
		//
		add(kondisilantai2);
		kondisilantai.add(kondisilantai1);
		kondisilantai.add(kondisilantai2);
		
		JLabel lblKondisiDinding = new JLabel("Kondisi Dinding");
		lblKondisiDinding.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKondisiDinding.setBounds(20, 75, 172, 19);
		//
		add(lblKondisiDinding);

		kondisidinding.setBounds(198, 74, 109, 23);
		//
		add(kondisidinding);

		
		kondisidinding1.setBounds(309, 74, 109, 23);
		//
		add(kondisidinding1);
		dinding.add(kondisidinding);
		dinding.add(kondisidinding1);
		JLabel lblKondisiAtap = new JLabel("Kondisi Atap");
		lblKondisiAtap.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKondisiAtap.setBounds(20, 105, 172, 19);
		//
		add(lblKondisiAtap);

		
		kondisiAtap.setBounds(198, 104, 109, 23);
		//
		add(kondisiAtap);

		kondisiAtap1.setBounds(309, 104, 109, 23);
		//
		add(kondisiAtap1);
		atap.add(kondisiAtap);
		atap.add(kondisiAtap1);
		
		JLabel lblKondisiPintu = new JLabel("Kondisi Pintu");
		lblKondisiPintu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKondisiPintu.setBounds(20, 136, 172, 19);
		//
		add(lblKondisiPintu);

		
		Kondisipintu.setBounds(198, 135, 109, 23);
		//
		add(Kondisipintu);

		
		Kondisipintu1.setBounds(309, 135, 109, 23);
		//
		add(Kondisipintu1);
		pintu.add(Kondisipintu);
		pintu.add(Kondisipintu1);
		
		JLabel lblKondisiCendela = new JLabel("Kondisi Cendela");
		lblKondisiCendela.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKondisiCendela.setBounds(20, 166, 172, 19);
		//
		add(lblKondisiCendela);

		
		kondisiCendela.setBounds(198, 165, 109, 23);
		//
		add(kondisiCendela);

		
		kondisiCendela1.setBounds(309, 165, 109, 23);
		//
		add(kondisiCendela1);
		cendela.add(kondisiCendela);
		cendela.add(kondisiCendela1);
		
		JLabel lblSirkulasiUdara = new JLabel("Sirkulasi Udara");
		lblSirkulasiUdara.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSirkulasiUdara.setBounds(20, 240, 172, 19);
		//
		add(lblSirkulasiUdara);


		kondisiudara.setBounds(198, 239, 109, 23);
		//
		add(kondisiudara);

		
		kondisiudara1.setBounds(309, 239, 109, 23);
		//
		add(kondisiudara1);
		udara.add(kondisiudara);
		udara.add(kondisiudara1);
		
		JLabel lblIntensitasCahaya = new JLabel("Intensitas Cahaya");
		lblIntensitasCahaya.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblIntensitasCahaya.setBounds(20, 279, 172, 19);
		//
		add(lblIntensitasCahaya);

		IntensitasCahaya = new JTextField();
		IntensitasCahaya.setBounds(198, 279, 38, 20);
		//
		add(IntensitasCahaya);
		IntensitasCahaya.setColumns(10);

		JLabel lblKelembapan = new JLabel("Kelembapan");
		lblKelembapan.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKelembapan.setBounds(20, 319, 172, 19);
		//
		add(lblKelembapan);

		Kelembapan = new JTextField();
		Kelembapan.setBounds(198, 319, 38, 20);
		//
		add(Kelembapan);
		Kelembapan.setColumns(10);

		JLabel lblSuhu = new JLabel("Suhu");
		lblSuhu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSuhu.setBounds(20, 354, 172, 19);
		//
		add(lblSuhu);

		Suhu = new JTextField();
		Suhu.setBounds(199, 354, 37, 20);
		//
		add(Suhu);
		Suhu.setColumns(10);

		JLabel lblC = new JLabel("C");
		lblC.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblC.setBounds(246, 357, 46, 14);
		//
		add(lblC);


		

		JLabel lblTingkatKebisingan = new JLabel("Tingkat Kebisingan");
		lblTingkatKebisingan.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTingkatKebisingan.setBounds(10, 424, 172, 19);
		//
		add(lblTingkatKebisingan);

		
		kebisingan.setBounds(198, 423, 109, 23);
		//
		add(kebisingan);

		
		kebisingan1.setBounds(322, 423, 109, 23);
		//
		add(kebisingan1);
		kebising.add(kebisingan);
		kebising.add(kebisingan1);

		JLabel lblBau = new JLabel("Bau");
		lblBau.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblBau.setBounds(10, 450, 172, 19);
		//
		add(lblBau);

		JRadioButton rdbtnBau = new JRadioButton("Bau");
		rdbtnBau.setBounds(198, 449, 109, 23);
		//
		add(rdbtnBau);

		JRadioButton rdbtnTidakBau = new JRadioButton("Tidak Bau");
		rdbtnTidakBau.setBounds(322, 449, 109, 23);
		//
		add(rdbtnTidakBau);

		JLabel lblKebocoran = new JLabel("Kebocoran");
		lblKebocoran.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKebocoran.setBounds(10, 474, 172, 19);
		//
		add(lblKebocoran);

		JRadioButton kondisilantai1_3 = new JRadioButton("Bocor");
		kondisilantai1_3.setBounds(198, 473, 109, 23);
		//
		add(kondisilantai1_3);

		JRadioButton kondisilantai1_4 = new JRadioButton("Tidak Bocor");
		kondisilantai1_4.setBounds(322, 473, 109, 23);
		//
		add(kondisilantai1_4);

		JLabel lblKerusakan = new JLabel("Kerusakan");
		lblKerusakan.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKerusakan.setBounds(10, 498, 172, 19);
		//
		add(lblKerusakan);

		JRadioButton kondisilantai = new JRadioButton("Rusak");
		kondisilantai.setBounds(198, 497, 109, 23);
		//
		add(kondisilantai);

		JRadioButton rdbtnTidakRusak = new JRadioButton("Tidak Rusak");
		rdbtnTidakRusak.setBounds(322, 497, 109, 23);
		add(rdbtnTidakRusak);

		JLabel lblKeausan = new JLabel("Keausan");
		lblKeausan.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKeausan.setBounds(10, 523, 172, 19);
		//
		add(lblKeausan);

		JRadioButton rdbtnAus = new JRadioButton("Aus");
		rdbtnAus.setBounds(198, 522, 109, 23);
		//
		add(rdbtnAus);

		JRadioButton rdbtnTidakAus = new JRadioButton("Tidak Aus");
		rdbtnTidakAus.setBounds(322, 523, 109, 23);
		//
		add(rdbtnTidakAus);

		JPanel lblLingkunganRuangKelas = new JPanel();
		lblLingkunganRuangKelas.setBounds(10, 11, 456,185);
		lblLingkunganRuangKelas.setBorder(new TitledBorder("Lingkungan Ruang Kelas"));
		add(lblLingkunganRuangKelas);
	
		JPanel lblKebersihanRuangKelas = new JPanel();
		lblKebersihanRuangKelas.setBounds(10, 206, 456, 185);
		lblKebersihanRuangKelas.setBorder(new TitledBorder("Kebersihan Ruang kelas"));
		add(lblKebersihanRuangKelas);
		
		JPanel label = new JPanel();
		label.setBorder(new TitledBorder("KENYAMANAN RUANG KELAS"));
		label.setBounds(3, 399, 456, 160);
		add(label);


	}

}
