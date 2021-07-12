package vjezbaZadaci;

import java.util.Arrays;

public class Predavanje17_zad02 {
	
	// Zadatak 2
	// Kreirajte metodu slucajniBrojevi 
	// tipa niz decimalnih brojeva (double)
	// koja vraæa 10 sluèajnih brojeva
	// Math.random();


	private static double[] slucajniBrojevi() {
		double[] brojevi = new double[10];
		for(int i=0;i<10;i++) {
			brojevi[i]=Math.random();
		}
		return brojevi;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(slucajniBrojevi()));
	}

}