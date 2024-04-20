package string_demo;

public class Ex01StringDemo {
	
	// array.length
	// string.length()

	public static void main(String[] args) {
		String s = "welcome to k22 class";
		
		// Tính chiều dài của chuỗi s
		System.out.println("Tính chiều dài của chuỗi s --> " + s.length());
		
		// Nối chuỗi s1 vào chuỗi s
		String s1 = "11/04/2024";
		String s2 =  s.concat(" - ").concat(s1); // concatenate // s + " - " + s1;
		System.out.println("Nối chuỗi s1 và s --> " + s2);
		
		// Lấy một ký tự tại vị trí index(3) trong chuỗi s
		// index base = 0, kí tự đầu tiên tại vị trí 0, cuối cùng length() - 1
		System.out.println("Ký tự tại vị trí index = 3 --> " + s.charAt(3));
		
		// Tìm vị trí – chỉ số xuất hiện đầu tiên, cuối cùng của kí tự "e" trong chuỗi s
		System.out.println("Vị trí(chỉ số) bắt đầu của kí tự 'e' trong chuỗi s là --> " + s.indexOf("e"));
		System.out.println("Vị trí(chỉ số) cuối cùng của kí tự 'e' trong chuỗi s là --> " + s.lastIndexOf("e"));
		
		// Duyệt từng kí tự trong chuỗi, mỗi ký tự xong xuống hàng
		for (int i = 0; i < s.length(); i++) {
			System.out.println("Kí tự thứ " + i + ": " + s.charAt(i));
		}
		
		// Duyệt từng từ(các từ cách nhau bởi khoảng trắng) trong chuỗi, mỗi ký tự xong xuống hàng
		// Cắt chuỗi s thành các phần khác nhau, cắt bởi ký tự khoảng trắng
		String[] elements = s.split("\s"); // \s -> space => " "
		for (int i = 0; i < elements.length; i++) {
			System.out.println("Từ thứ " + i + ": " + elements[i]);
		}
		
	}

}
