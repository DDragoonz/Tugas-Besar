package versi2;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.border.LineBorder;

import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.SwingConstants;

public class Login extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textadmin;
	private JPasswordField passwordField;
	private Kontrol kontrol = new Kontrol();
	private boolean login = false;
	private TampilanKelas TK = new TampilanKelas();
	private RuangKelas kelas;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Inventaris Lab v 1.0.17");
		try {
			UIManager.setLookAndFeel(new NimbusLookAndFeel());
		} catch ( Exception e) {
			// TODO: handle exception
		}
		setResizable(false);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 380);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel.setBounds(20, 11, 257, 150);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel lblLoginDuluKa = new JLabel("LOGIN DULU KAKAK");
		lblLoginDuluKa.setBounds(60, 11, 123, 14);
		panel.add(lblLoginDuluKa);
		lblLoginDuluKa.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		JLabel lblADMINNAME = new JLabel("ADMINNAME");
		lblADMINNAME.setBounds(10, 49, 82, 16);
		panel.add(lblADMINNAME);
		lblADMINNAME.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		JLabel lblpass = new JLabel("PASSWORD");
		lblpass.setBounds(10, 84, 70, 16);
		panel.add(lblpass);
		lblpass.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		
		textadmin = new JTextField();
		textadmin.setBounds(112, 46, 102, 23);
		panel.add(textadmin);
		textadmin.setColumns(10);
		
		JButton btnLogin = new JButton("LOGIN");
		btnLogin.setBounds(112, 116, 102, 23);
		panel.add(btnLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(112, 82, 102, 21);
		panel.add(passwordField);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_1.setBounds(287, 11, 418, 310);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblMenu = new JLabel("MENU KELAS");
		lblMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblMenu.setFont(new Font("Urdu Typesetting", Font.BOLD, 14));
		lblMenu.setBounds(123, 11, 200, 25);
		panel_1.add(lblMenu);
		
		JButton btnInputdata = new JButton("INPUT DATA");
		btnInputdata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MainFrame(null,Login.this).setVisible(true);
				dispose();
			}
		});
		btnInputdata.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnInputdata.setEnabled(false);
		btnInputdata.setBounds(123, 62, 200, 25);
		panel_1.add(btnInputdata);
		
		JButton btnEditData = new JButton("EDIT DATA");
		btnEditData.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		btnEditData.setEnabled(false);
		btnEditData.setBounds(123, 105, 200, 25);
		panel_1.add(btnEditData);
		btnEditData.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				RuangKelas kelas = kontrol.load();
				if(kelas!=null){
					new MainFrame(kelas, Login.this).setVisible(true);
					dispose();
				}
			}
		});
		
		JButton lihatdata = new JButton("LIHAT DATA");
		lihatdata.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		//lihatdata.setEnabled(false);
		lihatdata.setBounds(123, 148, 200, 25);
		panel_1.add(lihatdata);
		lihatdata.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				kelas = kontrol.load();
				if(kelas!=null){
					getContentPane().remove(contentPane);
					TK.init(kelas, login);
					setContentPane(TK);
					revalidate();
					repaint();
				}
				
			}
		});
		
		TK.editButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				new MainFrame(kelas,Login.this);
				
				dispose();
			}
		});
		
		TK.hapusButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				kontrol.hapusKelas();
				kelas = null;
				getContentPane().remove(TK);
				setContentPane(contentPane);
				revalidate();
				repaint();
			}
		});
		
		TK.backButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				getContentPane().remove(TK);
				setContentPane(contentPane);
				revalidate();
				repaint();
			}
		});
		
		JButton btnexit = new JButton("EXIT");
		btnexit.setBounds(123, 194, 200, 36);
		//btnexit.setEnabled(false);
		panel_1.add(btnexit);
		btnexit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));

		panel_2.setBounds(20, 11, 257, 150);
		contentPane.add(panel_2);
		panel_2.setVisible(false);
		panel_2.setLayout(null);
		
		JLabel lblLoginSuksesKakak = new JLabel("LOGIN SUKSES KAKAK");
		lblLoginSuksesKakak.setBounds(50, 52, 138, 14);
		panel_2.add(lblLoginSuksesKakak);
		lblLoginSuksesKakak.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		JLabel WELCOME = new JLabel();
		WELCOME.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		WELCOME.setBounds(50, 60, 150, 31);
		panel_2.add(WELCOME);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setBounds(70, 110, 102, 23);
		panel_2.add(btnLogout);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		panel_3.setBounds(20, 172, 257, 149);
		contentPane.add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblTemplateKelas = new JLabel("Template Kelas");
		lblTemplateKelas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTemplateKelas.setBounds(20, 19, 102, 34);
		panel_3.add(lblTemplateKelas);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(132, 19, 102, 34);
		comboBox.addItem("Default");
		panel_3.add(comboBox);
		
		JButton btnBuatTemplate = new JButton("Buat Baru");
		btnBuatTemplate.setBounds(20, 74, 100, 36);
		panel_3.add(btnBuatTemplate);
		
		JButton btnHapusTemplate = new JButton("Hapus");
		btnHapusTemplate.setBounds(132, 74, 102, 36);
		panel_3.add(btnHapusTemplate);
		
		JLabel lblComingSoon = new JLabel("Coming Soon!");
		lblComingSoon.setBounds(87, 121, 82, 14);
		panel_3.add(lblComingSoon);
		
		JLabel lblCopyrightTeamTbjava = new JLabel("Copyright 2015 Team TBJava. All right is reserved.");
		lblCopyrightTeamTbjava.setForeground(Color.RED);
		lblCopyrightTeamTbjava.setFont(new Font("Tahoma", Font.PLAIN, 11));
		lblCopyrightTeamTbjava.setBounds(20, 332, 267, 14);
		contentPane.add(lblCopyrightTeamTbjava);
		
		JLabel lblVAlpha = new JLabel("v 1.0.17 Alpha");
		lblVAlpha.setForeground(Color.LIGHT_GRAY);
		lblVAlpha.setBounds(645, 332, 89, 14);
		contentPane.add(lblVAlpha);
		btnLogout.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				panel.setVisible(true);
				panel_2.setVisible(false);
				login = false;
				btnEditData.setEnabled(false);
				btnInputdata.setEnabled(false);
			}
		});
		
		btnLogin.addActionListener(new ActionListener() {
			
			@SuppressWarnings("deprecation")
			
			public void actionPerformed(ActionEvent arg0) {
				
				if (textadmin.getText().equals("LAPTOP")){
					if (passwordField.getText().equals("sembuh")){
						btnInputdata.setEnabled(true);
						btnEditData.setEnabled(true);
						//lihatdata.setEnabled(true);
						//btnexit.setEnabled(true);
						WELCOME.setText("WELCOME  "+textadmin.getText());
						panel_2.setVisible(true);
						panel.setVisible(false);
						login = true;
					}
				}
				else if (textadmin.getText().equals("RizkyAde")){
					if(passwordField.getText().equals("rahasia")){
						btnInputdata.setEnabled(true);
						btnEditData.setEnabled(true);
						//lihatdata.setEnabled(true);
						//btnexit.setEnabled(true);
						WELCOME.setText("WELCOME  "+textadmin.getText());
						panel_2.setVisible(true);
						panel.setVisible(false);
						login = true;
					}
				}
				else if (textadmin.getText().equals("Sandynoob")){
					if(passwordField.getText().equals("pinter")){
						btnInputdata.setEnabled(true);
						btnEditData.setEnabled(true);
						//lihatdata.setEnabled(true);
						//btnexit.setEnabled(true);
						WELCOME.setText("WELCOME  "+textadmin.getText());
						panel_2.setVisible(true);
						panel.setVisible(false);
						login = true;
					
				}
				}
				
			}
		});
		
		
	}
}


