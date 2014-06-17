package dhbw.horb.projekte.programmieren.farbenproblem;

import java.util.ArrayList;
import java.util.List;

public class Färber {
	private int anzahl;
	private List<Feld> felder = new ArrayList<Feld>();

	public Färber(int anzahl) {
		this.anzahl = anzahl;

	}

	// Erzeugen der Quadrate und einfärben aller Kästchen in der seben Farbe
	public void init() {
		for (int i = 0; i < anzahl; i++) {
			Feld quadrat = new Quadrat(i);
			quadrat.setFarbe(Farbe.BLAU);
			felder.add(quadrat);
		}
	}

	// Backtracking Algorithmus

	

}
