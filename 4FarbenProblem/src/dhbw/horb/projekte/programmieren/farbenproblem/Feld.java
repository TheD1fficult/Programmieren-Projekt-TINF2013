package dhbw.horb.projekte.programmieren.farbenproblem;

import java.util.ArrayList;
import java.util.List;

public abstract class Feld {
	
	private int id;
	private Farbe farbe;
	private List<Feld> nachbarn = new ArrayList<Feld>();
	
	public Feld(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public Farbe getFarbe() {
		return farbe;
	}
	public void setFarbe(Farbe farbe) {
		this.farbe = farbe;
	}
	public List<Feld> getNachbarn() {
		return nachbarn;
	}
	public void setNachbarn(List<Feld> nachbarn) {
		this.nachbarn = nachbarn;
	}
	
	

}
