package string_immutable;

import static util.StringUtils.*;

public class Ex02StringImmutableExplain {

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
		
		System.out.println("\n============= Cập nhật ===============\n");
		
		// Kiểm tra trên HEAP, constant pool xem thử 
		// có ô nhớ nào mang giá trị "table" chưa
		// Nếu chưa có --> tạo ô nhớ mới, gán địa chỉ ô nhớ đó cho biến l2
		// Nếu có rồi --> lấy địa chỉ đó gán cho biến l2
		
		l2 = "table";
		l2 = "goodbye";
		print("l2", l2);
		
		System.out.println("\n============= Gán lại giá trị ==============\n");
		
		String s1 = "cooking"; // H77
		String s2 = "cooking"; // H77
		
		print("s1", s1);
		print("s2", s2);
		
		s1 = "broken";
		
		print("s1", s1);
		print("s2", s2);
		
		// immutable: giá trị của ô nhớ ở HEAP ko được phép thay đổi sau khi khởi tạo
		// string constant pool: là vùng nhớ ở HEAP tại đó các ô nhớ trong constant pool không được phép trùng nhau
	}

}
