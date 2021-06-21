package vjezbaZadaci;

import javax.swing.JOptionPane;

public class Predavanje15 {

	public static void main(String[] args) {

		// Zadatak 1
		// Program unosi 2 broja i ispisuje zbroj

		int a, b, c;
		a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

		c = a + b;

		System.out.println(c);
		// Zadatak 2
		// program od korisnika unosi 2 decimalna broja
		// ispisuje veæi

		System.out.println();

		float d, e;

		d = Float.parseFloat(JOptionPane.showInputDialog("Unesite prvi dec broj"));
		e = Float.parseFloat(JOptionPane.showInputDialog("Unesite drugi dec broj"));

		if (d > e) {
			System.out.println(d);
		} else {
			System.out.println(e);
		}

		// Zadatak 3
		// Program ispisuje sve brojeve od 100 do 21
		// jedno do drugoga odvojeno zarezom

		System.out.println();

		int i = 100;
		int j = 21;

		for (int f = i; f >= j; f--) {
			System.out.println(f + ";");
		}

		// Zadatak 4
		// Program uèitava cijele brojeve od korisnika
		// sve dok se ne uèita broj 0. Tada se program završava

		// Zadatak 5
		// Program od korisnika unosi dva parna broja
		// Program ispisuje njohov zbroj

		// Zadatak 6
		// Program unosi 10 cijelih brojeva od korisnika
		// u jednodimenzionalni niz
		// Program ispisuje sve elemente niza

		// Zadatak 7
		// Prim broj je broj koji je cjelobrojno djeljiv sam s sobom
		// i s broj 1.
		// Za uneseni broj x = 27353 ispišite da li je prim broj

		// Zadatak 8
		// Program ispisuje matricu 15 x 15
		// tako da je svaki element matrice broj 0

		// Zadatak 9
		// Program od korisnika unosi brojeve
		// sve dok korisnik ne unese broj 0
		// Program ispisuje zbroj svih unesenih brojevaž

		// Zadatak 10
		// Ispiši Sve parne brojeve od 3 do 47

		// Zadatak 11
		// Za dva dana broja ispišite decimalni dio rezultata
		// djeljenja

		// Zadatak 12
		// Program ispisuje "Edunova" (ispisuju se i navodnici)

	}

}
