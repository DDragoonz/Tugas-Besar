package versi2;


public class ObjekNonBenda extends ObjekKelas{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ObjekNonBenda (String nama ,boolean kondisi ){
		this.nama = nama ;
		this.kondisi = kondisi ;

		
	}
	boolean analisisObjek(){
		if (kondisi == true){
			return true ;
		}
		else return false ;
		
		
	}

}
