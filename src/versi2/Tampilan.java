package versi2;
import java.awt.BorderLayout;






import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Tampilan extends JFrame  {
	
	private RuangKelas kelasSementara;
	
	private JPanel contentPane;
	private JTextField namaRuang;
	private JTextField lokasiRuang;
	private JTextField ProgStudi;
	private JTextField panjangRuangan;
	private JTextField LebarRuangan;
	private JTextField JumlahKursi;
	private JTextField JumlahPintu;
	private JTextField JumlahCendela;
	
	static Tampilan frame = new Tampilan();
	Tampilan2 frame2 = new Tampilan2();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public Tampilan() {
		
		boolean adaKelas = false;
		
		try {
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("KelasSementara.dat"));
			kelasSementara = (RuangKelas)is.readObject();
			adaKelas = true;
			is.close();
		} catch (Exception ex) {
			//ex.printStackTrace();
		}
		
		setSize(500,544);
		setResizable(false);
		frame2.setVisible(false);
		setTitle("Inventaris Kelas");
		getContentPane().setLayout(null);
		
		JLabel lblNamaRuangan = new JLabel("Nama Ruangan");
		lblNamaRuangan.setFont(new Font("Times New Roman", Font.PLAIN, 15));
		lblNamaRuangan.setBounds(20, 71, 98, 19);
		getContentPane().add(lblNamaRuangan);
		
		JLabel lblIdentitasRuangKelas = new JLabel("IDENTITAS RUANG KELAS");
		lblIdentitasRuangKelas.setBounds(20, 24, 191, 26);
		getContentPane().add(lblIdentitasRuangKelas);
		
		JLabel label = new JLabel("_____________________________________________________________________");
		label.setBounds(10, 45, 484, 14);
		getContentPane().add(label);
		
		if(adaKelas){
			namaRuang = new JTextField(kelasSementara.getNama());
			lokasiRuang = new JTextField(kelasSementara.getLokasi());
			ProgStudi = new JTextField(kelasSementara.getFakultas());
			panjangRuangan = new JTextField(""+kelasSementara.getPanjang());
			LebarRuangan = new JTextField(""+kelasSementara.getLebar());
			JumlahKursi = new JTextField(kelasSementara.getJumlahObjek("Kursi"));
			JumlahPintu = new JTextField(kelasSementara.getJumlahObjek("Pintu"));
			JumlahCendela = new JTextField(kelasSementara.getJumlahObjek("Jendela"));
		}
		else {
			namaRuang = new JTextField();
			lokasiRuang = new JTextField();
			ProgStudi = new JTextField();
			panjangRuangan = new JTextField();
			LebarRuangan = new JTextField();
			JumlahKursi = new JTextField();
			JumlahPintu = new JTextField();
			JumlahCendela = new JTextField();
		}
		
		namaRuang.setBounds(221, 71, 165, 20);
		getContentPane().add(namaRuang);
		namaRuang.setColumns(10);
		
		JLabel lblLokasiRuang = new JLabel("Lokasi Ruang");
		lblLokasiRuang.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblLokasiRuang.setBounds(20, 104, 98, 19);
		getContentPane().add(lblLokasiRuang);
		
		
		lokasiRuang.setBounds(221, 104, 165, 20);
		getContentPane().add(lokasiRuang);
		lokasiRuang.setColumns(10);
		
		JLabel lblProgramStudi = new JLabel("Program Studi/Fakultas");
		lblProgramStudi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblProgramStudi.setBounds(20, 134, 142, 19);
		getContentPane().add(lblProgramStudi);
		
		
		ProgStudi.setBounds(221, 134, 165, 20);
		getContentPane().add(ProgStudi);
		ProgStudi.setColumns(10);
		
		JLabel lblPanjangRuangan = new JLabel("Panjang Ruangan");
		lblPanjangRuangan.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblPanjangRuangan.setBounds(20, 243, 142, 19);
		getContentPane().add(lblPanjangRuangan);
		
		JLabel label_1 = new JLabel("_____________________________________________________________________");
		label_1.setBounds(10, 203, 484, 14);
		getContentPane().add(label_1);
		
		JLabel lblKondisiRuangKelas = new JLabel("KONDISI RUANG KELAS");
		lblKondisiRuangKelas.setBounds(10, 182, 191, 26);
		getContentPane().add(lblKondisiRuangKelas);
		
		
		panjangRuangan.setBounds(221, 243, 165, 20);
		getContentPane().add(panjangRuangan);
		panjangRuangan.setColumns(10);
		
		JLabel lblLebarRuangan = new JLabel("Lebar Ruangan");
		lblLebarRuangan.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblLebarRuangan.setBounds(20, 288, 142, 19);
		getContentPane().add(lblLebarRuangan);
		
		
		LebarRuangan.setBounds(221, 288, 165, 20);
		getContentPane().add(LebarRuangan);
		LebarRuangan.setColumns(10);
		
		JLabel lblJumlahKursi = new JLabel("Jumlah Kursi");
		lblJumlahKursi.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblJumlahKursi.setBounds(20, 328, 142, 19);
		getContentPane().add(lblJumlahKursi);
		
		JumlahKursi.setBounds(221, 328, 165, 20);
		getContentPane().add(JumlahKursi);
		JumlahKursi.setColumns(10);
		
		JLabel lblJumlahPintu = new JLabel("Jumlah Pintu");
		lblJumlahPintu.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblJumlahPintu.setBounds(20, 371, 142, 19);
		getContentPane().add(lblJumlahPintu);
		
		
		JumlahPintu.setBounds(221, 371, 165, 20);
		getContentPane().add(JumlahPintu);
		JumlahPintu.setColumns(10);
		
		JLabel lblJumlahJendela = new JLabel("Jumlah Jendela");
		lblJumlahJendela.setFont(new Font("Times New Roman", Font.PLAIN, 14));
		lblJumlahJendela.setBounds(20, 410, 142, 19);
		getContentPane().add(lblJumlahJendela);
		

		JumlahCendela.setBounds(221, 410, 165, 20);
		getContentPane().add(JumlahCendela);
		JumlahCendela.setColumns(10);
		
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(panjangRuangan!=null&&LebarRuangan!=null){
				kelasSementara = new RuangKelas(namaRuang.getText(), lokasiRuang.getText(), ProgStudi.getText(),
						Float.parseFloat(panjangRuangan.getText()), Float.parseFloat(LebarRuangan.getText()));
				}
				else kelasSementara = new RuangKelas(namaRuang.getText(), lokasiRuang.getText(), ProgStudi.getText());
				
				kelasSementara.tambahObjekBenda("Kursi", true, 
						Integer.parseInt(JumlahKursi.getText()), 18, "Dekat dosen");
				kelasSementara.tambahObjekBenda("Pintu", true, 
						Integer.parseInt(JumlahPintu.getText()), 1, "Sudut");
				kelasSementara.tambahObjekBenda("Jendela", true, 
						Integer.parseInt(JumlahCendela.getText()), 8, "Tembok");
				try {
			         ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("KelasSementara.dat"));
			         os.writeObject(kelasSementara);
			         os.close();
			      } catch(Exception ex) {
			          ex.printStackTrace();
			      }
				
				Tampilan2 panggil = new Tampilan2();
				dispose();
				panggil.show();
				
				
			}
		});
		
		 btnNext.setBounds(395, 441, 70, 26);
		getContentPane().add(btnNext);
	}

}
