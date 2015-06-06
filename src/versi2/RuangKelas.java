package versi2;

import java.io.Serializable;
import java.util.ArrayList;

public class RuangKelas implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String nama;
	private String lokasi;
	private String fakultas;
	private float panjang = 20;
	private float lebar = 10;
	private int kursi;
	ArrayList<ObjekBenda> daftarObjekBenda = new ArrayList<ObjekBenda>();
	ArrayList<ObjekNonBenda> daftarObjekNonBenda = new ArrayList<ObjekNonBenda>();
	ArrayList<ObjekTerukur> daftarObjekTerukur = new ArrayList<ObjekTerukur>();
	
	public RuangKelas(String nama, String lokasi, String fakultas){
		this.nama = nama;
		this.lokasi = lokasi;
		this.fakultas = fakultas;
	}
	
	public RuangKelas(String nama, String lokasi, String fakultas, float panjang, float lebar){
		this.nama = nama;
		this.lokasi = lokasi;
		this.fakultas = fakultas;
		this.panjang = panjang;
		this.lebar = lebar;
	}
	
	public String getNama(){
		return nama;
	}
	
	public String getLokasi(){
		return lokasi;
	}
	
	public String getFakultas(){
		return fakultas;
	}
	
	float ukurLuas(){
		return panjang*lebar;
	}
	
	public float getPanjang() {
		return panjang;
	}

	public void setPanjang(float panjang) {
		this.panjang = panjang;
	}

	public float getLebar() {
		return lebar;
	}

	public void setLebar(float lebar) {
		this.lebar = lebar;
	}

	
	boolean ukurBentuk(){
		if(panjang!=lebar)return true;
		else return false;
	}
	
	boolean hitungRasio(int kursi){
		if((ukurLuas()/kursi)>0.5)return true;
		else return false;
	}
	
	void setup(){
		tambahObjekBenda("Kursi", true, 0, 40, "?");
		tambahObjekBenda("Pintu", true, 0, 2, "?");
		tambahObjekBenda("Jendela", true, 0, 6, "?");
		tambahObjekBenda("Steker", true, 0, 8, "?");
		tambahObjekBenda("Kabel LCD", true, 0, 2, "?");
		tambahObjekBenda("Lampu", true, 0, 4, "?");
		tambahObjekBenda("Kipas Angin", true, 0, 2, "?");
		tambahObjekBenda("AC", true, 0, 1, "?");
		tambahObjekBenda("CCTV", true, 0, 1, "?");
		tambahObjekNonBenda("SSID", false);
		tambahObjekNonBenda("Bisa Login", false);
		tambahObjekNonBenda("Kondisi Lantai", true);
		tambahObjekNonBenda("Kondisi Dinding", true);
		tambahObjekNonBenda("Kondisi Atap", true);
		tambahObjekNonBenda("Kondisi Pintu", true);
		tambahObjekNonBenda("Kondisi Jendela", true);
		tambahObjekNonBenda("Sirkulasi Udara", true);
		tambahObjekNonBenda("Kebisingan", true);
		tambahObjekNonBenda("Bau", true);
		tambahObjekNonBenda("Kebocoran", true);
		tambahObjekNonBenda("Kerusakan", true);
		tambahObjekNonBenda("Keausan", true);
		tambahObjekNonBenda("Kekokohan", true);
		tambahObjekNonBenda("Kunci Pintu & Jendela", true);
		tambahObjekNonBenda("Bahaya", true);
		tambahObjekTerukur("Intesitas Cahaya", 0, 30, 80);
		tambahObjekTerukur("Tingkat Kelembapan", 0, 30, 80);
		tambahObjekTerukur("Suhu", 0, 30, 80);
		
		
		
		
	}
	
	void tambahObjekBenda(String nama, boolean kondisi, int jumlah, int min, String posisi){
		daftarObjekBenda.add(new ObjekBenda(nama, kondisi, jumlah, min, posisi));
		if(nama.equals("Kursi"))kursi=jumlah;
	}
	
	void tambahObjekNonBenda(String nama, boolean kondisi){
		daftarObjekNonBenda.add(new ObjekNonBenda(nama, kondisi));
	}
	
	void tambahObjekTerukur(String nama, float nilai, float min, float max){
		daftarObjekTerukur.add(new ObjekTerukur(nama, nilai, min, max));
	}
	
	public void analisisObjek(){
		for(ObjekBenda a:daftarObjekBenda){
			if(a.analisisObjek()){
					System.out.println(a.getNama() + " sesuai");
				}
			else System.out.println(a.getNama() + " tidak sesuai");
		}
		for(ObjekNonBenda a:daftarObjekNonBenda){
			if(a.analisisObjek()){
					System.out.println(a.getNama() + " sesuai");
				}
			else System.out.println(a.getNama() + " tidak sesuai");
		}
		for(ObjekTerukur a:daftarObjekTerukur){
			if(a.analisisObjek()){
					System.out.println(a.getNama() + " sesuai");
				}
			else System.out.println(a.getNama() + " tidak sesuai");
		}
		
	}
	
	public void setJumlahObjek (String nama, String jumlah){
		for(ObjekBenda a:daftarObjekBenda){
			if(a.getNama().equals(nama)){
					a.setJumlah(Integer.parseInt(jumlah));
					break;
				}
		}
	}
	
	public void setKondisiObjek (String nama, boolean kondisi){
		for(ObjekBenda a:daftarObjekBenda){
			if(a.getNama().equals(nama)){
					a.setKondisi(kondisi);
					break;
				}
		}
		for(ObjekNonBenda a:daftarObjekNonBenda){
			if(a.getNama().equals(nama)){
					a.setKondisi(kondisi);
					break;
				}
		}
		for(ObjekTerukur a:daftarObjekTerukur){
			if(a.getNama().equals(nama)){
					a.setKondisi(kondisi);
					break;
				}
		}
	}
	
	public void setPosisiObjek(String nama, String posisi){
		for(ObjekBenda a:daftarObjekBenda){
			if(a.getNama().equals(nama)){
					a.setPosisi(posisi);
					break;
				}
		}
	}
	
	public void setNilaiObjek (String nama, float nilai){
		for(ObjekTerukur a:daftarObjekTerukur){
			if(a.getNama().equals(nama)){
					a.setNilai(nilai);
					break;
				}
		}
	}
	
	public String getJumlahObjek (String nama){
		String result = "-";
		for(ObjekBenda a:daftarObjekBenda){
			if(a.getNama().equals(nama)){
					result = (""+a.getJumlah());
					break;
				}
		}
		
		return result;
	}
	
	public String getKondisiObjek (String nama){
		boolean hasil = false;
		String result = "-";
		for(ObjekBenda a:daftarObjekBenda){
			if(a.getNama().equals(nama)){
					hasil = a.isKondisi();
					break;
				}
		}
		for(ObjekNonBenda a:daftarObjekNonBenda){
			if(a.getNama().equals(nama)){
				hasil = a.isKondisi();
				break;
			}
		}
		for(ObjekTerukur a:daftarObjekTerukur){
			if(a.getNama().equals(nama)){
				hasil = a.isKondisi();
				break;
			}
		}
		
		if(hasil)result = "Baik";
		
		return result;
	}
	
	public String getPosisiObjek(String nama){
		String result = "-";
		for(ObjekBenda a:daftarObjekBenda){
			if(a.getNama().equals(nama)){
					result = a.getPosisi();
					break;
				}
		}
		
		return result;
	}
	
	public String getMinObjek(String nama){
		String result = "-";
		for(ObjekBenda a:daftarObjekBenda){
			if(a.getNama().equals(nama)){
					result = (""+a.getMin());
					break;
				}
		}
		for(ObjekTerukur a:daftarObjekTerukur){
			if(a.getNama().equals(nama)){
					result = (""+a.getMin());
					break;
				}
		}
		
		return result;
	}
	
	public String getMaxObjek(String nama){
		String result = "-";
		for(ObjekTerukur a:daftarObjekTerukur){
			if(a.getNama().equals(nama)){
					result = (""+a.getMax());
					break;
				}
		}
		
		return result;
	}
	
	public String getNilaiObjek(String nama){
		String result = "-";
		for(ObjekTerukur a:daftarObjekTerukur){
			if(a.getNama().equals(nama)){
					result = (""+a.getNilai());
					break;
				}
		}
		
		return result;
	}
	
	public void tampilInfoKelas(){
		System.out.println("nama kelas : " + nama);
		System.out.println("Lokasi kelas: " + lokasi);
		System.out.println("Fakultas : " + fakultas);
		if(ukurBentuk())System.out.println("Bentuk kelas sesuai");
		else System.out.println("Bentuk tidak sesuai");
		if(hitungRasio(kursi))System.out.println("Rasio kelas sesuai");
		else System.out.println("Rasio tidak sesuai");
	}
	
}
