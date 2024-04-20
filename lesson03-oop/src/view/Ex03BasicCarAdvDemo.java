package view;

import bean.CarAdv;

public class Ex03BasicCarAdvDemo {
	
	static int a = 5;
	int b = 10;
	
	public static void main(String[] args) {
		
		System.out.println("a --> " + Ex03BasicCarAdvDemo.a);
		// System.out.println("b --> " + Ex03BasicCarAdvDemo.b);
		
		Ex03BasicCarAdvDemo ex03 = new Ex03BasicCarAdvDemo(); // H1
		System.out.println("ex03 b --> " + ex03.b);
		System.out.println("ex03 a --> " + ex03.a);
		
		/*
		 
		 Thuộc tính
		 
		 + static:
		   --> class gọi được không ? ĐƯỢC
		   --> object gọi được không ? ĐƯỢC (KO NÊN - WARNING)
		       WARNING: lấy 1 đối tượng set giá trị nhưng mà lại ăn chung cho tất cả
		 
		 non-static
		   --> class gọi được không ? KHÔNG(khi nào khởi tạo đối tượng thì mới có thông tin cho tt non-static)
		       lấy class gọi thì ko biết đang gọi cho đối tượng nào
		   --> object gọi được không ? ĐƯỢC
		 */
		
		
		// 1. Tạo ra 1000 mẫu xe Audi với màu sắc khác nhau
		// Tạo ra 10(demo)
		// model(static)
		
		// thuộc tính static ăn chung cho tất cả đối tượng
		// hàm khởi tạo ko nên truyền giá trị cho tt static
		
		CarAdv.model = "Audi";
		
		CarAdv c01 = new CarAdv("01", "Yellow", 800d); // H1
		CarAdv c02 = new CarAdv("02", "Red", 700d);    // H2
		CarAdv c03 = new CarAdv("03", "Blue", 600d);   // H3
		CarAdv c04 = new CarAdv("04", "Green", 800d);  // H4
		CarAdv c05 = new CarAdv("05", "White", 500d);  // H5
		CarAdv c0k = new CarAdv("0k", "Orange", 200d); // H6
		CarAdv c10 = new CarAdv("10", "Violet", 800d); // H7
		
		// ko nên set static theo cách này
		// c01.setModel("Audi");
		
		
		System.out.println("C01 --> " + c01);
		System.out.println("C05 --> " + c05);
		
		// 2. Chuyển đổi tên hãng xe từ Audi sang MG
		System.out.println("\n--- Chuyển đổi tên hãng xe ---\n");
		
		CarAdv.model = "MG";
		
		// cập nhật cho tất cả các đối tượng, nhìn code dễ hiểu nhầm chỉ cập nhật
		// cho c04
		
		// c04.setModel("MG");
		
		// c02.setModel("MG");
		// c03.setModel("MG");
		// c04.setModel("MG");
		// c05.setModel("MG");
		// c0k.setModel("MG");
		// c10.setModel("MG");
		
		System.out.println("C01 --> " + c01);
		System.out.println("C05 --> " + c05);
		
	}
	
}
