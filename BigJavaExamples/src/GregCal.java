import java.util.Calendar;
import java.util.GregorianCalendar;

public class GregCal {

	public static void main(String[] args) {
		// 
		
		GregorianCalendar cal = new GregorianCalendar();
		
		cal.add(Calendar.DAY_OF_MONTH, 100);
		
		System.out.println("Date: " + cal.get(Calendar.DAY_OF_MONTH) + "/" + cal.get(Calendar.MONTH) + "/" + cal.get(Calendar.YEAR));
		System.out.println("Weekday: " + cal.get(Calendar.DAY_OF_WEEK));
		
		GregorianCalendar bday = new GregorianCalendar(2019, Calendar.SEPTEMBER, 11);
		
		System.out.println("Bday WeekDay: " + bday.get(Calendar.DAY_OF_WEEK));
		bday.add(Calendar.DAY_OF_MONTH, 10000);
		System.out.println("Date: " + bday.get(Calendar.DAY_OF_MONTH) + "/" + bday.get(Calendar.MONTH) + "/" + bday.get(Calendar.YEAR));
		
		
		
		

	}

}
