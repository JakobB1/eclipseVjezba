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

			//

		}
	}
}
