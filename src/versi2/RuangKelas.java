package versi2;

import java.util.ArrayList;

public class RuangKelas {
	private String nama;
	private String lokasi;
	private String fakultas;
	private float panjang = 20;
	private float lebar = 10;
	ArrayList<ObjekKelas> daftarObjekKelas = new ArrayList<ObjekKelas>();
	
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
	
	void tambahObjekBenda(String nama, boolean kondisi, int jumlah, int min, String posisi){
		daftarObjekKelas.add(new ObjekBenda(nama, kondisi, jumlah, min, posisi));
	}
	
	
	
	
}
