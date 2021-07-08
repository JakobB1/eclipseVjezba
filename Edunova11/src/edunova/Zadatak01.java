package edunova;

public class Zadatak01 {
	
	// Za unesena dva cijela broja ispiši zbroj
	public Zadatak01() {
			
		System.out.println(
				Ulaz.ucitajBroj("Unesi prvi broj", 
				"Nisi unbio cijeli broj")
				+
				Ulaz.ucitajBroj("Unesi drugi broj",
						"I drugi broj mora biti cijeli")
				);
		
	}
	
	public static void main(String[] args) {
		new Zadatak01();
	}

}
