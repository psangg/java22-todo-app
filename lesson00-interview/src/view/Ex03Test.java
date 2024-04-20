package view;

import java.util.Calendar;

public class Ex03Test {
	
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance(); // ngày tháng năm giờ phút giây hiện tại
		
		System.out.println("Ngày thứ mấy trong năm: " + c.get(Calendar.DAY_OF_YEAR));
	
		int month = c.get(Calendar.MONTH) + 1; // 0-11
		
		System.out.println("Số ngày trong tháng " + month + " : " + c.getActualMaximum(Calendar.DAY_OF_MONTH));
	}
	
}
