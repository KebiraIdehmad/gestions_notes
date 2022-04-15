package gestions;



public class Main {

	public static void main(String[] args) {
		Etudiant e1,e2,e3 ;
		e1 = new Etudiant (1, "hamid" );
		e2 = new Etudiant (2, "driss") ;
		e3 = new Etudiant (1, "youssef") ;
		 // modification des notes
		e1.changerNote(15);
		e1.changerNote(16);
		e1.changerNote(12);
		ListEtudiants myList=new ListEtudiants();
		myList.add(e1); myList.add(e2); myList.add(e3);
		System.out.println(myList);
		System.out.println(e1.equals(e2));
		
		


   }
}