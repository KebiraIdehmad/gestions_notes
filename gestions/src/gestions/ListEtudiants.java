package gestions;

import java.util.ArrayList;
import java.util.List;

public class ListEtudiants extends ArrayList<Etudiant> implements Condition {
	
	@Override
	public boolean add(Etudiant e) {
		if(this.contains(e)) return false;
		return super.add(e);
		
	}

	

}
