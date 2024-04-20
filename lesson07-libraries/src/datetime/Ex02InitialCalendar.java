package datetime;

import java.util.Calendar;

public class Ex02InitialCalendar {
	
	public static void main(String[] args) {
		
		/*
		 Calendar.getInstance()
		   + khởi tạo 1 đối tượng cho Calendar(gán thời gian hiện tại vào)
		   + sử dụng design pattern -> singleton
		   
		   + toString: java.util.GregorianCalendar[time=1710424244904,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Bangkok",offset=25200000,dstSavings=0,useDaylight=false,transitions=3,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2024,MONTH=2,WEEK_OF_YEAR=11,WEEK_OF_MONTH=3,DAY_OF_MONTH=14,DAY_OF_YEAR=74,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=8,HOUR_OF_DAY=20,MINUTE=50,SECOND=44,MILLISECOND=904,ZONE_OFFSET=25200000,DST_OFFSET=0]
		   + khả năng có rất nhiều thuộc tính: KHÔNG
		     --> chỉ sử dụng 1 hàm getter duy nhất để lấy thông tin của tất cả các thuộc tính 
		     VD: Item: id, name, price --> item.getId, item.getName, item.getPrice
		                               --> item.get(1), item.get(2), item.get(3)
		                               --> item.get(Item.PROP_ID), item.get(Item.PROP_NAME), item.get(Item.PROP_PRICE)  
		   
		 */
		Calendar c = Calendar.getInstance();
		System.out.println("calendar c --> " + c);
		
		System.out.println("\n===================\n");
		
		// Lấy thông tin ngày, tháng, năm
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		System.out.println("Ngày tháng năm: " + concat("-", dayOfMonth, month, year));
		
		// Lấy thông tin giờ, phút, giây
		int hour = c.get(Calendar.HOUR_OF_DAY); // HOUR_OF_DAY(clock 24) HOUR(clock 12)
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		System.out.println("\nGiờ phút giây: " + concat(":", hour, minute, second));
	}
	
	private static String concat(String delimiter, int...values) {
		String result = "";
		int length = values.length;
		for (int i = 0 ; i < length; i++) {
			result += values[i];
			if (i != length - 1) {
				result += delimiter;
			}
		}
		return result;
	}
	
}
