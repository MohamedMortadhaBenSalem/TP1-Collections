package Ex2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class etudiant implements IStatisticable {
	String matricule;
	private String nom;
	private ArrayList<note> note;
	
	public etudiant (String matricule,String nom){
		super();
		this.matricule=matricule;
		this.nom=nom;
		note = new ArrayList<note>();
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	@Override
	public String toString() {
		return "etudiant [matricule=" + matricule + ", nom=" + nom + ", note" + note +"]";
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public ArrayList<note> getNote() {
		return note;
	}
	public void setNote(ArrayList<note> note) {
		this.note = note;
	}
	public void ajouterNote(note N){
		note.add(N);
	}
	@Override
	public double getAvg() {
		double S=0;
		for (note note : note){
			S=S+note.getNote();
		}
		
		return S/note.size();
	}
	@Override
	public double getMin() {
		double min=note.get(0).getNote();
		for(int i=0;i<note.size();i++){
			if (note.get(i).getNote()<min){
				min=note.get(i).getNote();
			}
		}
		
		return min;
	}
	@Override
	public double getMax() {
		double max=note.get(0).getNote();
		Iterator<note> i = note.iterator();
		while (i.hasNext()){
			note N=i.next();
			if (N.getNote()>max){
				max=N.getNote();
			}
		}
		return max;

	}
	
	@Override
	public int compareTo(etudiant e){
		return this.matricule.compareTo(e.matricule);
	}
	

}
