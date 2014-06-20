package dhbw.horb.projekte.programmieren.farbenproblem.logik;

import java.util.ArrayList;
import java.util.List;

public abstract class Field {
	private Id id = new Id();
	private Color color;
	private List<Field> neighbor = new ArrayList<Field>();

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public List<Field> getNeighbor() {
		return neighbor;
	}

	public void addNeighbor(Field neighbor) {
		if (this.neighbor.contains(neighbor)) {
			this.neighbor.add(neighbor);
		}
	}

	public Id getId() {
		return id;
	}

}
