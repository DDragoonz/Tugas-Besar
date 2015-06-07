
public class Main {

	public static void main(String[] args) {
		Control kelas = new Control();
		
		kelas.inputIdentitasRuang();
		kelas.inputKondisiRuang();
		kelas.inputKursiPintuJendela();
		kelas.kondisiRuangKelas();
		
		kelas.inputSarana();
		kelas.analisisKelistrikan();
		kelas.analisisLCD();
		kelas.analisisLampu();
		kelas.analisisKipas();
		kelas.analisisAC();
		kelas.analisisInternet();
		kelas.analisisCCTV();
		
		kelas.InputKebersihan();
		kelas.AnalisisKebersihan();
		
		kelas.InputSirkulasi();
		kelas.AnalisisSirkulasi();
		
		kelas.InputPencahayaan();
		kelas.AnalisisPencahayaan();
		
		kelas.InputKelembapan();
		kelas.AnalisisKelembapan();
		
		kelas.InputSuhu();
		kelas.AnalisisSuhu();
		
		kelas.inputKenyamananRuangKelas();
		kelas.analisisKenyamananRuangKelas();
		
		kelas.inputKeamananRuangKelas();
		kelas.analisisKeamananRuangKelas();
		
	}

}
