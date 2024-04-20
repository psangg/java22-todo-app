package view;

public class Ex05StaticNonStatic_LoadingTime {
	
	/*
	 Attribute, Method
	 
	 + Static: Class, Object(Warning)
	 
	 + Non-Static: Object
	 
	 
	 // Compile, Runtime
	 
	 // Runtime(
	  *  Static(khởi tạo ra cho class khi running, load chương trình) --> 
	  *  Non-Static(chỉ thật sự được khởi tạo khi khởi tạo đối tượng))
	 */
	
	// Khởi tạo khi chạy chương trình lên
	private static String staticVariable;
	
	// Thật sự được khởi tạo khi tạo ra 1 đối tượng từ class hiện tại
	private String nonStaticVariable;
	
	public static void main(String[] args) {
		Ex05StaticNonStatic_LoadingTime o1 = new Ex05StaticNonStatic_LoadingTime();
		o1.nonStaticMethod();
	}
	
	// Khởi tạo khi chạy chương trình lên
	private static void staticMethod() {
		System.out.println("PRINT - STATIC METHOD");
		
		staticVariable = "static";
		
		// error: ko thể gọi biến, hàm non-static trong hàm static
		// vì hàm static khởi tạo trước, giả sử lấy class gọi hàm static
		// lúc đó biến, hàm static được gọi bên trong ko biết của đối tượng nào --> lỗi
		
		// nonStaticVariable = "none";
		// nonStaticMethod();
	}
	
	// Thật sự được khởi tạo khi tạo ra 1 đối tượng từ class hiện tại
	private void nonStaticMethod() {
		System.out.println("PRINT - NON STATIC METHOD");
		
		nonStaticVariable = "none";
		
		// để gọi được hàm non static, thì phải có 1 đối tượng gọi hàm
		// lúc đối tượng gọi hàm, trước đó class đã khởi tạo rồi
		// --> hàm, biến static đã có rồi
		// --> gọi hàm, biến static bên trong non-static
		
		staticVariable = "static";
		staticMethod();
	}
	
}
