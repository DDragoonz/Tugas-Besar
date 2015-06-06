package versi2;

import javax.swing.text.StyledEditorKit.BoldAction;

public class ObjekBenda extends ObjekKelas{


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int min ;
	private String posisi;
	private int jumlah ;
	

	public int getMin() {
		return min;
	}
	

	public String getPosisi() {
		return posisi;
	}

	public int getJumlah() {
		return jumlah;
	}


	public void setJumlah(int jumlah) {
		this.jumlah = jumlah;
	}


	public void setMin(int min) {
		this.min = min;
	}


	public void setPosisi(String posisi) {
		this.posisi = posisi;
	}


	public ObjekBenda (String nama ,boolean kondisi ,int jumlah , int min, String posisi){

		this.nama = nama ;
		this.kondisi = kondisi ;
		this.min = min ;
		this.posisi = posisi ;
		this.jumlah = jumlah ;
		
		
	}
	
	@Override
	boolean analisisObjek (){
		boolean result ;
		if (jumlah >= min){
			result = true;
		}
		else {
			result = false;
		}
		return result ;
			
	}

}
