import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalField;
import java.util.Locale;

public class Test {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		LocalDate birthdate = LocalDate.of(1958, Month.FEBRUARY, 21);
		System.out.println(birthdate);
		LocalDate myWifeBirthdate = LocalDate.of(1962, 6, 13);
		System.out.println(myWifeBirthdate);
		
		LocalDate empty = LocalDate.of(0, 1, 1);
		System.out.println(empty);
		
		System.out.println(now.getDayOfMonth());
		System.out.println(birthdate.getDayOfYear());
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue());
		System.out.println(now.getYear());
		System.out.println(now.getDayOfWeek());
		
		//System.out.println(now.get(ChronoField.YEAR_OF_ERA));
		/*
		birthdate = birthdate.withMonth(3);
		birthdate = birthdate.withDayOfMonth(8);
		System.out.println(birthdate);
		*/
		LocalTime timeNow = LocalTime.now();
		System.out.println(timeNow);
		
		LocalDateTime datetimeNow = LocalDateTime.now();
		System.out.println(datetimeNow);
		
		LocalDate copy = LocalDate.of(-1958, 3, 8);
		System.out.println(copy.equals(birthdate));
		
		DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy G, EE", new Locale("en-US"));
		System.out.println(copy.format(dateFormatter));
		
		for (int i=1; i<13; i++) {
			System.out.println(LocalDate.of(0, i, 1).format(
					DateTimeFormatter.ofPattern(("MMMM"), new Locale("he"))));
		}	
			DateTimeFormatter readDTF = DateTimeFormatter
					.ofPattern("dd MMM yyyy", new Locale("en-US"));
			LocalDate read = LocalDate.parse("21 Feb 1958", readDTF);
			System.out.println(read.format(dateFormatter));
			
			System.out.println(now.plusYears(3).plusMonths(5).plusWeeks(2).plusDays(11));
			System.out.println(now.plus(20000,ChronoUnit.MILLENNIA).format(dateFormatter));

			//Period p1 = Period.between(birthdate, myWifeBirthdate);
			Period p1 = Period.parse("P12Y3M4D");
			System.out.println(p1);
			System.out.println(p1.getYears()+" years, "+p1.getMonths()+" months, "+p1.getDays()+" days");
	
			Period p2 = Period.ofDays(1000);
			System.out.println(p2);
			System.out.println(now.plus(p2));
			
			ZoneId zoneId = ZoneId.of("Australia/Sydney");
			System.out.println(zoneId);
			ZonedDateTime zdt = ZonedDateTime.now(zoneId);
			System.out.println(zdt);
			
	}

}
