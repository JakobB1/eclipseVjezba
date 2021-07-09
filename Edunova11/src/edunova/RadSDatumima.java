package edunova;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class RadSDatumima {
	
	public RadSDatumima() {

		Date datumRodenja;
		
		Calendar gc = GregorianCalendar.getInstance();
		gc.set(Calendar.YEAR, 2021);
		gc.set(Calendar.MONTH, 11);  // siječanj je 0
		gc.set(Calendar.DAY_OF_MONTH, 15);
		datumRodenja = gc.getTime();
		
		System.out.println(datumRodenja);
		
	}
	
	public static void main(String[] args) {
		new RadSDatumima();
	}

}
