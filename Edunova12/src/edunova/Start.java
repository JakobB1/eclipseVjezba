package edunova;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Start {
	
	private List<Smjer> smjerovi;
 	
	public Start() {
		smjerovi = new ArrayList<>();
		izbornik();
	}
	
	private void izbornik() {
		System.out.println("******** Edunova APP konzola ********");
		System.out.println("IZBORNIK");
		System.out.println(" 1. Smjerovi");
		System.out.println(" 2. Polaznici");
		System.out.println(" 3. Predavači");
		System.out.println(" 4. Grupe");
		System.out.println(" 5. Izlazi iz programa");		
	}

	public static void main(String[] args) {
		new Start();
	}

}
