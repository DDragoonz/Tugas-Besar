package versi2;

import java.io.*;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class tester {

	private static Scanner in = new Scanner(System.in);
	private RuangKelas kelas;
	private String nama;
	private String lokasi;
	private String fakultas;
	private float panjang;
	private float lebar;
	private boolean kondisi;
	private int jumlah;
	//private int min;
	private float nilai;
	
	private void testInput(){
		System.out.println("Masukan nama kelas : ");
		nama = in.nextLine();
		System.out.println("Masukan lokasi : ");
		lokasi = in.nextLine();
		System.out.println("Masukan nama fakultas");
		fakultas = in.nextLine();
		System.out.println("apakah anda tau ukuran panjang & lebar? (y/n)");
		if(in.nextLine().equalsIgnoreCase("y")){
			System.out.println("Masukan panjang : ");
			panjang = in.nextFloat();in.nextLine();
			System.out.println("Masukan lebar : ");
			lebar = in.nextFloat();in.nextLine();
			kelas = new RuangKelas(nama, lokasi, fakultas, panjang, lebar);
		}
		else {
			kelas = new RuangKelas(nama, lokasi, fakultas);
		}
		
		System.out.println("masukan jumlah kursi : ");
		jumlah = in.nextInt();in.nextLine();
		
		kelas.tambahObjekBenda("kursi", true, jumlah, 18, "di lantai");
		
		System.out.println("Masukan jumlah Lampu");
		jumlah = in.nextInt();in.nextLine();
		System.out.println("apakah ada yang rusak? (y/n)");
		if(in.nextLine().equals("y")){
			kondisi = false;
		}
		else kondisi = true;
		
		kelas.tambahObjekBenda("lampu", kondisi, jumlah, 10, "di atas");
		
		System.out.println("Apakah lantai bersih? (y/n)");
		if(in.nextLine().equals("y")){
			kondisi = true; 
		}
		else kondisi = false;
		
		kelas.tambahObjekNonBenda("lantai", kondisi);
		
		System.out.println("Berapa suhu di kelas?");
		nilai = in.nextFloat();in.nextLine();
		
		kelas.tambahObjekTerukur("suhu", nilai, 20, 30);
		

	}
	
	void testOutput(){
		kelas.tampilInfoKelas();
		kelas.analisisObjek();
	}
	
	void save(){
		try {
	         ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Kelas.dat"));
	         os.writeObject(kelas);
	         os.close();
	         JOptionPane.showMessageDialog(null, "Kelas berhasil disimpan");
	      } catch(Exception ex) {
	          ex.printStackTrace();
	      }
	}
	
	void load() {
		try {

			ObjectInputStream is = new ObjectInputStream(new FileInputStream("Kelas.dat"));
			kelas = (RuangKelas)is.readObject();
			is.close();
			testOutput();
		} catch (Exception ex) {
			JOptionPane.showMessageDialog(null, "Data not Found !");
			//ex.printStackTrace();
		}

	}


	
	public static void main(String[] args) {
		tester t = new tester();
		System.out.println("Pilih : \n 1. load kelas\n 2. buat kelas baru");
		int pilihan = in.nextInt();
		switch(pilihan){
		case 1 :
			t.load();
			break;
		case 2 :
			t.testInput();
			t.save();
			break;
		}
	}

}
