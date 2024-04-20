package view;

import bean.Item;

public class Ex06Test {
	
	public static void main(String[] args) {
		int a = 5;
		final int b = 7;
		
		a = 10;
		// b = a;
		
		final Item item1 = new Item(1, "Item 1"); // H1
		Item item2 = new Item(2, "Item 2"); // H2
		
		item1.setId(11);
		// item1 = item2; //item1(H2) item2(H2)
		item2 = new Item(); // item2(H3)
	}
	
}
