package localdatetime;

import java.time.Duration;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static util.DateUtils.*;

public class Ex03LocalTime {
	
	public static void main(String[] args) {
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		
		// 14:20:20
		LocalTime startTime = LocalTime.of(14, 22, 20);
		LocalTime endTime = LocalTime.parse("17:42:40", dtf);
		
		System.out.println("startTime: " + startTime);
		System.out.println("endTime: " + endTime);
		
		// Tìm khoảng giữa 2 mốc thời gian - LocalTime
		
		//  PT 3H 22M 20S
		Duration duration = Duration.between(startTime, endTime);
		System.out.println("duration: " + duration);
		
		// JAVA08: getSeconds, toMinutes, toHours,
		//     09:             toMinutesPart, toHoursPart
		
		// 3h20p20s -> 12020s
		
		// toMinutes -> 120p
		// toMinutesPart -> 20p
		
		String format = String.join(" ", 
				opt(duration.toHoursPart(), "hour"),
				opt(duration.toMinutesPart() , "minute"),
				opt(duration.toSecondsPart() , "second"));
		
		System.out.println("Khoảng thời gian:" + format);
	}
	
}
