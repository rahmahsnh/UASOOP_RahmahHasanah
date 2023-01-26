import javax.swing.*;

public class MainProgram{
	
	JFrame rider;
	JFrame motocycles;
	JFrame submarine;
	
	MainProgram(){
		rider= new JFrame();
		rider.setSize(500,300);
		rider.setVisible(true);
		
		Pengemudi pengemudi1 = new Pengemudi("Rahmah", 312110512);
		JOptionPane.showMessageDialog(driver,"Nama : " + pengemudi1.nama + "\n" + "No SIM : " + pengemudi1.sim);
		rider.dispose();
		
		motocycles= new JFrame();
		motocycles.setSize(500,300);
		motocycles.setVisible(true);
		Motor motor1 = new Motor("Kawasaki", "White", 300);
		JOptionPane.showMessageDialog(motocycles,"Merk Motor : " + motor1.merk + "\n" + "Warna Motor : " + motor1.warna + "\n" + "kecepatan : " + motor1.kecepatan + "/Kmh");
		motocycles.dispose();
	}
	
	public static void main(String[] args) {  
	new MainProgram();  
	}
}