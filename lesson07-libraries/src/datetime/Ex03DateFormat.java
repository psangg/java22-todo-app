package datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex03DateFormat {
	
	public static void main(String[] args) {
		Date date = new Date();
		// date.setHours(6);
		
		// toString: Thu Mar 14 21:09:12 ICT 2024
		System.out.println("date: " + date);
		
		// cần format in ra ngày tháng năm --> trả về kiểu chuỗi
		// pattern: dd/MM/yyyy
		// dd: ngày trong tháng có 2 chữ số
		// MM: tháng có 2 chữ số
		// yyyy: năm và có 4 chữ số
		
		// cần format in ra giờ phút giây
		// pattern: HH:mm:ss || hh:mm:ss a
		// HH: hour clock 24
		// hh: hour clock 12
		// mm: month
		// ss: second
		// a: am_pm
		DateFormat df = new SimpleDateFormat("hh:mm:ss a");
		String formatted = df.format(date);
		System.out.println("formatted date: " + formatted);
		
		// Xử lý: Date, Calendar
		// Định dạng: DateFormat
		
		// Để hỗ trợ format cho KDL Calendar
		// B1: Chuyển KDL Calendar sang Date
		// B2: Sử dụng DateFormat
		
		Calendar c = Calendar.getInstance(); // now
		c.set(Calendar.HOUR_OF_DAY, 8);
		// c.get(field)
		// c.set(field, value)
		// setter, set lại thông tin thuộc tính trong Calendar
		
		// E | EE | EEE: Thứ(tiếng anh) dạng ngắn Tue, Thu
		// EEEE: Thứ(tiếng anh) dạng đầy đủ Tuesday, Thursday
		DateFormat dft = new SimpleDateFormat("dd/MM/yyyy EEEE hh:mm:ss a");
		// convert(chuyển đổi) KDL Calendar sang KDL Date
		Date covDate = c.getTime();
		formatted = dft.format(covDate);
		System.out.println("formatted calendar -> date: " + formatted);
		
		// Xử lý bài toán thời gian: sử dụng Date, Calendar
		// Khi nào muốn in ra ở định dạng nào đó: sử dụng DateFormat trả về String
	}
	
}
