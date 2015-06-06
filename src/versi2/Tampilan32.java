package versi2;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JRadioButton;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Tampilan32 extends JPanel {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public Tampilan32() {
		setLayout(null);
		setSize(500,650);
		
		
	
		
		JLabel lblKekokohan = new JLabel("Kekokohan");
		lblKekokohan.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblKekokohan.setBounds(30, 36, 172, 19);
		add(lblKekokohan);
		
		JRadioButton rdbtnKokoh = new JRadioButton("Kokoh");
		rdbtnKokoh.setBounds(196, 35, 90, 23);
		add(rdbtnKokoh);
		
		JRadioButton rdbtnTidakKokoh = new JRadioButton("Tidak Kokoh");
		rdbtnTidakKokoh.setBounds(294, 35, 109, 23);
		add(rdbtnTidakKokoh);
		
		JLabel lblKunciPintuDan = new JLabel("Kunci pintu dan Cendela");
		lblKunciPintuDan.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblKunciPintuDan.setBounds(30, 66, 172, 19);
		add(lblKunciPintuDan);
		
		JRadioButton rdbtnAdaKunci = new JRadioButton("Ada Kunci");
		rdbtnAdaKunci.setBounds(196, 65, 90, 23);
		add(rdbtnAdaKunci);
		
		JRadioButton rdbtnTidakAdaKunci = new JRadioButton("Tidak Ada Kunci");
		rdbtnTidakAdaKunci.setBounds(294, 65, 109, 23);
		add(rdbtnTidakAdaKunci);
		
		JLabel lblTingkatBahaya = new JLabel("Tingkat Bahaya");
		lblTingkatBahaya.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTingkatBahaya.setBounds(30, 96, 172, 19);
		add(lblTingkatBahaya);
		
		JRadioButton rdbtnAman = new JRadioButton("Aman");
		rdbtnAman.setBounds(196, 95, 90, 23);
		add(rdbtnAman);
		
		JRadioButton rdbtnTidakAman = new JRadioButton("Tidak Aman");
		rdbtnTidakAman.setBounds(294, 95, 109, 23);
		add(rdbtnTidakAman);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(373, 162, 89, 23);
		add(btnSubmit);
		
		JPanel lblKeamananRuangKelas = new JPanel();
		lblKeamananRuangKelas.setBorder(new TitledBorder("KEAMANAN RUANG KELAS"));
		lblKeamananRuangKelas.setBounds(20, 11, 420, 120);
		add(lblKeamananRuangKelas);
	}

}
