package versi2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javafx.stage.FileChooser;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class MainFrame extends JFrame {


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
	Tampilan t1 ;
	Tampilan2 t2 ;
	Tampilan21 t3 ;
	Tampilan3 t4 ;
	Tampilan32 t5;

	RuangKelas kelas;
	FileChooser fc;

	
	public MainFrame() {
	try {
		UIManager.setLookAndFeel(new NimbusLookAndFeel());
	} catch ( Exception e) {
		// TODO: handle exception
	}
	
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 650);
		getContentPane().setLayout(null);
		
		t3 = new Tampilan21();
		t4 = new Tampilan3();
		t5 = new Tampilan32();
		t2 = new Tampilan2();
		t1 = new Tampilan();
		getContentPane().add(t1);
		JButton btnNext = new JButton("Next");
		btnNext.setBounds(390, 572, 89, 23);
		t1.add(btnNext);
		btnNext.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				getContentPane().remove(t1);
				setContentPane(t2);
				revalidate();
				repaint();
				
			}
		});
		//frame2
		t2 = new Tampilan2();
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
		//frame3

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
		
		//frame4
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
				kelas.setJumlahObjek("Kursi", t1.JumlahKursi.getText());
				kelas.setJumlahObjek("Pintu", t1.JumlahPintu.getText());
				kelas.setJumlahObjek("Jendela", t1.JumlahCendela.getText());
				kelas.setJumlahObjek("Steker", t2.JumlahStopKontak.getText());
				if(t2.rbKondisiSteker1.isSelected())kelas.setKondisiObjek("Steker", true);
				else if(t2.rbKondisiSteker2.isSelected())kelas.setKondisiObjek("Steker", false);
				
			}
		});
		t5.add(btnSubmit);
		
		
		
	}

}
