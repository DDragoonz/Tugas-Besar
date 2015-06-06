package versi2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.ButtonGroup;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JRadioButton;
import javax.swing.JButton;

import sun.net.www.content.audio.basic;


public class Tampilan2 extends JPanel {

	
	
	private JPanel contentPane;
	private JTextField JumlahStopKontak;
	private JTextField JumlahKabelLCD;
	private JTextField JumlahLampu;

	private ButtonGroup posisiSteker = new ButtonGroup();
	private JRadioButton rbPosisiSteker1 = new JRadioButton("Dekat Dosen");
	private JRadioButton rbPosisiSteker2 = new JRadioButton("Dekat Mahasiswa dan dosen");
	private JRadioButton rbPosisiSteker3 = new JRadioButton("Lain-Lain");
	
	private ButtonGroup kondisiSteker = new ButtonGroup();
	private JRadioButton rbKondisiSteker1 = new JRadioButton("Baik");
	private JRadioButton rbKondisiSteker2 = new JRadioButton("Kurang Baik");
	
	private ButtonGroup kondisiLCD = new ButtonGroup();
	private JRadioButton rbKondisiLCD1 = new JRadioButton("Berfungsi");
	private JRadioButton rbKondisiLCD2 = new JRadioButton("Tidak Berfungsi");
	
	private ButtonGroup posisiLCD = new ButtonGroup();
	private JRadioButton rbPosisiLCD1 = new JRadioButton("Dekat Dosen");
	private JRadioButton rbPosisiLCD2 = new JRadioButton("Dekat Mahasiswa dan dosen");
	private JRadioButton rbPosisiLCD3 = new JRadioButton("Lain-Lain");
	
	private ButtonGroup posisiLampu = new ButtonGroup();
	private JRadioButton rbPosisiLampu1 = new JRadioButton("Lain-Lain");
	private JRadioButton rbPosisiLampu2 = new JRadioButton("Di Atap");
	
	private ButtonGroup kondisiLampu = new ButtonGroup();
	private JRadioButton rbKondisiLampu1 = new JRadioButton("Semua Hidup");
	private JRadioButton rbKondisiLampu2 = new JRadioButton("Ada yang mati");

	/**
	 * Launch the application.
	 */

	
	
	public Tampilan2() {
		setLayout(null);
		//setTitle("keLAS");
		setVisible(true);
		setSize(500,650);
		//setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 500, 596);
		contentPane = new JPanel();
		setBorder(new EmptyBorder(5, 5, 5, 5));
		//setContentPane(contentPane);
		setLayout(null);
		
		JLabel lblJumlahStopKontaksteker = new JLabel("Jumlah Stop Kontak/Steker");
		lblJumlahStopKontaksteker.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblJumlahStopKontaksteker.setBounds(22, 45, 200, 19);
		//
		add(lblJumlahStopKontaksteker);
		
		JumlahStopKontak = new JTextField();
		JumlahStopKontak.setBounds(249, 45, 200, 20);
		add(JumlahStopKontak);
		JumlahStopKontak.setColumns(10);
		
		JLabel KondisiStopKontak = new JLabel("Kondisi Stop Kontak/Steker");
		KondisiStopKontak.setFont(new Font("Times New Roman", Font.BOLD, 15));
		KondisiStopKontak.setBounds(22, 89, 200, 19);
		//
		add(KondisiStopKontak);
		
		JLabel label = new JLabel("Posisi Stop Kontak/Steker");
		label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label.setBounds(22, 138, 200, 19);
		//
		add(label);
		
		
		rbPosisiSteker1.setBounds(249, 138, 109, 19);
		//
		add(rbPosisiSteker1);
				
		rbPosisiSteker2.setBounds(249, 154, 200, 19);
		//
		add(rbPosisiSteker2);

		rbPosisiSteker3.setBounds(249, 170, 109, 19);
		//
		add(rbPosisiSteker3);
		
		posisiSteker.add(rbPosisiSteker1);
		posisiSteker.add(rbPosisiSteker2);
		posisiSteker.add(rbPosisiSteker3);
		
		
		rbKondisiSteker1.setBounds(249, 88, 109, 19);
		//
		add(rbKondisiSteker1);
		
		rbKondisiSteker2.setBounds(249, 104, 109, 23);
		//
		add(rbKondisiSteker2);
		
		kondisiSteker.add(rbKondisiSteker1);
		kondisiSteker.add(rbKondisiSteker2);
		
		JLabel lblJumlahKabelLcd = new JLabel("Jumlah Kabel LCD");
		lblJumlahKabelLcd.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblJumlahKabelLcd.setBounds(22, 210, 172, 19);
		//
		add(lblJumlahKabelLcd);
		
		JumlahKabelLCD = new JTextField();
		JumlahKabelLCD.setBounds(249, 207, 137, 20);
		//
		add(JumlahKabelLCD);
		JumlahKabelLCD.setColumns(10);
		
		JLabel lblKondisiKabelLcd = new JLabel("Kondisi Kabel LCD");
		lblKondisiKabelLcd.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKondisiKabelLcd.setBounds(22, 255, 172, 19);
		//
		add(lblKondisiKabelLcd);
		
		
		rbKondisiLCD1.setBounds(249, 251, 109, 23);
		//
		add(rbKondisiLCD1);
		
		rbKondisiLCD2.setBounds(249, 269, 150, 23);
		//
		add(rbKondisiLCD2);
		
		kondisiLCD.add(rbKondisiLCD1);
		kondisiLCD.add(rbKondisiLCD2);
		
		JLabel lblPosisiKabelLcd = new JLabel("Posisi Kabel LCD");
		lblPosisiKabelLcd.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblPosisiKabelLcd.setBounds(22, 313, 172, 19);
		//
		add(lblPosisiKabelLcd);

		
		rbPosisiLCD1.setBounds(249, 313, 109, 19);
		
		add(rbPosisiLCD1);

		rbPosisiLCD2.setBounds(249, 329, 200, 19);
		//
		add(rbPosisiLCD2);

		rbPosisiLCD3.setBounds(249, 345, 109, 19);
		//
		add(rbPosisiLCD3);
		
		posisiLCD.add(rbPosisiLCD1);
		posisiLCD.add(rbPosisiLCD2);
		posisiLCD.add(rbPosisiLCD3);
		
		JLabel lblJumlah = new JLabel("Jumlah Lampu");
		lblJumlah.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblJumlah.setBounds(22, 378, 172, 19);
		//
		add(lblJumlah);
		
		JumlahLampu = new JTextField();
		JumlahLampu.setBounds(249, 378, 137, 19);
		//
		add(JumlahLampu);
		JumlahLampu.setColumns(10);
		
		JLabel lblLampuYangHidup = new JLabel("Kondisi Lampu ");
		lblLampuYangHidup.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblLampuYangHidup.setBounds(22, 408, 172, 19);
	//	
		add(lblLampuYangHidup);
		
		

		rbPosisiLampu1.setBounds(250, 475, 100, 19);
		add(rbPosisiLampu1);

		rbPosisiLampu2.setBounds(250, 454, 109, 23);
		add(rbPosisiLampu2);
		
		posisiLampu.add(rbPosisiLampu1);
		posisiLampu.add(rbPosisiLampu2);
		
		JLabel label_2 = new JLabel("Posisi Lampu");
		label_2.setFont(new Font("Times New Roman", Font.BOLD, 15));
		label_2.setBounds(22, 455, 172, 19);
		//
		add(label_2);
		
		
		rbKondisiLampu1.setBounds(249, 407, 109, 23);
		//
		add(rbKondisiLampu1);

		rbKondisiLampu2.setBounds(249, 428, 109, 23);
		//
		add(rbKondisiLampu2);
		
		kondisiLampu.add(rbKondisiLampu1);
		kondisiLampu.add(rbKondisiLampu2);
		
		JPanel lblJumlahkondisiDanPosisi = new JPanel();
		lblJumlahkondisiDanPosisi.setBorder(new TitledBorder("JUMLAH,KONDISI DAN POSISI SARANA"));
		lblJumlahkondisiDanPosisi.setBounds(10, 20, 456, 500);
		add(lblJumlahkondisiDanPosisi);
	}
}
