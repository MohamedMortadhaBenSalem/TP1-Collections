package Ex2;


public class test {

	public static void main(String[] args) {
		stat groupe = new stat();	
		etudiant e1 = new etudiant("ben salem","mortadha");
		etudiant e2 = new etudiant("cherif","mohamed");
		note n1=new note("cours", 18);
		note n2=new note("TP", 14);
		note n3=new note("Examen", 10);
		e1.ajouterNote(n1);
		e1.ajouterNote(n2);
		e1.ajouterNote(n3);
		System.out.println(e1);
		System.out.println("Moyenne:" +e1.getAvg());
		System.out.println("Min:" +e1.getMin());
		System.out.println("Max:" +e1.getMax());
		note n4=new note("cours", 12);
		note n5=new note("TP", 10);
		note n6=new note("Examen", 12);
		e2.ajouterNote(n4);
		e2.ajouterNote(n5);
		e2.ajouterNote(n6);
		System.out.println(e1.compareTo(e2));		
		groupe.ajouterEleve(e1);
		groupe.ajouterEleve(e2);
		groupe.lister();
		groupe.listeEtudiants();



	}

}
