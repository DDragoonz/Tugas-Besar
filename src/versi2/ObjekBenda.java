package versi2;

public class ObjekBenda extends ObjekKelas{
<<<<<<< HEAD
	private int min ;
	private boolean posisi;
=======
	private int min ;
	private String posisi;
>>>>>>> parent of bfa46fc... new lagi l
	private int jumlah ;
	

	public int getMin() {
		return min;
	}
	

	public String getPosisi() {
		return posisi;
	}
	public int getjumlah (){
		return jumlah ;
	}
	
	
<<<<<<< HEAD
	
	public ObjekBenda (String nama ,boolean kondisi ,int jumlah , int min, boolean posisi){
=======
	public ObjekBenda (String nama ,boolean kondisi ,int jumlah , int min, String posisi){
>>>>>>> parent of bfa46fc... new lagi l
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
