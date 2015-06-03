package versi2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Menampilkan1 extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menampilkan1 frame = new Menampilkan1();
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
	public Menampilkan1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 661, 481);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnExit = new JButton("Exit");
		btnExit.setBounds(20, 408, 615, 23);
		contentPane.add(btnExit);
		
		JLabel lblIdentitasRuang = new JLabel("IDENTITAS RUANG KELAS");
		lblIdentitasRuang.setBounds(20, 11, 191, 26);
		lblIdentitasRuang.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		lblIdentitasRuang.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblIdentitasRuang);
		
		table = new JTable();
		table.setBounds(20, 130, 615, 277);
		contentPane.add(table);
		
		JLabel lblNamaRuang = new JLabel("Nama Ruangan		:");
		lblNamaRuang.setBounds(20, 37, 126, 23);
		contentPane.add(lblNamaRuang);
		
		JLabel lblLokasiRuang = new JLabel("Lokasi Ruangan		:");
		lblLokasiRuang.setBounds(20, 61, 126, 22);
		contentPane.add(lblLokasiRuang);
		
		JLabel lblFakultas = new JLabel("Fakultas		:");
		lblFakultas.setBounds(20, 83, 126, 23);
		contentPane.add(lblFakultas);
		
		JButton btnFakultas = new JButton("Load");
		btnFakultas.setBounds(20, 106, 615, 23);
		contentPane.add(btnFakultas);
	}
}
