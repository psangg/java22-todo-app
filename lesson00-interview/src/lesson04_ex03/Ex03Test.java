package lesson04_ex03;

public class Ex03Test {
	
	public static void main(String[] args) {
		
		int n = 6;
		
		int[][] matrix = new int[n][n];
		
		for (int rowIndex = 0; rowIndex < n; rowIndex++) {
			for (int colIndex = 0; colIndex <= rowIndex; colIndex++) {
				if (colIndex == 0 || colIndex == rowIndex) {
					matrix[rowIndex][colIndex] = 1;
				} else {
					matrix[rowIndex][colIndex] = 
							matrix[rowIndex-1][colIndex-1] + matrix[rowIndex-1][colIndex];
				}
			}
		}
		
		System.out.println("==== Matrix ====");
		
		for (int rowIndex = 1; rowIndex < n; rowIndex++) {
			for (int colIndex = 0; colIndex <= rowIndex; colIndex++) {
				System.out.print(matrix[rowIndex][colIndex] + " ");
			}
			System.out.println();
		}
		
	}
	
}
