import java.util.Scanner;


public class Control {
	
	Model kelas = new Model();
	
	Scanner in = new Scanner(System.in);
	
	public void input(){
		System.out.println("Masukan jumlah steker");
		kelas.setSteker(in.nextInt()); in.nextLine();
		System.out.println("Berapa jumlah steker berfungsi?");
		kelas.setKondisiSteker(in.nextInt()); in.nextLine();
		System.out.println("Di mana posisi steker?");
		kelas.setPosisiSteker(in.nextLine());
		
		System.out.println("Masukan Jumlah kabel LCD");
		kelas.setKabelLCD(in.nextInt());in.nextLine();
		System.out.println("Bagaimana kondisi kabel?");
		kelas.setKondisiKabelLCD(in.nextLine());
		System.out.println("Di mana posisi kabel?");
		kelas.setPosisiKabelLCD(in.nextLine());
		
		System.out.println("Masukan jumlah lampu");
		kelas.setLampu(in.nextInt());in.nextLine();
		System.out.println("Berapa jumlah lampu berfungsi?");
		kelas.setLampuBerfungsi(in.nextInt());in.nextLine();
		System.out.println("Di mana posisi lampu?");
		kelas.setPosisiLampu(in.nextLine());
		
		System.out.println("Masukan jumlah kipas");
		kelas.setKipas(in.nextInt());in.nextLine();
		System.out.println("Berapa jumlah kipas berfungsi?");
		kelas.setKipasBerfungsi(in.nextInt());in.nextLine();
		System.out.println("Di mana posisi kipas?");
		kelas.setPosisiKipas(in.nextLine());
		
		System.out.println("Masukan jumlah AC");
		kelas.setAC(in.nextInt());in.nextLine();
		System.out.println("Bagaimana kondisi AC?");
		kelas.setKondisiAC(in.nextLine());
		System.out.println("DI mana posisi AC?");
		kelas.setPosisiAC(in.nextLine());
		
		System.out.println("Masukan nama SSID");
		kelas.setSSID(in.nextLine());
		
		System.out.println("Masukan jumlah CCTV");
		kelas.setCCTV(in.nextInt());in.nextLine();
		System.out.println("berapa CCTV yang berfungsi?");
		kelas.setJumlahCCTVberfungsi(in.nextInt());in.nextLine();
		System.out.println("Di mana posisi CCTV");
		kelas.setPosisiCCTV(in.nextLine());
	}
	
	void analisisKelistrikan(){
		if(kelas.getSteker()>=4){
			System.out.println("Jumlah Steker Sesuai");
			if(kelas.getKondisiSteker()>=4){
				System.out.println("Kondisi Steker Sesuai");
			}
			if(kelas.getPosisiSteker().equals("pojok dekat dosen")){
				System.out.println("Posisi Steker Sesuai");
			}

		}
	}
	
		
	void analisisLCD(){
		if(kelas.getKabelLCD()>=1){
			System.out.println("Jumlah kabel steker sesuai");
			if(kelas.getKondisiKabelLCD().equals("berfungsi")){
				System.out.println("Kabel berfungsi");
			}
			if(kelas.getPosisiKabelLCD().equals("pojok dekat dosen")){
				System.out.println("Posisi kabel Sesuai");
			}
			
		}
	}
	
	void analisisLampu(){
		if(kelas.getLampu()>=18){
			System.out.println("Jumlah Lampu sesuai");
			if(kelas.getLampuBerfungsi()>=18){
				System.out.println("Kondisi Lampu baik sesuai");
			}
			if(kelas.getPosisiLampu().equals("Langit langit ruangan")){
				System.out.println("Posisi Lampu Sesuai");
			}
			
		}
	}

	void analisisKipas(){
		if(kelas.getKipas()>=2){
			System.out.println("Jumlah kabel steker sesuai");
			if(kelas.getKipasBerfungsi()>=2){
				System.out.println("Jumlah kipas berfungsis sesuai");
				}
			if(kelas.getPosisiKipas().equals("Langit langit ruangan")){
				System.out.println("Posisi kipas Sesuai");
			}
		}
	}
	

	void analisisAC(){
		if(kelas.getAC()>=1){
			System.out.println("Jumlah AC sesuai");
			if(kelas.getKondisiAC().equals("baik")){
				System.out.println("Fungsi AC sesuai");
				}
			if(kelas.getPosisiAC().equals("Belakang")||kelas.getPosisiAC().equals("Samping")){
				System.out.println("Posisi AC Sesuai");
			}
		}
	}

	void analisisInternet(){
		if(kelas.getSSID().equals("UMM Hotspot")){
			System.out.println("SSID sesuai");
			if(kelas.isLoginState()){
				System.out.println("Login sukses. Internet sesuai");
				}
		}
	}
	
	void analisisCCTV(){
		if(kelas.getCCTV()>=2){
			System.out.println("Jumlah CCTV sesuai");
			if(kelas.getJumlahCCTVberfungsi()==2){
				System.out.println("fungsi CCTV sesuai");
				}
			if(kelas.getPosisiCCTV().equals("Belakang")||kelas.getPosisiCCTV().equals("Depan")){
				System.out.println("Posisi CCTV Sesuai");
			}
		}
		
	}
	void AnalisisKebersihan(){
		int NilaiBersih = 0 ;
		
		if (kelas.getKondisiLantai().equals("Baik"))NilaiBersih+=1;
		if	(	kelas.getKondisiDinding().equals("Baik"))NilaiBersih+=1;
		if	(	kelas.getKondisiAtap().equals("Baik"))NilaiBersih+=1;
		if	(	kelas.getKondisiPintu().equals("baik"))NilaiBersih+=1;
		if	(	kelas.getKondisiJendela().equals("Baik"))NilaiBersih+=1;
		if (NilaiBersih >=3){
			System.out.println ("Sesuai");
		}
		else {
			System.out.println ("Tidak Sesuai");
		
		}
		
		
	}
	void AnalisisSirkulasi(){
		if (kelas.getSirkulasiudara().equals("Baik")){
			System.out.println ("Sesuai");
		}
		else {
			System.out.println ("Tidak Sesuai");
		
		}
		
		
	}
	void AnalisisPencahayaan(){
		if (kelas.getPencahayaan()>=250 && kelas.getPencahayaan()<=350){
			System.out.println ("Sesuai");
		}
		else {
			System.out.println ("Tidak Sesuai");
		
		}
		
		
	}
	void AnalisisKelembapan(){
		if (kelas.getKelembapan()>=70 && kelas.getKelembapan()<=80){
			System.out.println ("Sesuai");
		}
		else {
			System.out.println ("Tidak Sesuai");
		
		}
		
		
	}
	void AnalisisSuhu(){
		if (kelas.getSuhu()>=25 && kelas.getSuhu()<=30){
			System.out.println ("Sesuai");
		}
		else {
			System.out.println ("Tidak Sesuai");
		
		}
	}
	
}
