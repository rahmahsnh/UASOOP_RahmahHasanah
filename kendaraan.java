public abstract class Kendaraan{
	
	public String merk;
	public String warna;
	public int kecepataan;
	
	public Kendaraan(String merk, String warna, int kecepatan){
		this.merk = merk;
		this.warna = warna;
		this.kecepatan = kecepataan;
	}
	public abstract void jalan();
	public abstract void berhenti();
}