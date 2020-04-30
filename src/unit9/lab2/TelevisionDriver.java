package unit9.lab2;

import java.util.ArrayList;

public class TelevisionDriver {
	public static void main (String[] args) {
		ArrayList<Television> tvs = new ArrayList<Television>();
		tvs.add(new DLP());
		tvs.add(new LCD());
		tvs.add(new LED());
		tvs.add(new Plasma());
		for (Television e: tvs) {
			System.out.println(e);
		}
	}
}