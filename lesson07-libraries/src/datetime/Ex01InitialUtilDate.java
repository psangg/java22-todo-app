package datetime;

import java.util.Date;

/**
 * JAVA07
 * --> java.util.Date: hỗ trợ lưu trữ (1.0)
 *                   : hầu hết các hàm bị đánh dấu @deprecated (lỗi thời, ko khuyến khích sử dụng)
 *                   
 * --> Calendar      : hỗ trợ lưu trữ + hàm xử lý (1.1)
 * --> DateFormat    : hỗ trợ định dạng dữ liệu 
 * 
 * Quy ước: Tháng 0 - 11
 *
 */

public class Ex01InitialUtilDate {
	
	public static void main(String[] args) {
		// new Date() -> tạo ra một đối tượng của class Date
		// chứa thông tin thời gian(ntn gpg và những thông tin khác) hiện tại
		// toString --> Thu Mar 14 20:02:42 ICT 2024: ICT: Indochina Time
		Date date = new Date();
		System.out.println("date: " + date);
		System.out.println("month: " + date.getMonth() + 1);
		// replaced by {@code Calendar.get(Calendar.MONTH)}.
		// hạn chế dùng các hàm @depreacted, vì dễ bị sai
		
		// new Date(long date) --> long date: số ms tính từ epoch time(1.1.1970 0:0:0 GMT)
		// Tương tự số, mốc 0 thì thời gian nó cần một mốc thời gian, được quy ước là unix time, epoch time
		// 1.1.1970 0:0:0 -> nếu chọn mốc thời gian thời gian 0.0.0 0:0:0 thì 1 lần tính toán
		// đến thời gian hiện tại đơn vị ms rất là lớn k có KDL, vùng nhớ nào có thể lưu trữ
		// người hiểu: 15/03/2024
		// máy: số ms từ 15/03/2024 về 1.1.1970
		
		System.out.println("system_time: " + System.currentTimeMillis() + "(ms)");
		
		Date aDate = new Date(82000);
		System.out.println("adate 82000ms from epoch: " + aDate);
		
		// Các hàm đều bị deprecated, hạn chế sử dụng
		// Chuyển qua Calendar
	}
	
	// app --> 2024 --> có dự án đang phát triển
	private static void app() {
		// sử dụng java 1.0
		// System.out.println("app: " + multiply(1.12819292292f, 7.929292929292f));
		
		// nâng sử dụng java 2.0
		System.out.println("app: " + multiply(1.12819292292d, 7.929292929292d));
	}
	
	// app# --> 2015 --> hoàn thành, k có chức năng mới
	private static void app1() {
		// sử dụng java 1.0, 2.0
		System.out.println("app1: " + multiply(2f, 5f));
		
		// java 1.0 chạy chậm, nâng lên 2.0 để cải thiện JVM, gặp vấn đề
		System.out.println("app1: " + multiply(2d, 5d));
	}
	
	// java library
	// version 1.0
	// float: độ dài tối đa là 7 chữ số cho cả phần nguyên(ưu tiên hơn) và thập phân
	// report: hàm chưa dc tốt, ít hỗ trợ số thập phân
	@Deprecated
	private static float multiply(float a, float b) {
		return a * b;
	}
	
	// // version 2.0
	private static double multiply(double a, double b) {
		return a * b;
	}
}
