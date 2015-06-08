package versi2;

public class ObjekTerukur extends ObjekKelas{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private float nilai ;
	private float min ;
	private float max ;
	

	
	
	public void setNilai(float nilai) {
		this.nilai = nilai;
	}

	public void setMin(float min) {
		this.min = min;
	}

	public void setMax(float max) {
		this.max = max;
	}

	public float getNilai() {
		return nilai;
	}

	public float getMin() {
		return min;
	}

	public float getMax() {
		return max;
	}

	public ObjekTerukur (String nama ,float nilai , float min, float max){
		kondisi = analisisObjek();
		this.nama = nama ;
		this.min = min ;
		this.max = max;
		this.nilai = nilai;
		
	}
	
	@Override
	boolean analisisObjek (){
		if (nilai >= min && nilai <= max){
			 return true ; 
		}
		else return false ;
		

	}

}
