package versi2;

import java.io.Serializable;

public abstract class ObjekKelas implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String nama ;
	protected boolean kondisi;
	
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public boolean isKondisi() {
		return kondisi;
	}
	public void setKondisi(boolean kondisi) {
		this.kondisi = kondisi;
	}
	
	abstract boolean analisisObjek();
	

}
