package string_immutable;

import static util.StringUtils.*;

public class Ex01BasicDemo {
	
	/*
	 
	 Với KDL String mình sẽ có 2 cách khai báo, khởi tạo giá trị
	 
	 Cách 1: string literal
	 		 --> String var_name = "value";
	 		 --> giá trị sẽ được lưu trữ tại vùng nhớ HEAP -> string constant pool
	 		 --> string constant pool: nơi lưu trữ những giá trị string ko trùng nhau
	 
	 Cách 2: string object
	         --> String var_name = new String("value");
	         --> giá trị sẽ được lưu trữ tại vùng nhớ HEAP
	 
	 */
	
	public static void main(String[] args) {
		// string literal
		String l1 = "hello";    // H1
		String l2 = "language"; // H2
		String l3 = "hello";    // H1
		String l4 = "goodbye";  // H4
		
		print("l1", l1);
		print("l2", l2);
		print("l3", l3);
		print("l4", l4);
		
		System.out.println("\n========================\n");
		
		// string object
		String o1 = new String("xin chao"); // H11
		String o2 = new String("ngon ngu"); // H12
		String o3 = new String("xin chao"); // H13
		String o4 = new String("tam biet"); // H14
		
		print("o1", o1);
		print("o2", o2);
		print("o3", o3);
		print("o4", o4);
		
		// Giải lập, tạo ra 1000 biến string có giá trị là "xin chao"
		
		// Nếu dùng
		
		// string object  --> 1000 ở HEAP, 1000 ở STACK --> 2000
		// string literal --> 1    ở HEAP, 1000 ở STACk --> 1001
		
		// --> string literal --> tiết kiệm vùng nhớ, thời gian khởi tạo hơn
		// --> 100% string literal
		
	}
	
}
