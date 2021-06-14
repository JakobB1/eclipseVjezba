package edunova;

import javax.swing.JOptionPane;

public class Zadaci {

	public static void main(String[] args) {

		// Zadatak 1
		// korisnik unosi cijeli broj
		// za parni broj se ispisuje Osijek
		// za neparni broj se ispisuje Donji Miholjac

		int a;

		a = Integer.parseInt(JOptionPane.showInputDialog("Upiši cijeli broj"));

		if (a % 2 == 0) {
			System.out.println("Broj je paran");
		} else {
			System.out.println("Broj je neparan");
		}

		// Zadatak 2
		// Program unosi dva cijela broja od korisnika
		// program ispisuje veci uneseni broj

		int b, c;

		b = Integer.parseInt(JOptionPane.showInputDialog("Prvi cijeli broj"));

		c = Integer.parseInt(JOptionPane.showInputDialog("Drugi cijeli broj"));

		if (b > c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
		
		// Zadatak 3
		// Program unosi tri cijela broja od korisnika
		// program ispisuje najmanji uneseni broj
		
		int d,e,f;
		
		d = Integer.parseInt(
				JOptionPane.showInputDialog("Upisi prvi broj")
				);
		
		e = Integer.parseInt(
				JOptionPane.showInputDialog("Upisi drugi broj")
				);
		
		f = Integer.parseInt(
				JOptionPane.showInputDialog("Upisi treci broj")
				);
		 
		if (d<e && d<f) { 
			System.out.println(d);
		}else if (e<f && e<f) {
			System.out.println(e);
		} else {
			System.out.println(f);
		}
		

	}
}
