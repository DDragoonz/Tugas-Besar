package versi2;

public class ObjekTerukur extends ObjekKelas{
	float nilai ;
	float min ;
	float max ;
	

	
	
	public ObjekTerukur (String nama ,boolean kondisi ,float nilai , float min, float max){
		this.nama = nama ;
		this.kondisi = kondisi ;
		this.min = min ;
		
	}
	Boolean AnalisisObjetnya (){
		if (nilai <= min && nilai >= max){
			 return true ; 
		}
		else return false ;
		

	}

}
