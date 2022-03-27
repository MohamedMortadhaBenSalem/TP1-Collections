package Ex2;

import java.util.ArrayList;

public class note {
	private String NomCours;
	private double note;
	
	public note(String nomCours, double note){
		super();
		this.NomCours=nomCours;
		this.note=note;
	}

	@Override
	public String toString() {
		return " NumCours=" + NomCours + ", note=" + note + "]";
	}

	public String getNumCours() {
		return NomCours;
	}

	public void setNumCours(String nomCours) {
		NomCours = nomCours;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}
}
