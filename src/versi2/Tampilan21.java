package versi2;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

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


public class Tampilan21 extends JPanel {

	private JPanel contentPane;
	private JTextField JumlahKipasAngin= new JTextField();
	private JTextField KipasBerfungsi = new JTextField();
	private JTextField KipasTdkBerfungsi = new JTextField();;
	private JTextField JumlahAC= new JTextField();
	private JTextField JumlahCCTV= new JTextField();;
	private JTextField CCTVBerfungsi = new JTextField();;
	private JTextField CCTVTdkBerfungsi = new JTextField();
	

	
	private ButtonGroup kondisiAC = new ButtonGroup();
	JRadioButton AcBaik = new JRadioButton("Baik");
	JRadioButton AcKurangBaik = new JRadioButton("Kurang Baik");
	
	private ButtonGroup posisiAC = new ButtonGroup();
	JRadioButton AcBelakang = new JRadioButton("Belakang");
	JRadioButton AcSamping = new JRadioButton("Samping");
	JRadioButton AcLainlain_1 = new JRadioButton("Lain-lain");

	private ButtonGroup Hotspot = new ButtonGroup();
	JRadioButton UmmHospot = new JRadioButton("UMM HOTSPOT");
	JRadioButton SSIDLainlain = new JRadioButton("Lain-lain");

	private ButtonGroup login = new ButtonGroup();
	JRadioButton BisaLogin = new JRadioButton("Bisa Login");
	JRadioButton TidakBisaLogin = new JRadioButton("Tidak Bisa Login");
	
	private ButtonGroup posisiCCTV = new ButtonGroup();
	JRadioButton DepanBelakang = new JRadioButton("Depan & Belakang");
	JRadioButton Lainlain_3 = new JRadioButton("Lain-Lain");
	
	private ButtonGroup kipas = new ButtonGroup();
	JRadioButton KondisiKipas = new JRadioButton("Baik");
	JRadioButton KondisiKipas1 = new JRadioButton("Sebagian Tidak Bisa");
	
	private ButtonGroup cctv = new ButtonGroup();
	JRadioButton cctv1 = new JRadioButton("Baik");
	JRadioButton cctv2 = new JRadioButton("Sebgaian Tidak Bisa");
	/**
	 * Launch the application.
	 */

	public Tampilan21() {
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//	setBounds(100, 100, 500, 622);
		contentPane = new JPanel();
		//setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		setLayout(null);
		
		

		JLabel lblJumlahKipasAngin = new JLabel("Jumlah Kipas Angin");
		lblJumlahKipasAngin.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblJumlahKipasAngin.setBounds(20, 48, 190, 19);
		//
		add(lblJumlahKipasAngin);
		
		
		JumlahKipasAngin.setBounds(248, 48, 100, 20);
		add(JumlahKipasAngin);
		JumlahKipasAngin.setColumns(10);
		
		
		JLabel lblKondisiKipasAngin1 = new JLabel("Kondisi Kipas Kipas");
		lblKondisiKipasAngin1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKondisiKipasAngin1.setBounds(20, 100, 200, 23);
		add(lblKondisiKipasAngin1);
		
		
		KondisiKipas.setBounds(248, 100, 109, 23);
		add(KondisiKipas);
		
		KondisiKipas1.setBounds(248, 120, 200, 23);
		add(KondisiKipas1);
		kipas.add(KondisiKipas);
		kipas.add(KondisiKipas1);
		
		
		
		JLabel lblJumlahKipasAc = new JLabel("Jumlah AC");
		lblJumlahKipasAc.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblJumlahKipasAc.setBounds(20, 167, 172, 19);
		//
		add(lblJumlahKipasAc);
		
		
		JumlahAC.setBounds(248, 167, 100, 20);
		//
		add(JumlahAC);
		JumlahAC.setColumns(10);
		
		JLabel lblKondisiAc = new JLabel("Kondisi AC");
		lblKondisiAc.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKondisiAc.setBounds(20, 197, 172, 19);
		//
		add(lblKondisiAc);
		kondisiAC.add(AcBaik);
		kondisiAC.add(AcKurangBaik);
		
		AcBaik.setBounds(248, 193, 109, 23);
		//
		add(AcBaik);
		
		AcKurangBaik.setBounds(248, 210, 200, 23);
		//
		add(AcKurangBaik);
		
		JLabel lblPosisiAc = new JLabel("Posisi AC");
		lblPosisiAc.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPosisiAc.setBounds(20, 243, 172, 19);
		//
		add(lblPosisiAc);
		posisiAC.add(AcBelakang);
		posisiAC.add(AcSamping);
		posisiAC.add(AcLainlain_1);
		
		AcBelakang.setBounds(248, 242, 109, 23);
		//
		add(AcBelakang);
		
		AcSamping.setBounds(248, 261, 109, 23);
		add(AcSamping);
		
		
		AcLainlain_1.setBounds(248, 280, 109, 23);
		//
		add(AcLainlain_1);
		
		JLabel lblSsid = new JLabel("SSID");
		lblSsid.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblSsid.setBounds(22, 308, 172, 19);
		//
		add(lblSsid);
		Hotspot.add(UmmHospot);
		Hotspot.add(SSIDLainlain);
		
		UmmHospot.setBounds(248, 307, 130, 23);
		//
		add(UmmHospot);
		
		SSIDLainlain.setBounds(248, 325, 109, 23);
		//
		add(SSIDLainlain);
		
		JLabel lblBand = new JLabel("Bandwidht");
		lblBand.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblBand.setBounds(22, 354, 172, 19);
		//
		add(lblBand);
		login.add(BisaLogin);
		login.add(TidakBisaLogin);
		
		BisaLogin.setBounds(248, 351, 109, 23);
		//
		add(BisaLogin);

		TidakBisaLogin.setBounds(248, 369, 130, 23);
		//
		add(TidakBisaLogin);
		
		JLabel lblJumlahCctv = new JLabel("Jumlah CCTV");
		lblJumlahCctv.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblJumlahCctv.setBounds(20, 405, 172, 19);
		//
		add(lblJumlahCctv);
		
		
		JumlahCCTV.setBounds(248, 405, 100, 20);
		//
		add(JumlahCCTV);
		JumlahCCTV.setColumns(10);
		/*
		JLabel lblJumlahCctvYang = new JLabel("Jumlah CCTV Yang Bisa Berfungsi");
		lblJumlahCctvYang.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblJumlahCctvYang.setBounds(20, 435, 226, 19);
		add(lblJumlahCctvYang);
		
		
		CCTVBerfungsi.setBounds(248, 435, 100, 20);
		//
		add(CCTVBerfungsi);
		CCTVBerfungsi.setColumns(10);
		
		JLabel lblJumlahCctvYang_1 = new JLabel("Jumlah CCTV Yang Tidak Bisa");
		lblJumlahCctvYang_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblJumlahCctvYang_1.setBounds(20, 465, 209, 19);
		//
		add(lblJumlahCctvYang_1);
		
		JLabel lblBerfungsi_1 = new JLabel("Berfungsi");
		lblBerfungsi_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblBerfungsi_1.setBounds(20, 478, 226, 19);
		//
		add(lblBerfungsi_1);
		
		
		CCTVTdkBerfungsi.setBounds(248, 466, 100, 20);
		//
		add(CCTVTdkBerfungsi);
		CCTVTdkBerfungsi.setColumns(10);
		*/
		JLabel lblJumlahCctvYang = new JLabel("Keadan CCTV ");
		lblJumlahCctvYang.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblJumlahCctvYang.setBounds(20, 450, 226, 19);
		add(lblJumlahCctvYang);
		
		
		cctv1.setBounds(248, 450, 190, 23);
		add(cctv1);
		
		cctv2.setBounds(248, 465, 149, 23);
		add(cctv2);
		cctv.add(cctv1);
		cctv.add(cctv2);
		
		JLabel lblPosisiCctv = new JLabel("Posisi CCTV");
		lblPosisiCctv.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPosisiCctv.setBounds(20, 512, 226, 19);
		//
		add(lblPosisiCctv);
		posisiCCTV.add(DepanBelakang);
		posisiCCTV.add(Lainlain_3);
		
		DepanBelakang.setBounds(248, 511, 149, 23);
		//
		add(DepanBelakang);
		
		Lainlain_3.setBounds(248, 529, 109, 23);
		//
		add(Lainlain_3);
		
		JPanel label = new JPanel();
		label.setBorder(new TitledBorder("JUMLAH,KONDISI,DAN POSISI SARANA"));
		label.setBounds(10, 11, 456, 550);
		add(label);
		
	}
}
