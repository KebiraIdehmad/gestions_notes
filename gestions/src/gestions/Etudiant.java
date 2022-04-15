package gestions;

import java.util.ArrayList;


public class Etudiant implements Comparable<Etudiant> {
	private int id;
	private String nom;
	private double note;
	public Etudiant (id,nom) {
		this.id = id;
		this.nom = nom;
		this.note = 10;
	}
}	