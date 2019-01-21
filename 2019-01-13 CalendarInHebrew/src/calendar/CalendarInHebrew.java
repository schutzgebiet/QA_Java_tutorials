package calendar;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class CalendarInHebrew {
	
	static DateTimeFormatter monthFormatter = 
			DateTimeFormatter.ofPattern("MMMM", new Locale("he"));
	static DateTimeFormatter weekdayFormatter = 
			DateTimeFormatter.ofPattern("EEE", new Locale("he"));
	static LocalDate stub = LocalDate.of(0, 1, 1);
	static LocalDate sunday = LocalDate.of(2019,1,13);
	
	public static void toConsole(int year) {
		printHeader();
		for (int i=1; i<13; i++)printMonth(year, i);
	}

	private static void printMonth(int year, int month) {
		printMonthName(month);
		printWeekDaysString();
		printMonthBody(year, month);
		
	}

	private static void printMonthBody(int year, int month) {
		// TODO Auto-generated method stub
		
	}

	private static void printWeekDaysString() {
		LocalDate current = sunday;
		String res = "";
		for (int i=7; i>0; i--) {
			res = current.format(weekdayFormatter)+res;
			if (i!=1) res = "\t"+res;
			current = current.plusDays(1);
		}
		System.out.println();
		System.out.println(res);
		System.out.println();
		
	}

	private static void printMonthName(int month) {
		System.out.println(
				"\t\t\t\t\t\t"+stub.withMonth(month).format(monthFormatter)
		);
		
	}

	private static void printHeader() {
		// TODO Auto-generated method stub
	}

}
