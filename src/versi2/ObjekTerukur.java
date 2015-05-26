package versi2;

public class ObjekTerukur extends ObjekKelas{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private float nilai ;
	private float min ;
	private float max ;
	

	
	
	public ObjekTerukur (String nama ,float nilai , float min, float max){
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
