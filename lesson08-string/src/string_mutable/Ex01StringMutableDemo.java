package string_mutable;

import util.StringUtils;

public class Ex01StringMutableDemo {
	
	/*
	 Trong bài học xử lý chuỗi, 2 loại string
	 
	 string immutable
	 --> class String
	 -->       khai báo theo kiểu literal hoặc object
	 
	 string mutable
	 --> class StringBuilder, StringBuffer
	 --> cho phép cập nhật giá trị của ô nhớ tại HEAP sau khi khởi tạo
	 
	 Hướng dẫn cách code của StringBuilder, các hàm trong StringBuffer
	   100% y chang với StringBuilder
	 Phân biệt StringBuilder và StringBuffer sẽ tìm hiểu khi học xong phần
	 lập trình đa luồng: gửi video tham khảo
	 
	 Sử dụng String Immutable trong hầu hết các trường hợp
	 --> Để khai báo, xử lý, tính toán
	 
	 Sử dụng String Mutable khi gặp các bài toán liên quan đến cập nhật, cộng chuỗi nhiều lần
	 --> Immutable tốn bộ nhớ
	 --> Chuyển qua dùng Mutable
	 */
	
	public static void main(String[] args) {
		String s1 = "hello"; // H1
		StringUtils.print("s1 before", s1);
		
		String s2 = "teo";   // H2
		s1 = s1 + " " + s2;  // H3
		StringUtils.print("s1 after", s1);
		
		System.out.println("\n=========================\n");
		StringBuffer sb1 = new StringBuffer("goodbye"); // H4
		StringUtils.print("sb1 before", sb1);
		
		sb1.append(" ").append("nam"); // append --> cộng chuỗi
		sb1.deleteCharAt(0);
		StringUtils.print("sb1 after", sb1);
	}
	
}
