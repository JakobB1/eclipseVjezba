package edunova;

import javax.swing.JOptionPane;

public class Zadatak04 {

	public static void main(String[] args) {

		// Program u�itava cijele brojeve od korisnika
		// sve dok se ne u�ita broj 0. Tada se program zavr�ava

		int x;
		for (;;) {
			x = Integer
					.parseInt(JOptionPane.showInputDialog("daj mi jedan broj,ako uneses nula" + ",program zavrsava"));

			if (x == 0) {
				break;
			}
		}
	}
}