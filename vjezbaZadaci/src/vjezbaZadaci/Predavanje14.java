package vjezbaZadaci;

import javax.swing.JOptionPane;

public class Predavanje14 {

	public static void main(String[] args) {

		// Program uèitava 5 decimalnih brojeva u niz
		// Program ispisuje prvi i posljednji element niza

		float[] dec = new float[5];

		dec[0] = Float.parseFloat(JOptionPane.showInputDialog("Unesi prvi"));
		dec[1] = Float.parseFloat(JOptionPane.showInputDialog("Unesi drugi"));
		dec[2] = Float.parseFloat(JOptionPane.showInputDialog("Unesi treci"));
		dec[3] = Float.parseFloat(JOptionPane.showInputDialog("Unesi cetvrti"));
		dec[4] = Float.parseFloat(JOptionPane.showInputDialog("Unesi peti"));

		System.out.println("Prvi br je " + dec[0] + " a zadnji " + dec[4]);

		
		// Drugi nacin

		double[] b = { Double.parseDouble(JOptionPane.showInputDialog("B1")),
				Double.parseDouble(JOptionPane.showInputDialog("B2")),
				Double.parseDouble(JOptionPane.showInputDialog("B3")),
				Double.parseDouble(JOptionPane.showInputDialog("B4")),
				Double.parseDouble(JOptionPane.showInputDialog("B5")) };
		System.out.println(b[0] + " - " + b[4]);

		// Korisnik unosi cijeli broj
		// Program ispisuje broj 7 jedno ispod drugog
		// onoliko puta koliko je korisnik unio

		int unos = 0;

		for (int i = 0; i < 7; i = i + 1) {
			System.out.println("7");
		}

		// u pravilu zadaci na razgovorima na poslu
		// bez izvoðenja koda
		System.out.println();
		int t = 0, k = 1;
		t = ++k; // t = 2, k=2
		k = ++t - k--; // t = 3, k=1
		System.out.println(k + t--); // 4
		// DZ jos 7 zadataka

		
		// Program ispisuje sve parne brojeve od 1 do 55
		// u petlji obavezno koristiti vrijednost 1 i 55
		System.out.println();
		
		for(int i=1;i<=55;i++) {
		System.out.println(i);	
		}
		
		// Zbrojiti prvih 100 brojeva
		System.out.println();
		
		int zbroj=0; 
		for(int i=0;i<=100;i++) {
			zbroj+=i;
		}
		System.out.println(zbroj);
	}
}
