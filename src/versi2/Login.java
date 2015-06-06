package versi2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textadmin;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 289, 150);
		contentPane.add(panel);
		panel.setLayout(null);
		
		
		JLabel lblLoginDuluKa = new JLabel("LOGIN DULU KAKAK");
		lblLoginDuluKa.setBounds(44, 4, 123, 14);
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
		panel_1.setBounds(20, 172, 451, 387);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblMenu = new JLabel("MENU");
		lblMenu.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblMenu.setBounds(199, 11, 60, 25);
		panel_1.add(lblMenu);
		
		JButton btnInputdata = new JButton("INPUT DATA");
		btnInputdata.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
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
		
		JButton lihatdata = new JButton("LIHAT DATA");
		lihatdata.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		//lihatdata.setEnabled(false);
		lihatdata.setBounds(123, 148, 200, 25);
		panel_1.add(lihatdata);
		
		JButton btnexit = new JButton("EXIT");
		btnexit.setBounds(123, 194, 200, 36);
		//btnexit.setEnabled(false);
		panel_1.add(btnexit);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(10, 11, 289, 150);
		contentPane.add(panel_2);
		panel_2.setVisible(false);
		panel_2.setLayout(null);
		
		JLabel lblLoginSuksesKakak = new JLabel("LOGIN SUKSES KAKAK");
		lblLoginSuksesKakak.setBounds(44, 4, 138, 14);
		panel_2.add(lblLoginSuksesKakak);
		lblLoginSuksesKakak.setFont(new Font("Times New Roman", Font.PLAIN, 12));
		
		JLabel WELCOME = new JLabel();
		WELCOME.setFont(new Font("Times New Roman", Font.PLAIN, 13));
		WELCOME.setBounds(50, 60, 150, 31);
		panel_2.add(WELCOME);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setBounds(49, 116, 102, 23);
		panel_2.add(btnLogout);
		btnLogin.addActionListener(new ActionListener() {
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
					}
				}
				else if (textadmin.getText().equals("sayaAde")){
					if(passwordField.getText().equals("rahasia")){
						btnInputdata.setEnabled(true);
						btnEditData.setEnabled(true);
						//lihatdata.setEnabled(true);
						//btnexit.setEnabled(true);
						WELCOME.setText("WELCOME  "+textadmin.getText());
						panel_2.setVisible(true);
						panel.setVisible(false);
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
					
				}
				}
				
			}
		});
		
		
	}
}


