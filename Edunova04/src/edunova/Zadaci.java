package edunova;

import javax.swing.JOptionPane;

public class Zadaci {
	
	public static void main(String[] args) {
		

	// Zadatak 1
	// korisnik unosi cijeli broj
	// za parni broj se ispisuje Osijek
	// za neparni broj se ispisuje Donji Miholjac
	
	int a;
	
	a = Integer.parseInt(
			JOptionPane.showInputDialog("Upiši cijeli broj")
			);
	
	if(a% 2==0) {
		System.out.println("Broj je paran");
	}else {
		System.out.println("Broj je neparan");
	}

}	
}






