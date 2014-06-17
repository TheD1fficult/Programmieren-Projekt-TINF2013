package dhbw.horb.projekte.programmieren.farbenproblem;

import java.util.ArrayList;
import java.util.List;

public class F�rber {
	private int anzahl;
	private List<Feld> felder = new ArrayList<Feld>();

	public F�rber(int anzahl) {
		this.anzahl = anzahl;

	}

	// Erzeugen der Quadrate und einf�rben aller K�stchen in der seben Farbe
	public void init() {
		for (int i = 0; i < anzahl; i++) {
			Feld quadrat = new Quadrat(i);
			quadrat.setFarbe(Farbe.BLAU);
			felder.add(quadrat);
		}
	}

	// Backtracking Algorithmus

	

}
