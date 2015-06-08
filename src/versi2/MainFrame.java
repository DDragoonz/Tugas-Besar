package versi2;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.SwingConstants;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame(null,null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Tampilan t1 ;
	Tampilan2 t2 ;
	Tampilan21 t3 ;
	Tampilan3 t4 ;
	Tampilan32 t5;
	RuangKelas kelas;
	Kontrol kontrol = new Kontrol();

	
	public MainFrame(RuangKelas kelasNew, Login login) {
		setTitle("Inventaris Lab v 1.0.17");
		
	try {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
	} catch ( Exception e) {
		JOptionPane.showMessageDialog(null, "Fail to Load Nimbus theme");
	}
	
	if(kelasNew!=null)kelas = kelasNew;
	
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 650);
		getContentPane().setLayout(null);
		
		t3 = new Tampilan21(kelas);
		t4 = new Tampilan3(kelas);
		t5 = new Tampilan32(kelas);
		t2 = new Tampilan2(kelas);
		t1 = new Tampilan(kelas);
		
		getContentPane().add(t1);
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(390, 572, 89, 23);
		t1.add(btnNext);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				login.setVisible(true);
			}
		});
		btnCancel.setBounds(291, 572, 89, 23);
		t1.add(btnCancel);
		btnNext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				getContentPane().remove(t1);
				setContentPane(t2);
				revalidate();
				repaint();
				
			}
		});

		JButton btnNext1 = new JButton("Next");
		btnNext1.setBounds(390, 572, 89, 23);
		btnNext1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				getContentPane().remove(t2);
				setContentPane(t3);
				revalidate();
				repaint();
				
			}
		});	
		t2.add(btnNext1);
		
		JButton back = new JButton("Back");
		back.setBounds(285, 572, 89, 23);
		back.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				getContentPane().remove(t2);
				setContentPane(t1);
				revalidate();
				repaint();
				
			}
		});
		t2.add(back);

		JButton btnNext2 = new JButton("Next");
		btnNext2.setBounds(390, 572, 89, 23);
		btnNext2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				getContentPane().remove(t3);
				setContentPane(t4);
				revalidate();
				repaint();
				
			}
		});
		t3.add(btnNext2);
		
		
		JButton back2 = new JButton("Back");
		back2.setBounds(285, 572, 89, 23);
		back2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				getContentPane().remove(t3);
				setContentPane(t2);
				revalidate();
				repaint();
				
			}
		});
		t3.add(back2);
		
		JButton btnNext3 = new JButton("Next");
		btnNext3.setBounds(390, 572, 89, 23);
		btnNext3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				getContentPane().remove(t4);
				setContentPane(t5);
				revalidate();
				repaint();
				
			}
		});
		t4.add(btnNext3);
		
		JButton back3 = new JButton("Back");
		back3.setBounds(285, 572, 89, 23);
		back3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				getContentPane().remove(t4);
				setContentPane(t3);
				revalidate();
				repaint();
				
				
			}
		});
		t4.add(back3);
		setVisible(true);
		
		JButton back4= new JButton("Back");
		back4.setBounds(280, 162, 89, 23);
		back4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				getContentPane().remove(t5);
				setContentPane(t4);
				revalidate();
				repaint();
				
				
			}
		});
		t5.add(back4);
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(373, 162, 89, 23);
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(kelasNew==null){
				if (t1.panjangRuangan.getText().isEmpty()
						|| t1.LebarRuangan.getText().isEmpty())
					kelas = new RuangKelas(t1.namaRuang.getText(),
							t1.lokasiRuang.getText(), t1.ProgStudi.getText());
				else
					kelas = new RuangKelas(t1.namaRuang.getText(),
							t1.lokasiRuang.getText(), t1.ProgStudi.getText(),
							Float.parseFloat(t1.panjangRuangan.getText()),
							Float.parseFloat(t1.LebarRuangan.getText()));
				
				kelas.setup();
				}
				
				kelas.setJumlahObjek("Kursi", t1.JumlahKursi.getText());
				kelas.setJumlahObjek("Pintu", t1.JumlahPintu.getText());
				kelas.setJumlahObjek("Jendela", t1.JumlahCendela.getText());
				kelas.setJumlahObjek("Steker", t2.JumlahStopKontak.getText());
				if(t2.rbKondisiSteker1.isSelected())kelas.setKondisiObjek("Steker", true);
				else if(t2.rbKondisiSteker2.isSelected())kelas.setKondisiObjek("Steker", false);

				if(t2.rbPosisiSteker1.isSelected())kelas.setPosisiObjek("Steker",t2.rbPosisiSteker1.getText());
				else if (t2.rbPosisiSteker2.isSelected())kelas.setPosisiObjek("Steker", t2.rbPosisiSteker2.getText());
				else if (t2.rbPosisiSteker3.isSelected())kelas.setPosisiObjek("Steker", t2.rbPosisiSteker3.getText());
				
				kelas.setJumlahObjek("Kabel LCD", t2.JumlahKabelLCD.getText());
				if (t2.rbKondisiLCD1.isSelected())kelas.setKondisiObjek("Kabel LCD",true);
				else if (t2.rbKondisiLCD2.isSelected())kelas.setKondisiObjek("Kabel LCD", false);
				
				if(t2.rbPosisiLCD1.isSelected())kelas.setPosisiObjek("Kabel LCD",t2.rbPosisiSteker1.getText());
				else if (t2.rbPosisiLCD2.isSelected())kelas.setPosisiObjek("Kabel LCD", t2.rbPosisiLCD2.getText());
				else if (t2.rbPosisiLCD3.isSelected())kelas.setPosisiObjek("Kabel LCD", t2.rbPosisiLCD3.getText());
				
				kelas.setJumlahObjek("Lampu", t2.JumlahLampu.getText());
				if (t2.rbKondisiLampu1.isSelected())kelas.setKondisiObjek("Lampu", true);
				else if (t2.rbKondisiLampu2.isSelected())kelas.setKondisiObjek("Lampu", false);
				
				if(t2.rbPosisiLampu1.isSelected())kelas.setPosisiObjek("Lampu",t2.rbPosisiLampu1.getText());
				else if (t2.rbPosisiLampu2.isSelected())kelas.setPosisiObjek("Lampu",t2.rbPosisiLampu2.getText());
				
				kelas.setJumlahObjek("Kipas Angin", t3.JumlahKipasAngin.getText());
				if(t3.KondisiKipas.isSelected())kelas.setKondisiObjek("Kipas Angin",true);
				else if (t3.KondisiKipas1.isSelected())kelas.setKondisiObjek("Kipas Angin", false);
				
				kelas.setJumlahObjek("AC", t3.JumlahAC.getText());
				if (t3.AcBaik.isSelected())kelas.setKondisiObjek("AC", true);
				else if (t3.AcKurangBaik.isSelected())kelas.setKondisiObjek("AC", false);
				
				if (t3.AcBelakang.isSelected())kelas.setPosisiObjek("AC", t3.AcBelakang.getText());
				else if (t3.AcSamping.isSelected())kelas.setPosisiObjek("AC",t3.AcSamping.getText());
				else if (t3.AcLainlain_1.isSelected())kelas.setPosisiObjek("AC",t3.AcLainlain_1.getText());
				
				if (t3.UmmHospot.isSelected())kelas.setKondisiObjek("SSID",true);
				else if (t3.SSIDLainlain.isSelected())kelas.setKondisiObjek("SSID", false);
				
				if (t3.BisaLogin.isSelected())kelas.setKondisiObjek("BisaLogin", true);
				else if (t3.TidakBisaLogin.isSelected())kelas.setKondisiObjek("Bisa Login", false);
				
				kelas.setJumlahObjek("CCTV", t3.JumlahCCTV.getText());
				if (t3.cctv1.isSelected())kelas.setKondisiObjek("CCTV", true);
				else if (t3.cctv2.isSelected())kelas.setKondisiObjek("CCTV", false);
				
				if (t3.DepanBelakang.isSelected())kelas.setPosisiObjek("CCTV", t3.DepanBelakang.getText());
				else if (t3.Lainlain_3.isSelected())kelas.setPosisiObjek("CCTV", t3.Lainlain_3.getText());
				
				if (t4.kondisilantai1.isSelected())kelas.setKondisiObjek("Kondisi Lantai", true);
				else if(t4.kondisilantai2.isSelected())kelas.setKondisiObjek("Kondisi Lantai", false);
				
				if (t4.kondisidinding.isSelected())kelas.setKondisiObjek("Kondisi Dinding", true);
				else if (t4.kondisidinding1.isSelected())kelas.setKondisiObjek("Kondisi Dinding", false);
				
				if (t4.kondisiAtap.isSelected())kelas.setKondisiObjek("Kondisi Atap", true);
				else if (t4.kondisiAtap1.isSelected())kelas.setKondisiObjek("Kondisi Atap", false);
				
				if(t4.Kondisipintu.isSelected())kelas.setKondisiObjek("Kondisi Pintu", true);
				else if (t4.Kondisipintu1.isSelected())kelas.setKondisiObjek("Kondisi Pintu", false);
				
				if (t4.kondisiCendela.isSelected())kelas.setKondisiObjek("Kondisi Jendela", true);
				else if (t4.kondisiCendela1.isSelected())kelas.setKondisiObjek("Kondisi Jendela", false);
				
				if (t4.kondisiudara.isSelected())kelas.setKondisiObjek("Sirkulasi Udara", true);
				else if (t4.kondisiudara1.isSelected())kelas.setKondisiObjek("Sirkulasi Udara", false);
				
				kelas.setNilaiObjek("Suhu",t4.Suhu.getText());
				kelas.setNilaiObjek("Intesitas Cahaya", t4.IntensitasCahaya.getText());
				kelas.setNilaiObjek("Kelembapan", t4.Kelembapan.getText());
				
				if (t4.kebisingan.isSelected())kelas.setKondisiObjek("Kebisingan", true);
				else if (t4.kebisingan1.isSelected())kelas.setKondisiObjek("Kebisingan", false);
				
				if (t4.rdbtnBau.isSelected())kelas.setKondisiObjek("Bau", true);
				else if (t4.rdbtnTidakBau.isSelected())kelas.setKondisiObjek("Bau", false);
				
				if (t4.rdbtnAus.isSelected())kelas.setKondisiObjek("Keausan", true);
				else if (t4.rdbtnTidakAus.isSelected())kelas.setKondisiObjek("Keausan", false);
				
				if (t4.kebocoran1.isSelected())kelas.setKondisiObjek("Kebocoran", true);
				else if (t4.kebocoran2.isSelected())kelas.setKondisiObjek("Kebocoran", false);
				
				if (t4.kerusakan1.isSelected())kelas.setKondisiObjek("Kerusakan", true);
				else if (t4.kerusakan2.isSelected())kelas.setKondisiObjek("Kerusakan", false);
				
				if (t5.rdbtnKokoh.isSelected())kelas.setKondisiObjek("Kekokohan", true);
				else if (t5.rdbtnTidakKokoh.isSelected())kelas.setKondisiObjek("Kekokohan", false);
				
				if (t5.rdbtnAdaKunci.isSelected())kelas.setKondisiObjek("Kunci Pintu & Jendela", true);
				else if (t5.rdbtnTidakAdaKunci.isSelected())kelas.setKondisiObjek("Kunci Pintu & Jendela", false);
				
				if (t5.rdbtnAman.isSelected())kelas.setKondisiObjek("Bahaya", true);
				else if (t5.rdbtnTidakAman.isSelected())kelas.setKondisiObjek("Bahaya", false);

				
				kontrol.save(kelas);
				
				dispose();
				login.setVisible(true);
				
			}
		});
		t5.add(btnSubmit);
			
	}
}
