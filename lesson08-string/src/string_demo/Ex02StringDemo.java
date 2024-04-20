package string_demo;

import java.util.Arrays;

public class Ex02StringDemo {
	
	public static void main(String[] args) {
		String s = "welcome to java22 class";
		String s1 = "we";
		
		// Kiểm tra chuỗi s1 có phải là chuỗi bắt đầu || kết thúc trong chuỗi s không.
		System.out.println("Kiểm tra chuỗi s1 có phải là bắt đầu của s hay không --> " + s.startsWith(s1));
		System.out.println("Kiểm tra chuỗi s1 có phải là kết thúc của s hay không --> " + s.endsWith(s1));
		
		// Thay thế chuỗi s1 bằng chuỗi s2 trong chuỗi s
		String s2 = "We";
		s = s.replace(s1, s2).replace("j", "J");
		System.out.println("Thay thế s1 bằng s2 trong s --> " + s);
		
		// Loại bỏ các khoảng trắng thừa của chuỗi s3
		// Các từ thường các nhau bởi 1 khoảng trắng, và ko có khoảng trắng 2 đầu
		// -- khi user nhập vào bị thừa --> thay thế để đảm bảo
		
		// \s --> đại diện khoảng trắng - space
		// \\s --> java hiểu \ là 1 kí tự đặc biệt --> \\ --> \
		// \\s --> \s
		// regex --> {n} --> yêu cầu n ký tự 
		//       --> {n, m} --> yêu cầu số ký tự từ m đến n inclusive
		//       --> {n,}   --> yêu cầu số ký tự từ n đến dương vô cùng
		//       --> {1,} = + --> yêu cầu số ký tự từ 1 trở đi
		// VD: s = "aaaaa";
		//     s.replace("a+", "a");
		
		
		s = "       Welcome     to    Java22     class            ";
		s = s.strip().replaceAll("\\s{1,}", " ");
		System.out.println("Chuỗi s mới --> |||" + s + "|||");
		
		s = "aaaaaa";
		s = s.replaceAll("a+", "A");
		System.out.println("Thao tác với string regex 01 --> " + s);
		
		// Viết chương trình loại bỏ các kí tự trùng nhau
		// Các phần tử trùng nhau chỉ lấy 1 kí tự --> UNIQUE
		s = "aaabb";
		// s = s.replaceAll("a+", "A")
		// 	    .replaceAll("b+", "B");	
		
		// [a,b]+ --> Một hoặc nhiều kí tự a hoặc b hoặc ab hoặc ba --> thỏa mãn điều kiện
		// a --> ok
		// aa --> ok
		// b --> ok
		// bbbbb-> ok
		// ab --> ok
		// ba --> ok
		// aaabb --> ok
		s = "aaa15bazkt202xxbb999";
		// s = s.replaceAll("[a,b]+", "-");
		// String[] sa = s.split("[a,b]+");
		String[] sa = s.split("[a-z]+"); // [a-z] --> tập hợp các kí tự nằm trong khoảng a-z, k quan tâm đến vị trí
		System.out.println("Thao tác với string regex 02 --> " + Arrays.toString(sa));        
		
		// Kiểm tra xem SĐT có hợp lệ hay không
		// + Tất cả phải kí tự số
		// + Số lượng từ 10 đến 11
		// + Các nhà đài yêu cầu các kí tự đầu tiên là mấy
		//   --> (034),  (037)
		//   --> (0122), (0125)
		
		// Kiểm tra 1 file upload lên có phải là file hình ảnh không
		// Trước hết là 1 file ko phải là folder
		// Đuôi file phải kết thúc bằng
		// --> jpg, jpeg, png, gif ...
		
		// Tạo chuỗi con của chuỗi s bắt đầu từ vị trí số 2 --> bài toán cắt chuỗi
		s = "Welcome to Java22 class";
		String s3 = s.substring(0); // [0, s.length)
		System.out.println("Bài toán cắt chuỗi 01 --> " + s3);
		
		s3 = s.substring(0, s.length()-1); // [0, s.length - 1)
		System.out.println("Bài toán cắt chuỗi 02 --> " + s3);
		
		// Xác định chuỗi s2 có tồn tại trong chuỗi s1 hay không
		System.out.println("Kiểm tra tồn tại --> " + s.toLowerCase().contains("java"));
		
		// Phân biệt StringBuilder và StringBuffer
		// --> Video
	}
	
}
