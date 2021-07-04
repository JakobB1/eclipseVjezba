package vjezbaZadaci;

import java.util.Arrays;

public class Predavanje16 {

	public static void main(String[] args) {

		// Zadatak 1

		// pomoću while petlje ispišite sve parne brojeve
		// od 3 do 22 uz iznimku brojeva 8 i 10 (njih ne treba ispisati)

		int i = 3;
		while (i <= 22) {
			if (i % 2 == 0 && !(i == 8 || i == 10)) {
				System.out.println(i);
			}
			i++;
		}

		// Zadatak 2

		// s pomoću do while petlje zbrojite prvih 100 brojeva
		// ispišite rezultat

		int j = 0;
		int sum = 0;

		do {
			sum += j;
		} while (++i <= 100);

		System.out.println(sum);
	}

	
	
	// Zadatak 3

	// Ulaz u program je niz znakova koji sadrži
	// imena gradova razdvojeno zarezom
	// Program ispisuje naziv grada koji u sebi ima najmanje znakova

	// Primjer ulaza: "Osijek, Zagreb, Varaždin, Sinj, Donji Miholjac"
	// Sinj

	/*
	 * public static void main(String[] args) { String s =
	 * "Osijek, Zagreb, Varaždin, Sinjski lug, Donji Miholjac"; String[] gradovi =
	 * s.split(","); int najmanji=Integer.MAX_VALUE; int index=0; for(int
	 * i=0;i<gradovi.length;i++) { if(gradovi[i].trim().length()<najmanji) {
	 * najmanji = gradovi[i].trim().length(); index=i; } }
	 * System.out.println(gradovi[index].trim().toUpperCase()); for(String grad:
	 * gradovi) { if(grad.trim().length()==najmanji) {
	 * System.out.println(grad.trim().toLowerCase()); } }
	 */

	
	
	// Zadatak 4

	// Ulaz je ime i prezime
	// Izlaz email adresa u Edunovi

	// primjer: Tomislav Jakopec -> tjakopec@edunova.hr

	/*
	 * String ime = "Jakob Brkić"; String[] imePrezime = ime.split(" "); String
	 * email="";
	 * 
	 * email=imePrezime[0].substring(0,1).toLowerCase()+imePrezime[1].toLowerCase();
	 * System.out.println(email+"@edunova.hr");
	 */
}
