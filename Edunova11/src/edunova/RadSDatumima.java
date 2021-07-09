package edunova;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class RadSDatumima {
	
	public RadSDatumima() {

		Date datumRodenja;
		
		Calendar gc = GregorianCalendar.getInstance();
		gc.set(Calendar.YEAR, 2021);
		gc.set(Calendar.MONTH, 10);  // siječanj je 0
		gc.set(Calendar.DAY_OF_MONTH, 15);
		datumRodenja = gc.getTime();
		
		System.out.println(datumRodenja);
		// dokumentacija
		SimpleDateFormat df = new SimpleDateFormat("dd. MM. yyyy.");
		System.out.println(df.format(datumRodenja));
		
		try {
			datumRodenja = df.parse("16. 06. 2020.");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(df.format(datumRodenja));
		// dokumentacija
		// dokumentacija
		System.out.println(datumRodenja.getTime());
		
		gc.setTime(datumRodenja);
		gc.add(Calendar.MONTH, 45);
		
		System.out.println(df.format(gc.getTime()));
	}
	
	public static void main(String[] args) {
		new RadSDatumima();
	}

}
