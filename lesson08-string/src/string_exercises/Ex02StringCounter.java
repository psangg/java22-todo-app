package string_exercises;

import java.util.Arrays;

public class Ex02StringCounter {
	
	/*
	 
	Cho dãy kí tự trong chuỗi s cách nhau bởi ","
	String s = "a,b,c,a,a,e,f,e,b";

	Viết chương trình in ra các kí tự xuất hiện 1 lần duy nhất trong chuỗi s
	Kết quả: c,f

	Viết chương trình in ra kết quả số lần xuất hiện của mỗi kí tự trong chuỗi s
	Kết quả: {a,3}, {b,2}, {c,1}, {e, 2}, {f, 1}
	
	Các dạng hay hỏi với String, Array
	1. In ra các phần tử xuất hiện 1 lần duy nhất   aab --> b
	2. In ra các phần tử xuất hiện nhiều hơn 1 lần  aab --> a
	3. Loại bỏ các phần tử trùng nhau aab --> b
	4. Loại bỏ các phần tử trùng nhau, các phần tử trùng nhau chỉ lấy 1 kí tự aab --> ab
	 
	*/
	
	public static void main(String[] args) {
		String s = "a,b,c,a,a,e,x,e,b";
		
		// Viết chương trình in ra các kí tự xuất hiện 1 lần duy nhất trong chuỗi s
		// Kết quả: c, x
		
		// elements: a b c a a e x e b
		// flags   : f f f f f f f f f
		
		String[] elements = s.split(",");
		boolean[] flags = new boolean[elements.length];
		String[] result = new String[elements.length];
		
		int counter = 0;
		for (int i = 0; i < elements.length; i++) {
			if (!flags[i]) {
				int dupCounter = 0;
				for (int j = i+1; j < elements.length; j++) {
					if(elements[i].equals(elements[j])) {
						flags[j] = true;
						dupCounter++;
					}
				}
				if (dupCounter != 0) {
					flags[i] = true;
				} else {
					result[counter++] = elements[i];
				}
			}
		}
		
		System.out.println("flags --> " + Arrays.toString(flags));
		System.out.println("result --> " + Arrays.toString(Arrays.copyOfRange(result, 0, counter)));
		
		
	}
	
}
