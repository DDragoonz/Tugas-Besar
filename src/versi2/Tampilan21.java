package versi2;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Tampilan21 extends JFrame {

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
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tampilan21 frame = new Tampilan21();
					frame.setSize(500,622);
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
	public Tampilan21() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 622);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Jumlah,Kondisi dan Posisi Sarana");
		label.setBounds(10, 11, 184, 14);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("_____________________________________________________________________");
		label_1.setBounds(10, 14, 484, 14);
		contentPane.add(label_1);
		
		JLabel lblJumlahKipasAngin = new JLabel("Jumlah Kipas Angin");
		lblJumlahKipasAngin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblJumlahKipasAngin.setBounds(20, 48, 172, 19);
		contentPane.add(lblJumlahKipasAngin);
		
		
		JumlahKipasAngin.setBounds(248, 48, 100, 20);
		contentPane.add(JumlahKipasAngin);
		JumlahKipasAngin.setColumns(10);
		
		JLabel lblKondisiKipasAngin = new JLabel("Jumlah Kipas Angin yang berfungsi");
		lblKondisiKipasAngin.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblKondisiKipasAngin.setBounds(22, 79, 224, 19);
		contentPane.add(lblKondisiKipasAngin);
		
		
		KipasBerfungsi.setBounds(248, 79, 100, 20);
		contentPane.add(KipasBerfungsi);
		KipasBerfungsi.setColumns(10);
		
		JLabel lblJumlahKipasAngin_1 = new JLabel("Jumlah Kipas Angin yang Tidak");
		lblJumlahKipasAngin_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblJumlahKipasAngin_1.setBounds(20, 109, 253, 19);
		contentPane.add(lblJumlahKipasAngin_1);
		
		JLabel lblBerfungsi = new JLabel("berfungsi");
		lblBerfungsi.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblBerfungsi.setBounds(20, 126, 172, 19);
		contentPane.add(lblBerfungsi);
		
		
		KipasTdkBerfungsi.setBounds(248, 109, 100, 20);
		contentPane.add(KipasTdkBerfungsi);
		KipasTdkBerfungsi.setColumns(10);
		
		JLabel lblJumlahKipasAc = new JLabel("Jumlah AC");
		lblJumlahKipasAc.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblJumlahKipasAc.setBounds(20, 167, 172, 19);
		contentPane.add(lblJumlahKipasAc);
		
		
		JumlahAC.setBounds(248, 167, 100, 20);
		contentPane.add(JumlahAC);
		JumlahAC.setColumns(10);
		
		JLabel lblKondisiAc = new JLabel("Kondisi AC");
		lblKondisiAc.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblKondisiAc.setBounds(20, 197, 172, 19);
		contentPane.add(lblKondisiAc);
		kondisiAC.add(AcBaik);
		kondisiAC.add(AcKurangBaik);
		
		AcBaik.setBounds(248, 193, 109, 23);
		contentPane.add(AcBaik);
		
		AcKurangBaik.setBounds(248, 210, 109, 23);
		contentPane.add(AcKurangBaik);
		
		JLabel lblPosisiAc = new JLabel("Posisi AC");
		lblPosisiAc.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblPosisiAc.setBounds(20, 243, 172, 19);
		contentPane.add(lblPosisiAc);
		posisiAC.add(AcBelakang);
		posisiAC.add(AcSamping);
		posisiAC.add(AcLainlain_1);
		
		AcBelakang.setBounds(248, 242, 109, 23);
		contentPane.add(AcBelakang);
		
		AcSamping.setBounds(248, 261, 109, 23);
		contentPane.add(AcSamping);
		
		
		AcLainlain_1.setBounds(248, 280, 109, 23);
		contentPane.add(AcLainlain_1);
		
		JLabel lblSsid = new JLabel("SSID");
		lblSsid.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblSsid.setBounds(22, 308, 172, 19);
		contentPane.add(lblSsid);
		Hotspot.add(UmmHospot);
		Hotspot.add(SSIDLainlain);
		
		UmmHospot.setBounds(248, 307, 130, 23);
		contentPane.add(UmmHospot);
		
		SSIDLainlain.setBounds(248, 325, 109, 23);
		contentPane.add(SSIDLainlain);
		
		JLabel lblBand = new JLabel("Bandwidht");
		lblBand.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblBand.setBounds(22, 354, 172, 19);
		contentPane.add(lblBand);
		login.add(BisaLogin);
		login.add(TidakBisaLogin);
		
		BisaLogin.setBounds(248, 351, 109, 23);
		contentPane.add(BisaLogin);

		TidakBisaLogin.setBounds(248, 369, 130, 23);
		contentPane.add(TidakBisaLogin);
		
		JLabel lblJumlahCctv = new JLabel("Jumlah CCTV");
		lblJumlahCctv.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblJumlahCctv.setBounds(20, 405, 172, 19);
		contentPane.add(lblJumlahCctv);
		
		
		JumlahCCTV.setBounds(248, 405, 100, 20);
		contentPane.add(JumlahCCTV);
		JumlahCCTV.setColumns(10);
		
		JLabel lblJumlahCctvYang = new JLabel("Jumlah CCTV Yang Bisa Berfungsi");
		lblJumlahCctvYang.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblJumlahCctvYang.setBounds(20, 435, 226, 19);
		contentPane.add(lblJumlahCctvYang);
		
		
		CCTVBerfungsi.setBounds(248, 435, 100, 20);
		contentPane.add(CCTVBerfungsi);
		CCTVBerfungsi.setColumns(10);
		
		JLabel lblJumlahCctvYang_1 = new JLabel("Jumlah CCTV Yang Tidak Bisa");
		lblJumlahCctvYang_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblJumlahCctvYang_1.setBounds(20, 465, 209, 19);
		contentPane.add(lblJumlahCctvYang_1);
		
		JLabel lblBerfungsi_1 = new JLabel("Berfungsi");
		lblBerfungsi_1.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblBerfungsi_1.setBounds(20, 478, 226, 19);
		contentPane.add(lblBerfungsi_1);
		
		
		CCTVTdkBerfungsi.setBounds(248, 466, 100, 20);
		contentPane.add(CCTVTdkBerfungsi);
		CCTVTdkBerfungsi.setColumns(10);
		
		JLabel lblPosisiCctv = new JLabel("Posisi CCTV");
		lblPosisiCctv.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblPosisiCctv.setBounds(20, 512, 226, 19);
		contentPane.add(lblPosisiCctv);
		posisiCCTV.add(DepanBelakang);
		posisiCCTV.add(Lainlain_3);
		
		DepanBelakang.setBounds(248, 511, 149, 23);
		contentPane.add(DepanBelakang);
		
		Lainlain_3.setBounds(248, 529, 109, 23);
		contentPane.add(Lainlain_3);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Tampilan3 panggil = new Tampilan3();
			dispose();
			panggil.show();
			}
		});
		btnNext.setBounds(385, 557, 89, 23);
		contentPane.add(btnNext);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			dispose();
			Tampilan2 panggil = new Tampilan2();
			panggil.show();
			}
		});
		btnBack.setBounds(283, 557, 89, 23);
		contentPane.add(btnBack);
		
	}
}
