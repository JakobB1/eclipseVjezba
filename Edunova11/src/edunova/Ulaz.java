package edunova;

import javax.swing.JOptionPane;

public class Ulaz {

	static int ucitajBroj(String poruka, String greska) {
		while (true) {
			try {
				return Integer.parseInt(
						JOptionPane.showInputDialog(poruka)
						);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, greska);
			}
		}
	}
			
	
	static double ucitajBroj1(String poruka1, String greska1) {
		while (true) {
			try {
				return Double.parseDouble(
						JOptionPane.showInputDialog(poruka1)
						);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, greska1);
			}			
		}
	}
	
	//zadatak: Kreirajte metodu ucitajDecimalniBroj
	

}
