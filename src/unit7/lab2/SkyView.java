package unit7.lab2;

public class SkyView {
	private double[][] view;
	public SkyView(int numRows, int numCols, double[] scanned) {
		view = new double[numRows][numCols];
		int counter = 0;
		for (int i = 0; i < view.length; i++) {
			if (i % 2 == 0) {
				// Go left to right
				for (int j = 0; j < view[i].length; j++) {
					view[i][j] = scanned[counter];
					counter++;
				}
			}
			// Go right to left
			else {
				for (int k = view[i].length - 1; k >= 0; k--) {
					view[i][k] = scanned[counter];
					counter++;
				}
			}
		}
	}

	public void print() {
		for (int i = 0; i < view.length; i++) {
			for (int j = 0; j < view[i].length; j++) {
				System.out.print(view[i][j] + " ");
			}
			System.out.println();
		}
	}

	public double getAverage(int startRow, int endRow, int startCol, int endCol) {
		double sum = 0;
		double counter = 0;
		for (int i = startRow; i <= endRow; i++) {
			for (int j = startCol; j <= endCol; j++) {
				sum += view[i][j];
				counter++;
			}
		}
		return sum / counter;
	}
}