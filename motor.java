public class Motor extends Kendaraan{
	
	public Motor(String merk, String warna, int kecepatan){
	super(merk, warna, kecepatan);
	}
	public void jalan(){
		System.out.println("Motor Berjalan");
	}
	
	public void berhenti(){
		System.out.println("Motor Berhenti");
	}
	
	public void riding(){
		System.out.println("Motor Ride 30 degree");
	}
}