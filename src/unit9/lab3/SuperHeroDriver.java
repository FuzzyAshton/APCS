package unit9.lab3;

import java.util.ArrayList;

public class SuperHeroDriver {
	public static void main(String[] args) {
		AsteroidMan boom = new AsteroidMan();
		boom.setSuitColor("Not gray");
		boom.setCape(false);
		FriedEggMan sunny = new FriedEggMan();
		sunny.setSuitColor("Yellow");
		sunny.setCape(true);
		CheesyMan team254 = new CheesyMan();
		team254.setSuitColor("Blue");
		team254.setCape(true);
		ArrayList<SuperHero> heros = new ArrayList<SuperHero>();
		heros.add(boom);
		heros.add(sunny);
		heros.add(team254);
		for (SuperHero e: heros) {
			System.out.println("Suit color: " + e.getSuitColor() + "\nHas a cape: " + e.isCaped() + "\nMotto: " + e.motto());
		}
		SuperHero[][] capedHeros = new SuperHero[3][3];
		int heroCount = 0;
		for (int i = 0; i < capedHeros.length; i++) {
			for (int j = 0; j < capedHeros[i].length; j++) {
				if (heroCount < heros.size()) {
					if (heros.get(heroCount).isCaped()) {
						capedHeros[i][j] = heros.remove(heroCount);
					}
				}
				else {
					capedHeros[i][j] = null;
					heroCount++;
				}
			}
		}
		for (SuperHero[] list: capedHeros) {
			for (SuperHero e: list) {
				if (e != null) {
					System.out.println("Suit color: " + e.getSuitColor() + "\nCaped: " + e.isCaped() + "\nMotto: " + e.motto());
				}
				else {
					System.out.println("Null");
				}
			}
		}
	}
}