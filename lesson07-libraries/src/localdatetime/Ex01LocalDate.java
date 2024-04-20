package localdatetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class Ex01LocalDate {
	
	/*
	 LocalDate --> Ngày, Tháng, Năm
	           --> Ngày trong tháng, năm
	           --> Tuần trong tháng, năm
	           --> Ngày trong tuần
	 */
	
	public static void main(String[] args) {
		// util Date --> Date date = new Date();              --> constructor
		//           --> Calendar c = Calendar.getInstance(); --> singleton pattern
		// LocalDate, LocalTime, LocalDatetime                --> builder pattern
		
		Locale vnLocale = new Locale("vi", "vn");
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy EEEE", vnLocale);
		
		// LocalDate.now() -> lấy ngày tháng năm hiện tại theo system time
		// LocalDate ldate = LocalDate.now();
		
		// normal class
		// setter --> setField(value) -> return void
		
		// builder pattern
		// setter --> withField(value) -> return this
		
		LocalDate ldate = LocalDate.now()
							.withDayOfMonth(15)
							.withMonth(4);
		System.out.println("ldate: " + ldate);
		System.out.println("ldate format: " + dtf.format(ldate));
		
		System.out.println("\n===================\n");
		// c.set(field, value)
		
		
		// Calendar.SUNDAY -> 1
		// Calendar.MONDAY -> 2
		
		// DayOfWeek.Monday  -> 1
		// DayOfWeek.Tuesday -> 2
		
		LocalDate aDate = LocalDate.of(2024, Month.MARCH, 31)
							.with(ChronoField.DAY_OF_WEEK, 5) // 29/03
						    .plusWeeks(2)
						    .minusDays(3); // 09/04
							// unsupported field
							// .with(ChronoField.SECOND_OF_MINUTE, 42);
		
		System.out.println("aDate before: " + dtf.format(aDate));
		
		System.out.println("hash(aDate) before: " + System.identityHashCode(aDate));
		
		// cách 1
		// plus 1 day -> return this ==> ăn vào this hiện tại aDate
		
		// cách 2
		// plus 1 day -> return new object(Localdate) ==> ko ăn vào this hiện tại
		//            -> muốn ăn vào aDate hiện tại thì phải gán lại
		aDate = aDate.plusDays(1);
		
		System.out.println("\naDate after: " + dtf.format(aDate));
		
		System.out.println("hash(aDate) after: " + System.identityHashCode(aDate));
		
		
	}
	
}
