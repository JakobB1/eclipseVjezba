package vjezbaZadaci;

import java.util.Arrays;

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

		//int x;
		//for (;;) {
		//	x = Integer
		//			.parseInt(JOptionPane.showInputDialog("daj mi jedan broj,ako uneses nula" + ",program zavrsava"));

		//	if (x == 0) {
		//		break;
		//	}

			// Zadatak 5
			// Program od korisnika unosi dva parna broja
			// Program ispisuje njohov zbroj
			
			System.out.println();
			
			int f, g;

			for (;;) {
				f = Integer.parseInt(JOptionPane.showInputDialog("Unesi jedan parni broj"));

				if (f % 2 == 0) {
					break;
				}

				JOptionPane.showMessageDialog(null, "Nisi unio parni broj");

			}

			for (;;) {
				g = Integer.parseInt(JOptionPane.showInputDialog("Unesi jedan parni broj"));

				if (g % 2 == 0) {
					break;
				}

				JOptionPane.showMessageDialog(null, "Nisi unio parni broj");
			}

			int sum = f + g;

			System.out.println(sum);

			// Zadatak 6
			// Program unosi 10 cijelih brojeva od korisnika
			// u jednodimenzionalni niz
			// Program ispisuje sve elemente niza
			
			System.out.println();
			
			int niz[] = new int[10];

			for (int h = 0; i < 10; i++) {
				niz[h] = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			}

			System.out.println(Arrays.toString(niz));

			// Zadatak 7
			// Prim broj je broj koji je cjelobrojno djeljiv sam s sobom
			// i s broj 1.
			// Za uneseni broj x = 27353 ispišite da li je prim broj
			
			System.out.println();
			
			int k = 273532542;
			boolean primBroj = true;
			for (int l = 2; i < k; i++) {

				if (k % i == 0) {
					primBroj = false;
					break;
				}
			}
			if (primBroj) {
				System.out.println("Broj je prim");
			} else {
				System.out.println("Broj nije prim");
			}

			
			
			// Zadatak 8
			// Program ispisuje matricu 15 x 15
			// tako da je svaki element matrice broj 0
			
			//System.out.println();
			
			//int l = 15, m = 15;

			//for (int x = 0; x < l; x++) {
			//	for (int y = 0; y < m; y++) {
			//		System.out.print(0);
			//	}
			//	System.out.println();

			// Zadatak 9
			// Program od korisnika unosi brojeve
			// sve dok korisnik ne unese broj 0
			// Program ispisuje zbroj svih unesenih brojeva
				
			//System.out.println();
			
			//int a;
			//int sum = 0;

			//for (;;) {
			//	a = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
			//	if (a == 0) {
			//		break;
			//	}
			//	sum = sum+a;
			// }
			// System.out.println(sum);

			// Zadatak 10
			// Ispiši Sve parne brojeve od 3 do 47
			
			System.out.println();
			
			for (int n = 3; n < 47; n++) {
				if (n % 2 == 0) {
					System.out.println(n);
				}
			}
				
			// Zadatak 11
			// Za dva dana broja ispišite decimalni dio rezultata
			// djeljenja
			
			System.out.println();
			
			double o = 3, p = 2;

			double rez = o / p;

			int r = (int) rez;

			System.out.println(rez - r);
		
			// Zadatak 12
			// Program ispisuje "Edunova" (ispisuju se i navodnici)
			
			System.out.println();
			
			System.out.println(("\"Edunova\""));

		
    }
  }
  


			
	