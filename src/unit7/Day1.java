package unit7;

public class Day1 {
	public static void main(String[] args) {
		int[][] arr1 = new int[3][4];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = i + j;
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
	}
}
