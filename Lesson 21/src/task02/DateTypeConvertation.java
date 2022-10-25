package task02;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateTypeConvertation {
	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);
		
		System.out.println("\n"+dateToLocalDateTime(date));
		System.out.println(dateToLocalDate(date));
		System.out.println(timeToLocalTime(date));
	}

	public static LocalDateTime dateToLocalDateTime (Date date) {
		ZonedDateTime zdt = date.toInstant().atZone(ZoneId.systemDefault());
		
		return zdt.toLocalDateTime();
	}
	
	public static LocalDate dateToLocalDate(Date date) {
		ZonedDateTime zdt = date.toInstant().atZone(ZoneId.systemDefault());
		
		return zdt.toLocalDate();
	}
	
	public static LocalTime timeToLocalTime(Date date) {
		ZonedDateTime zdt = date.toInstant().atZone(ZoneId.systemDefault());
		
		return zdt.toLocalTime();
	}
}