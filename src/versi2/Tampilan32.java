package versi2;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;


public class Tampilan32 extends JPanel {


	private static final long serialVersionUID = 1L;
	private ButtonGroup kokoh = new ButtonGroup();
	JRadioButton rdbtnKokoh = new JRadioButton("Kokoh");
	JRadioButton rdbtnTidakKokoh = new JRadioButton("Tidak Kokoh");
	
	private ButtonGroup kunci = new ButtonGroup();
	JRadioButton rdbtnAdaKunci = new JRadioButton("Ada Kunci");
	JRadioButton rdbtnTidakAdaKunci = new JRadioButton("Tidak Ada Kunci");
	
	private ButtonGroup aman = new ButtonGroup();
	JRadioButton rdbtnAman = new JRadioButton("Aman");
	JRadioButton rdbtnTidakAman = new JRadioButton("Tidak Aman");
	
	public Tampilan32(RuangKelas kelas) {
		setLayout(null);
		setSize(500,650);
		
	
		
		JLabel lblKekokohan = new JLabel("Kekokohan");
		lblKekokohan.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKekokohan.setBounds(30, 36, 172, 19);
		add(lblKekokohan);
		
		if (kelas!=null)
		{
			if (kelas.getKondisiObjek("Kekokohan").equals("Baik"))rdbtnKokoh.setSelected(true);
			else if (kelas.getKondisiObjek("kekokohan").equals("Buruk"))rdbtnTidakKokoh.setSelected(true);
			
			if (kelas.getKondisiObjek("Kunci Pintu & Jendela").equals("Baik"))rdbtnAdaKunci.setSelected(true);
			else if (kelas.getKondisiObjek("Kunci Pintu & Jendela").equals("Buruk"))rdbtnTidakAdaKunci.setSelected(true);
			
			if (kelas.getKondisiObjek("Bahaya").equals("Baik"))rdbtnAman.setSelected(true);
			else if (kelas.getKondisiObjek("Bahaya").equals("Buruk"))rdbtnTidakAman.setSelected(true);		
		}
		
		rdbtnKokoh.setBounds(196, 35, 90, 23);
		add(rdbtnKokoh);
		
		rdbtnTidakKokoh.setBounds(294, 35, 109, 23);
		add(rdbtnTidakKokoh);
		kokoh.add(rdbtnKokoh);
		kokoh.add(rdbtnTidakKokoh);
		
		JLabel lblKunciPintuDan = new JLabel("Kunci pintu dan Cendela");
		lblKunciPintuDan.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblKunciPintuDan.setBounds(30, 66, 172, 19);
		add(lblKunciPintuDan);
		
		
		rdbtnAdaKunci.setBounds(196, 65, 200, 23);
		add(rdbtnAdaKunci);
		
		rdbtnTidakAdaKunci.setBounds(294, 65, 200, 23);
		add(rdbtnTidakAdaKunci);
		kunci.add(rdbtnAdaKunci);
		kunci.add(rdbtnTidakAdaKunci);
		
		
		JLabel lblTingkatBahaya = new JLabel("Tingkat Bahaya");
		lblTingkatBahaya.setFont(new Font("Times New Roman", Font.BOLD, 15));
		lblTingkatBahaya.setBounds(30, 96, 172, 19);
		add(lblTingkatBahaya);
		
		
		rdbtnAman.setBounds(196, 95, 90, 23);
		add(rdbtnAman);
		
		rdbtnTidakAman.setBounds(294, 95, 109, 23);
		add(rdbtnTidakAman);
		aman.add(rdbtnAman);
		aman.add(rdbtnTidakAman);
		
		JPanel lblKeamananRuangKelas = new JPanel();
		lblKeamananRuangKelas.setBorder(new TitledBorder("KEAMANAN RUANG KELAS"));
		lblKeamananRuangKelas.setBounds(20, 11, 456, 120);
		add(lblKeamananRuangKelas);
	}

}
