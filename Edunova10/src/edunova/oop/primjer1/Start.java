package edunova.oop.primjer1;

public class Start {
	
	// Klasa Dokument ima svojstva: ID, iznos, datum
	// Klasa Račun nasljeđuje Dokument i dodaje svojstvo: Kupac
	// Kupac ima ID, naziv i adresu
	// Klasa Primka nasljeđuje Dokument i dodaje svojstvo: otpremnica
	
	// Kreirati po jednu instancu klasa Račun i Primka
	
	public Start() {
		
		Racun r1 = new Racun (13, 120.45, "01.05.2021", new Kupac(11, "Ivo Ivic","Kapucinska 4"));
		
		Primka primka = new Primka(14 ,15.67, "08.07.2021", "otpremnica 1");
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		new Start();
	}

}
