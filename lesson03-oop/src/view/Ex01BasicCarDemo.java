package view;

import bean.Car;

public class Ex01BasicCarDemo {
	
	public static void main(String[] args) {
		// class Car(id, model, color, salesPrice)
		
		// tạo ra 3 đối tượng cho class Car
		
		// Biến: 100% nằm ở STACK
		
		// Giá trị của biến KNT: STACK
		
		// Giá trị của biến KĐT: HEAP
		
		Car c1 = new Car("1", "MG5", "Yellow", 800d); // H1
		Car c2 = new Car("2", "Raize", "Orange", 540d); // H2
		Car c3 = new Car("3", "VF8", "Blue", 720d); // H3
		
		// cập nhật thông tin
		// c2.salesPrice = 560d;
		c2.setSalesPrice(560d);
		
		// lấy thông tin
		// System.out.println("C3 Model --> " + c3.model);
		System.out.println("C3 Model --> " + c3.getModel());
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
	}
	
}
