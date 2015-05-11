package versi2;



import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class Tampilan32 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tampilan32 frame = new Tampilan32();
					frame.setSize(500,285);
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
	public Tampilan32() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 285);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKeamananRuangKelas = new JLabel("Keamanan Ruang Kelas");
		lblKeamananRuangKelas.setBounds(20, 11, 184, 14);
		contentPane.add(lblKeamananRuangKelas);
		
		JLabel label_1 = new JLabel("_____________________________________________________________________");
		label_1.setBounds(10, 14, 484, 14);
		contentPane.add(label_1);
		
		JLabel lblKekokohan = new JLabel("Kekokohan");
		lblKekokohan.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblKekokohan.setBounds(30, 36, 172, 19);
		contentPane.add(lblKekokohan);
		
		JRadioButton rdbtnKokoh = new JRadioButton("Kokoh");
		rdbtnKokoh.setBounds(196, 35, 90, 23);
		contentPane.add(rdbtnKokoh);
		
		JRadioButton rdbtnTidakKokoh = new JRadioButton("Tidak Kokoh");
		rdbtnTidakKokoh.setBounds(294, 35, 109, 23);
		contentPane.add(rdbtnTidakKokoh);
		
		JLabel lblKunciPintuDan = new JLabel("Kunci pintu dan Cendela");
		lblKunciPintuDan.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblKunciPintuDan.setBounds(30, 66, 172, 19);
		contentPane.add(lblKunciPintuDan);
		
		JRadioButton rdbtnAdaKunci = new JRadioButton("Ada Kunci");
		rdbtnAdaKunci.setBounds(196, 65, 90, 23);
		contentPane.add(rdbtnAdaKunci);
		
		JRadioButton rdbtnTidakAdaKunci = new JRadioButton("Tidak Ada Kunci");
		rdbtnTidakAdaKunci.setBounds(294, 65, 109, 23);
		contentPane.add(rdbtnTidakAdaKunci);
		
		JLabel lblTingkatBahaya = new JLabel("Tingkat Bahaya");
		lblTingkatBahaya.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblTingkatBahaya.setBounds(30, 96, 172, 19);
		contentPane.add(lblTingkatBahaya);
		
		JRadioButton rdbtnAman = new JRadioButton("Aman");
		rdbtnAman.setBounds(196, 95, 90, 23);
		contentPane.add(rdbtnAman);
		
		JRadioButton rdbtnTidakAman = new JRadioButton("Tidak Aman");
		rdbtnTidakAman.setBounds(294, 95, 109, 23);
		contentPane.add(rdbtnTidakAman);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(373, 162, 89, 23);
		contentPane.add(btnSubmit);
		
		JButton btnBack = new JButton("Back");
		btnBack.setBounds(268, 162, 89, 23);
		contentPane.add(btnBack);
	}

}
