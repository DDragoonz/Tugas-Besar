
public class Model {

	private int steker;
	private int kondisiSteker;
	private String posisiSteker;
	private int kabelLCD;
	private String kondisiKabelLCD;
	private String posisiKabelLCD;
	private int lampu;
	private int lampuBerfungsi;
	private String posisiLampu;
	private int kipas;
	private int kipasBerfungsi;
	private String posisiKipas;
	private int AC;
	private String kondisiAC;
	private String posisiAC;
	private String SSID;
	private boolean loginState;
	private int CCTV;
	private int jumlahCCTVberfungsi;
	private String posisiCCTV;
	
	private String KondisiLantai;
	private String KondisiDinding;
	private String KondisiAtap;
	private String KondisiPintu;
	private String KondisiJendela;
	private String Sirkulasiudara ;
<<<<<<< HEAD
	private int Pencahayaan;
	private int Kelembapan;
	private int Suhu;
	
=======
	private int Pencahayaan ;
	private int Kelembapan ;
	private int Suhu ;
>>>>>>> origin/master
	private int kebisingan;
	private int bau;
	private int kebocoran;
	private int kerusakan;
	private int keausan;
	private int kekokohan;
	private int kuncipintudanjendela;
	private int bahaya;
	private boolean benar = true;
	private boolean salah = false;

	public int getKekokohan() {
		return kekokohan;
	}

	public void setKekokohan(int kekokohan) {
		this.kekokohan = kekokohan;
	}

	public int getKuncipintudanjendela() {
		return kuncipintudanjendela;
	}

	public void setKuncipintudanjendela(int kuncipintudanjendela) {
		this.kuncipintudanjendela = kuncipintudanjendela;
	}

	public int getBahaya() {
		return bahaya;
	}

	public void setBahaya(int bahaya) {
		this.bahaya = bahaya;
	}

	public int getKebisingan() {
		return kebisingan;
	}

	public void setKebisingan(int kebisingan) {
		this.kebisingan = kebisingan;
	}

	public int getBau() {
		return bau;
	}

	public void setBau(int bau) {
		this.bau = bau;
	}

	public int getKebocoran() {
		return kebocoran;
	}

	public void setKebocoran(int kebocoran) {
		this.kebocoran = kebocoran;
	}

	public int getKerusakan() {
		return kerusakan;
	}

	public void setKerusakan(int kerusakan) {
		this.kerusakan = kerusakan;
	}

	public int getKeausan() {
		return keausan;
	}

	public void setKeausan(int keausan) {
		this.keausan = keausan;
	}

	public boolean isBenar() {
		return benar;
	}

	public void setBenar(boolean benar) {
		this.benar = benar;
	}

	public boolean isSalah() {
		return salah;
	}

	public void setSalah(boolean salah) {
		this.salah = salah;
	}

	
	public int getSteker() {
		return steker;
	}
	public void setSteker(int steker) {
		this.steker = steker;
	}
	public int getKondisiSteker() {
		return kondisiSteker;
	}
	public void setKondisiSteker(int kondisiSteker) {
		this.kondisiSteker = kondisiSteker;
	}
	public String getPosisiSteker() {
		return posisiSteker;
	}
	public void setPosisiSteker(String posisiSteker) {
		this.posisiSteker = posisiSteker;
	}
	public int getKabelLCD() {
		return kabelLCD;
	}
	public void setKabelLCD(int kabelLCD) {
		this.kabelLCD = kabelLCD;
	}
	public String getKondisiKabelLCD() {
		return kondisiKabelLCD;
	}
	public void setKondisiKabelLCD(String kondisiKabelLCD) {
		this.kondisiKabelLCD = kondisiKabelLCD;
	}
	public String getPosisiKabelLCD() {
		return posisiKabelLCD;
	}
	public void setPosisiKabelLCD(String posisiKabelLCD) {
		this.posisiKabelLCD = posisiKabelLCD;
	}
	public int getLampu() {
		return lampu;
	}
	public void setLampu(int lampu) {
		this.lampu = lampu;
	}
	public int getLampuBerfungsi() {
		return lampuBerfungsi;
	}
	public void setLampuBerfungsi(int lampuBerfungsi) {
		this.lampuBerfungsi = lampuBerfungsi;
	}
	public String getPosisiLampu() {
		return posisiLampu;
	}
	public void setPosisiLampu(String posisiLampu) {
		this.posisiLampu = posisiLampu;
	}
	public int getKipas() {
		return kipas;
	}
	public void setKipas(int kipas) {
		this.kipas = kipas;
	}
	public int getKipasBerfungsi() {
		return kipasBerfungsi;
	}
	public void setKipasBerfungsi(int kipasBerfungsi) {
		this.kipasBerfungsi = kipasBerfungsi;
	}
	public String getPosisiKipas() {
		return posisiKipas;
	}
	public void setPosisiKipas(String posisiKipas) {
		this.posisiKipas = posisiKipas;
	}
	public int getAC() {
		return AC;
	}
	public void setAC(int aC) {
		AC = aC;
	}
	public String getKondisiAC() {
		return kondisiAC;
	}
	public void setKondisiAC(String kondisiAC) {
		this.kondisiAC = kondisiAC;
	}
	public String getPosisiAC() {
		return posisiAC;
	}
	public void setPosisiAC(String posisiAC) {
		this.posisiAC = posisiAC;
	}
	public String getSSID() {
		return SSID;
	}
	public void setSSID(String sSID) {
		SSID = sSID;
	}
	public boolean isLoginState() {
		return loginState;
	}
	public void setLoginState(boolean loginState) {
		this.loginState = loginState;
	}
	public int getCCTV() {
		return CCTV;
	}
	public void setCCTV(int cCTV) {
		CCTV = cCTV;
	}
	public int getJumlahCCTVberfungsi() {
		return jumlahCCTVberfungsi;
	}
	public void setJumlahCCTVberfungsi(int jumlahCCTVberfungsi) {
		this.jumlahCCTVberfungsi = jumlahCCTVberfungsi;
	}
	public String getPosisiCCTV() {
		return posisiCCTV;
	}
	public void setPosisiCCTV(String posisiCCTV) {
		this.posisiCCTV = posisiCCTV;
	}
	public String getKondisiLantai() {
		return KondisiLantai;
	}
	public void setKondisiLantai(String kondisiLantai) {
		KondisiLantai = kondisiLantai;
	}
	public String getKondisiDinding() {
		return KondisiDinding;
	}
	public void setKondisiDinding(String kondisiDinding) {
		KondisiDinding = kondisiDinding;
	}
	public String getKondisiAtap() {
		return KondisiAtap;
	}
	public void setKondisiAtap(String kondisiAtap) {
		KondisiAtap = kondisiAtap;
	}
	public String getKondisiPintu() {
		return KondisiPintu;
	}
	public void setKondisiPintu(String kondisiPintu) {
		KondisiPintu = kondisiPintu;
	}
	public String getKondisiJendela() {
		return KondisiJendela;
	}
	public void setKondisiJendela(String kondisiJendela) {
		KondisiJendela = kondisiJendela;
	}
	public String getSirkulasiudara() {
		return Sirkulasiudara;
	}
	public void setSirkulasiudara(String sirkulasiudara) {
		Sirkulasiudara = sirkulasiudara;
	}
	public int getPencahayaan() {
		return Pencahayaan;
	}
	public void setPencahayaan(int pencahayaan) {
		Pencahayaan = pencahayaan;
	}
	public int getKelembapan() {
		return Kelembapan;
	}
	public void setKelembapan(int kelembapan) {
		Kelembapan = kelembapan;
	}
	public int getSuhu() {
		return Suhu;
	}
	public void setSuhu(int suhu) {
		Suhu = suhu;
	}
}
