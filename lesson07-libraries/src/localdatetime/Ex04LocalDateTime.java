package localdatetime;

import static util.DateUtils.opt;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex04LocalDateTime {
	
	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDateTime startDateTime = LocalDateTime.parse("22/01/2024 19:00:10", dtf);
		LocalDateTime endDateTime = LocalDateTime.now();
		
		System.out.println("startDateTime: " + dtf.format(startDateTime));
		System.out.println("endDateTime: " + dtf.format(endDateTime));
		
		if (startDateTime.isAfter(endDateTime)) {
			throw new IllegalArgumentException("StartTime cannot greater than EndTime !!!");
		}
		
		System.out.println("\n====================\n");
		
		// preview
		// Hiệu của LocalDate -> Period
		// Hiệu của LocalTime -> Duration
		
		// Hiệu của LocalDateTime -> KHÔNG CÓ(vận dụng Period, Duration để làm)
		// LocalDateTime = LocalDate + LocalTime
		
		// valid data
		
		// xử lý cho ngày tháng năm
		LocalDate startDate = startDateTime.toLocalDate();
		LocalDate endDate = endDateTime.toLocalDate();
		Period period = Period.between(startDate, endDate);
		
		// xử lý cho giờ phút giây
		LocalTime startTime = startDateTime.toLocalTime();
		LocalTime endTime = endDateTime.toLocalTime();
		Duration duration = Duration.between(startTime, endTime);
		
		// startDate không thể lớn hơn endDate -> dữ liệu sai
		// startTime có thể lớn hơn endTime -> duration bị âm -> mượn 1day | 24hours từ period
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.println("Khoảng thời gian -->" + format(period) + " " + format(duration));
	}
	
	// design pattern: singleton, builder
	// format, math library
	
	private static String format(Period period) {
		return String.join(" ", 
				opt(period.getYears() , "year"),
				opt(period.getMonths(), "month"), 
				opt(period.getDays()  , "day"));
	}
	
	private static String format(Duration duration) {
		return String.join(" ", 
				opt(duration.toHoursPart(), "hour"),
				opt(duration.toMinutesPart() , "minute"),
				opt(duration.toSecondsPart() , "second"));
	}
	
}
