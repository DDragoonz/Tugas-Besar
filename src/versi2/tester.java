package versi2;

import java.util.Scanner;

public class tester {

	public static void main(String[] args) {
		RuangKelas kelas;
		String nama;
		String lokasi;
		String fakultas;
		float panjang;
		float lebar;
		boolean kondisi;
		int jumlah;
		int min;
		float nilai;
		
		
		Scanner in = new Scanner(System.in);
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
		
		kelas.tampilInfoKelas();
		kelas.analisisObjek();
	}

}
