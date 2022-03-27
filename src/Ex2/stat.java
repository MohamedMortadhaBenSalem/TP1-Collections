package Ex2;

import java.util.ArrayList;
import java.util.Collections;

public class stat {
	private ArrayList<etudiant> listeEtudiants = new ArrayList<etudiant>();
		public stat(){
			this.listeEtudiants=new ArrayList<etudiant>();
		}
		public void lister() {
			for (etudiant eleve : listeEtudiants) {
				System.out.println(eleve);
			}
		}
		public void ajouterEleve(etudiant eleve) {
			listeEtudiants.add(eleve);
		}
		public void trierEtudiants() {
			Collections.sort(listeEtudiants);
		}

}
