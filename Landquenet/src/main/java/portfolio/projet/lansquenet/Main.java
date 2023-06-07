package portfolio.projet.lansquenet;

import portfolio.projet.lansquenet.controller.StudyClass;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int table[]= new int[] {4,5,9,65,25,15,48,75,35,12};
		StudyClass.ParcTable(table);
		System.out.println("-------");
		StudyClass.Multitable(table);
	}

}
