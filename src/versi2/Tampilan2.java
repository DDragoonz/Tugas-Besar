package versi2;



import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Tampilan2 extends JFrame {

	private JPanel contentPane;
	private JTextField JumlahStopKontak;
	private JTextField JumlahKabelLCD;
	private JTextField JumlahLampu;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tampilan2 frame = new Tampilan2();
					frame.setVisible(true);
					frame.setSize(500,596);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tampilan2() {
		setTitle("keLAS");
		//Tampilan2 frame = new Tampilan2();
		setVisible(true);
		setSize(500,596);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 596);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblJumlahStopKontaksteker = new JLabel("Jumlah Stop Kontak/Steker");
		lblJumlahStopKontaksteker.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblJumlahStopKontaksteker.setBounds(22, 45, 172, 19);
		contentPane.add(lblJumlahStopKontaksteker);
		
		JumlahStopKontak = new JTextField();
		JumlahStopKontak.setBounds(249, 45, 137, 20);
		contentPane.add(JumlahStopKontak);
		JumlahStopKontak.setColumns(10);
		
		JLabel KondisiStopKontak = new JLabel("Kondisi Stop Kontak/Steker");
		KondisiStopKontak.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		KondisiStopKontak.setBounds(22, 89, 172, 19);
		contentPane.add(KondisiStopKontak);
		
		JLabel label = new JLabel("Jumlah Stop Kontak/Steker");
		label.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label.setBounds(22, 138, 172, 19);
		contentPane.add(label);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Dekat Dosen");
		rdbtnNewRadioButton.setBounds(249, 138, 109, 19);
		contentPane.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Dekat Mahasiswa dan dosen");
		rdbtnNewRadioButton_1.setBounds(249, 154, 200, 19);
		contentPane.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnLainlain = new JRadioButton("Lain-Lain");
		rdbtnLainlain.setBounds(249, 170, 109, 19);
		contentPane.add(rdbtnLainlain);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Baik");
		rdbtnNewRadioButton_2.setBounds(249, 88, 109, 19);
		contentPane.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Kurang Baik");
		rdbtnNewRadioButton_3.setBounds(249, 104, 109, 23);
		contentPane.add(rdbtnNewRadioButton_3);
		
		JLabel lblJumlahKabelLcd = new JLabel("Jumlah Kabel LCD");
		lblJumlahKabelLcd.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblJumlahKabelLcd.setBounds(22, 210, 172, 19);
		contentPane.add(lblJumlahKabelLcd);
		
		JumlahKabelLCD = new JTextField();
		JumlahKabelLCD.setBounds(249, 207, 137, 20);
		contentPane.add(JumlahKabelLCD);
		JumlahKabelLCD.setColumns(10);
		
		JLabel lblKondisiKabelLcd = new JLabel("Kondisi Kabel LCD");
		lblKondisiKabelLcd.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblKondisiKabelLcd.setBounds(22, 255, 172, 19);
		contentPane.add(lblKondisiKabelLcd);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("Berfungsi");
		rdbtnNewRadioButton_4.setBounds(249, 251, 109, 23);
		contentPane.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("Tidak Berfungsi");
		rdbtnNewRadioButton_5.setBounds(249, 269, 150, 23);
		contentPane.add(rdbtnNewRadioButton_5);
		
		JLabel lblPosisiKabelLcd = new JLabel("Posisi Kabel LCD");
		lblPosisiKabelLcd.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblPosisiKabelLcd.setBounds(22, 313, 172, 19);
		contentPane.add(lblPosisiKabelLcd);
		
		JLabel label_1 = new JLabel("_____________________________________________________________________");
		label_1.setBounds(10, 23, 484, 14);
		contentPane.add(label_1);
		
		JLabel lblJumlahkondisiDanPosisi = new JLabel("Jumlah,Kondisi dan Posisi Sarana");
		lblJumlahkondisiDanPosisi.setBounds(10, 20, 184, 14);
		contentPane.add(lblJumlahkondisiDanPosisi);
		
		JRadioButton radioButton = new JRadioButton("Dekat Dosen");
		radioButton.setBounds(249, 313, 109, 19);
		contentPane.add(radioButton);
		
		JRadioButton radioButton_1 = new JRadioButton("Dekat Mahasiswa dan dosen");
		radioButton_1.setBounds(249, 329, 200, 19);
		contentPane.add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("Lain-Lain");
		radioButton_2.setBounds(249, 345, 109, 19);
		contentPane.add(radioButton_2);
		
		JLabel lblJumlah = new JLabel("Jumlah Lampu");
		lblJumlah.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblJumlah.setBounds(22, 378, 172, 19);
		contentPane.add(lblJumlah);
		
		JumlahLampu = new JTextField();
		JumlahLampu.setBounds(249, 378, 137, 19);
		contentPane.add(JumlahLampu);
		JumlahLampu.setColumns(10);
		
		JLabel lblLampuYangHidup = new JLabel("Kondisi Lampu ");
		lblLampuYangHidup.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblLampuYangHidup.setBounds(22, 408, 172, 19);
		contentPane.add(lblLampuYangHidup);
		
		JButton Next0 = new JButton("Next");
		Next0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//pindah frame......
				
			}
		});
		Next0.setBounds(376, 520, 89, 23);
		contentPane.add(Next0);
		
		JRadioButton radioButton_3 = new JRadioButton("Lain-Lain");
		radioButton_3.setBounds(250, 475, 100, 19);
		contentPane.add(radioButton_3);
		
		JRadioButton radioButton_4 = new JRadioButton("Di Atap");
		radioButton_4.setBounds(250, 454, 109, 23);
		contentPane.add(radioButton_4);
		
		JLabel label_2 = new JLabel("Posisi Lampu");
		label_2.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		label_2.setBounds(22, 455, 172, 19);
		contentPane.add(label_2);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnBack.setBounds(269, 520, 89, 23);
		contentPane.add(btnBack);
		
		JRadioButton rdbtnSemuaHidup = new JRadioButton("Semua Hidup");
		rdbtnSemuaHidup.setBounds(249, 407, 109, 23);
		contentPane.add(rdbtnSemuaHidup);
		
		JRadioButton rdbtnAdaYang = new JRadioButton("Ada yang mati");
		rdbtnAdaYang.setBounds(249, 428, 109, 23);
		contentPane.add(rdbtnAdaYang);
	}
}
