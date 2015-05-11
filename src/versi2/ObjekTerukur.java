package versi2;

public class ObjekTerukur extends ObjekKelas{
	float nilai ;
	float min ;
	float max ;
	

	
	
	public ObjekTerukur (String nama ,float nilai , float min, float max){
		this.nama = nama ;
		this.min = min ;
		this.max = max;
		this.nilai = nilai;
		
	}
	boolean analisisObjek (){
		if (nilai >= min && nilai <= max){
			 return true ; 
		}
		else return false ;
		

	}

}
