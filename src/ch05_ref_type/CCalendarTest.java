package ch05_ref_type;

import java.util.Calendar;

public class CCalendarTest {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();

		System.out.println("YEAR : " + cal.get( Calendar.YEAR ));
		System.out.println("MONTH : " + (cal.get( Calendar.MONTH ) + 1));
		System.out.println("DAY_OF_MONTH : " + cal.get( Calendar.DAY_OF_MONTH ));
		System.out.println("DAY_OF_WEEK : " + cal.get( Calendar.DAY_OF_WEEK ));
		System.out.println("DATE : " + cal.get( Calendar.DATE ));
		System.out.println("HOUR : " + cal.get( Calendar.HOUR ));
		System.out.println("HOUR_OF_DAY : " + cal.get( Calendar.HOUR_OF_DAY ));
		System.out.println("MINUTE : " + cal.get( Calendar.MINUTE ));
		System.out.println("SECOND : " + cal.get( Calendar.SECOND ));

	}

}
