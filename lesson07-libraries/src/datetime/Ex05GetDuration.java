package datetime;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;

import util.DateUtils;

public class Ex05GetDuration {
	
	public static void main(String[] args) {
		// Tìm khoảng thời gian giữa 2 mốc thời gian
		Calendar start = DateUtils.toCalendar("20/03/2024 19:00:00", "dd/MM/yyy HH:mm:ss");
		Calendar end = Calendar.getInstance();
		
		if (start.after(end)) {
			throw new IllegalArgumentException(">> Start time cannot be greater than End time");
		}
		
		long startInMs = start.getTimeInMillis();
		long endInMs = end.getTimeInMillis();
		
		// số năm, số tháng --> Xử lý từ DateTime của Java08
		
		long duration = endInMs - startInMs;
		System.out.println("duration: " + duration + "(ms)"); // 123924452882
		
		long days = TimeUnit.MILLISECONDS.toDays(duration); // số ngày
		
		duration -= TimeUnit.DAYS.toMillis(days); // số ms còn lại sau khi tính ngày
		long hours = TimeUnit.MILLISECONDS.toHours(duration); // số giờ
		
		duration -= TimeUnit.HOURS.toMillis(hours); // số ms còn lại sau khi tính giờ
		long minutes = TimeUnit.MILLISECONDS.toMinutes(duration); // số phút
		
		duration -= TimeUnit.MINUTES.toMillis(minutes); // số ms còn lại sau khi tính phút
		long seconds = TimeUnit.MILLISECONDS.toSeconds(duration); // số giây
		
		System.out.println("Số ngày = " + days);
		System.out.println("Số giờ = " + hours);
		System.out.println("Số phút = " + minutes);
		System.out.println("Số giây = " + seconds);
		
		
		// d = 6724mm -> ? m ? dm ? cm ? mm
		
		// m = d/1000 = 6
		
		// d = d - m*1000 = 724
		// dm = d/100 = 7
		
		// d = d - dm*100 = 24
		// cm = d/10 = 2
		
		// d = d - cm*10
		// mm = d
		
	}
	
}
