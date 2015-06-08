package versi2;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Tampilan3 extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	JTextField IntensitasCahaya = new JTextField();
	JTextField Kelembapan=new JTextField();
	JTextField Suhu= new JTextField();
	
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
	
	private ButtonGroup bau = new ButtonGroup();
	JRadioButton rdbtnBau = new JRadioButton("Bau");
	JRadioButton rdbtnTidakBau = new JRadioButton("Tidak Bau");
	
	private ButtonGroup kebocoran = new ButtonGroup();
	JRadioButton kebocoran1 = new JRadioButton("Bocor");
	JRadioButton kebocoran2 = new JRadioButton("Tidak Bocor");
	
	private ButtonGroup kerusakan = new ButtonGroup();
	JRadioButton kerusakan1 = new JRadioButton("Rusak");
	JRadioButton kerusakan2 = new JRadioButton("Tidak Rusak");
	
	private ButtonGroup aus = new ButtonGroup();
	JRadioButton rdbtnAus = new JRadioButton("Aus");
	JRadioButton rdbtnTidakAus = new JRadioButton("Tidak Aus");
	// private ButtonGroup login = new ButtonGroup();

	 
	 
	public Tampilan3(RuangKelas kelas) {
		setLayout(null);
		
		JLabel lblKondisiLantai = new JLabel("Kondisi Lantai");
		lblKondisiLantai.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKondisiLantai.setBounds(20, 45, 172, 19);
		
		add(lblKondisiLantai);
		
		if(kelas!=null){
			 if(kelas.getKondisiObjek("Kondisi Lantai").equals("Baik"))kondisilantai1.setSelected(true);
			 else if(kelas.getKondisiObjek("Kondisi Lantai").equals("Buruk"))kondisilantai2.setSelected(true);
			 
			 if(kelas.getKondisiObjek("Kondisi Dinding").equals("Baik"))kondisidinding.setSelected(true);
			 else if(kelas.getKondisiObjek("Kondisi Dinding").equals("Buruk"))kondisidinding1.setSelected(true);
			 
			 if(kelas.getKondisiObjek("Kondisi Atap").equals("Baik"))kondisiAtap.setSelected(true);
			 else if(kelas.getKondisiObjek("Kondisi Atap1").equals("Buruk"))kondisiAtap1.setSelected(true);
			 
			 if(kelas.getKondisiObjek("Kondisi Pintu").equals("Baik"))Kondisipintu.setSelected(true);
			 else if(kelas.getKondisiObjek("Kondisi Pintu").equals("Buruk"))Kondisipintu1.setSelected(true);
			 
			 if(kelas.getKondisiObjek("Kondisi Jendela").equals("Baik"))kondisiCendela.setSelected(true);
			 else if(kelas.getKondisiObjek("Kondisi Jendela").equals("Buruk"))kondisiCendela1.setSelected(true);
			
			 if(kelas.getKondisiObjek("Sirkulasi Udara").equals("Baik"))kondisiudara.setSelected(true);
			 else if(kelas.getKondisiObjek("Sirkulasi Udara").equals("Buruk"))kondisiudara1.setSelected(true);
			
			 IntensitasCahaya.setText(kelas.getNilaiObjek("Intesitas Cahaya"));
			 Kelembapan.setText(kelas.getNilaiObjek("Kelembapan"));
			 Suhu.setText(kelas.getNilaiObjek("Suhu"));
			 
			 if(kelas.getKondisiObjek("Kebisingan").equals("Baik"))kebisingan.setSelected(true);
			 else if(kelas.getKondisiObjek("Kebisingan").equals("Buruk"))kebisingan1.setSelected(true);
			 
			 if(kelas.getKondisiObjek("Bau").equals("Baik"))rdbtnBau.setSelected(true);
			 else if(kelas.getKondisiObjek("Bau").equals("Buruk"))rdbtnTidakBau.setSelected(true);
			 	 
			 if(kelas.getKondisiObjek("Kebocoran").equals("Baik"))kebocoran1.setSelected(true);
			 else if(kelas.getKondisiObjek("Kebocoran").equals("Buruk"))kebocoran2.setSelected(true);
			 
			 if(kelas.getKondisiObjek("Keausan").equals("Baik"))rdbtnAus.setSelected(true);
			 else if(kelas.getKondisiObjek("Keausan").equals("Buruk"))rdbtnTidakAus.setSelected(true);
			 
			 if(kelas.getKondisiObjek("Kerusakan").equals("Baik"))kerusakan1.setSelected(true);
			 else if(kelas.getKondisiObjek("Kerusakan").equals("Buruk"))kerusakan2.setSelected(true);
		}
		
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

		
		IntensitasCahaya.setBounds(198, 279, 38, 30);
		//
		add(IntensitasCahaya);
		IntensitasCahaya.setColumns(10);

		JLabel lblKelembapan = new JLabel("Kelembapan");
		lblKelembapan.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKelembapan.setBounds(20, 319, 172, 19);
		//
		add(lblKelembapan);

		Kelembapan.setBounds(198, 319, 38, 30);
		//
		add(Kelembapan);
		Kelembapan.setColumns(10);

		JLabel lblSuhu = new JLabel("Suhu");
		lblSuhu.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSuhu.setBounds(20, 354, 172, 19);
		//
		add(lblSuhu);

		Suhu.setBounds(199, 354, 37, 30);
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

		
		rdbtnBau.setBounds(198, 449, 109, 23);
		add(rdbtnBau);
		
		rdbtnTidakBau.setBounds(322, 449, 109, 23);
		add(rdbtnTidakBau);
		bau.add(rdbtnBau);
		bau.add(rdbtnTidakBau);
		JLabel lblKebocoran = new JLabel("Kebocoran");
		lblKebocoran.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKebocoran.setBounds(10, 474, 172, 19);
		//
		add(lblKebocoran);

		
		kebocoran1.setBounds(198, 473, 109, 23);
		add(kebocoran1);
		
		kebocoran2.setBounds(322, 473, 109, 23);
		add(kebocoran2);
		kebocoran.add(kebocoran1);
		kebocoran.add(kebocoran2);
		
		JLabel lblKerusakan = new JLabel("Kerusakan");
		lblKerusakan.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKerusakan.setBounds(10, 498, 172, 19);
		//
		add(lblKerusakan);

		
		kerusakan1.setBounds(198, 497, 109, 23);
		add(kerusakan1);
		
		
		kerusakan2.setBounds(322, 497, 109, 23);
		add(kerusakan2);
		kerusakan.add(kerusakan1);
		kerusakan.add(kerusakan2);

		JLabel lblKeausan = new JLabel("Keausan");
		lblKeausan.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKeausan.setBounds(10, 523, 172, 19);
		//
		add(lblKeausan);

		
		rdbtnAus.setBounds(198, 522, 109, 23);
		add(rdbtnAus);
		rdbtnTidakAus.setBounds(322, 523, 109, 23);
		add(rdbtnTidakAus);
		aus.add(rdbtnAus);
		aus.add(rdbtnTidakAus);
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
