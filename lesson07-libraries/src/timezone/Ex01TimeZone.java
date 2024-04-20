package timezone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

import util.DateUtils;

public class Ex01TimeZone {
	
	/*
	 TimeZone là khái niệm dùng để phân chia, xác định thời gian của các quốc gia
	 khu vực trên thế giới
	 
	 Có 3 cách để xác định thời gian với timezone
	 
	 + GMT(Greenwich Mean Time)
	   --> GMT+0 GMT+11 GMT-1 GMT-11
	 
	 + UTC(Cordinated Universal Time)
	   --> UTC+0 UTC+11 ....
	   --> Tiêu chuẩn trên hệ thông internet
	 
	 + Area/Country Time
	   --> ICT: Indochina time        -> Giờ đông dương
	       HST: Hawaiin standard time
	 
	 */
	
	public static void main(String[] args) {
		System.out.println("Locale default: " + Locale.getDefault());
		System.out.println("Timezone default: " + TimeZone.getDefault());
		
		System.out.println("\n ========= \n");
		
		String[] timezones =  TimeZone.getAvailableIDs();
		for (String tz: timezones) {
			System.out.println("tz --> " + tz);
		}
		// thực thi nó trên máy cá nhân
		// --> lấy thời gian theo timezone trên máy cá nhân: UTC+7
		
		// khi code được triển khia, deploy code chạy trên 1 server nào đó
		// --> lấ thời gian theo timezone cài đặt trên máy server
		TimeZone vietNamTz = TimeZone.getTimeZone("Asia/Ho_Chi_Minh");
		Calendar c1 = Calendar.getInstance(vietNamTz);
		System.out.println("\nc1 --> " + c1);
		System.out.println("c1 format --> " + DateUtils.format(c1, "dd/MM/yyyy HH:mm:ss", vietNamTz));
		
		// Thay vì dùng mặc định, nếu biết được quốc gia phát triển dự án cho
		// Truyền timezone của quốc gia, khu vực đó vào lúc lấy thời gian
		
		// Locale: tác động đến ngôn ngữ, ngày đầu tuần(chủ nhật, thứ 2)
		// Timezone: tác động đến thời gian theo múi giờ
		
		TimeZone berlinTz = TimeZone.getTimeZone("Europe/Berlin");
		Calendar c2 = Calendar.getInstance(berlinTz);
		System.out.println("\nc2 --> " + c2);
		System.out.println("c2 format --> " + DateUtils.format(c2, "dd/MM/yyyy HH:mm:ss", berlinTz));
		
		System.out.println("\n ========= \n");
		
		LocalDateTime ldatetime = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
		System.out.println("ldatetime --> " + ldatetime);
		
		
	}
	
}
