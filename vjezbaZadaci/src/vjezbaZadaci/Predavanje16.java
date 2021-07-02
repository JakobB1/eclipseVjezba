package vjezbaZadaci;

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
}
