package gestions;

import java.util.ArrayList;
import java.util.List;





public class Etudiant implements Comparable<Etudiant> {
	private int id;
	private String nom;
	private double note;
	public Etudiant (int id,String nom) {
		this.id = id;
		this.nom = nom;
		this.note = 10;
	}
	public Etudiant (int id,String nom,double note) {
		this.id = id;
		this.nom = nom;
		this.note = note;
		
	}
	public String toString() {
		return "le nom : "+this.nom+" ; la note : "+this.note;
	}
	public boolean equals(Object obj) {
		if (! (obj instanceof Etudiant) ){
			return false;
		}
	return	((Etudiant)obj).id==this.id ;
	}
	@Override
	public int compareTo(Etudiant o) {
		
		if(this.note==o.note) return 0;
		if(this.note>o.note) return 1;
		return -1;
	}
	public void changerNote (int note) {
		 this.note = note;
		 System.out.println(" la note del'objet apres la modification est"+note);
	}
	
	
	
	
		
		
	}

