package versi2;

public class ObjekBenda extends ObjekKelas{
	private int min ;
	private boolean posisi;
	private int jumlah ;
	

	public int getMin() {
		return min;
	}
	

	public boolean getPosisi() {
		return posisi;
	}
	public int getjumlah (){
		return jumlah ;
	}
	
	
	public ObjekBenda (String nama ,boolean kondisi ,int jumlah , int min, boolean posisi){
		this.nama = nama ;
		this.kondisi = kondisi ;
		this.min = min ;
		this.posisi = posisi ;
		this.jumlah = jumlah ;
		
		
	}
	
	Boolean analisisObjek (){
		Boolean result ;
		if (jumlah >= min){
			result = true;
		}
		else {
			result = false;
		}
		return result ;
			
		
	}

}
