package gestions;

import java.util.ArrayList;

public class ListEtudiants extends ArrayList<Etudiant> {
	
	@Override
	public boolean add(Etudiant e) {
		if(this.contains(e)) return false;
		return super.add(e);
		
	}
	public interface conditon {
		
		public boolean estVrai(Etudiant e) {
			
		}
		public List<Etudiant> filtrer(Condition c)
		
	}

}
