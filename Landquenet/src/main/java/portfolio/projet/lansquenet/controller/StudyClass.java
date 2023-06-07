package portfolio.projet.lansquenet.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.data.relational.core.sql.IsNull;

public class StudyClass {

	//list et essai des fonction
	
	private String chaine;
	private int table[];
	private static ArrayList<Integer> tabResult;
	
	public String getChaine() {
		return chaine;
	}

	public void setChaine(String chaine) {
		this.chaine = chaine;
	}

	public static void ParcTable(int table[]) {
		if (table.length==0) {
			 table= new int[]{1,2,3,5,5,78,96,30,74,78};
			
		}
		for(int i=0;table.length>i;i++) {
			//on multiplie par 5 comme essai de base
			int result=table[i]*5;
			System.out.println(result);
		}
	}
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
		ArrayList<T> newList=new ArrayList<T>();
		for(T element : list) {
			if(!newList.contains(element)) {
				newList.add(element);
			}
		}
		return newList;
	}
	public static void Multitable(int table[]) {
		if (table.length==0) {
			 table= new int[]{1,2,3,5,5,78,96,30,74,78};
			
		}
		ArrayList<Integer> tabResult=new ArrayList<>();
		int result ;
		for (int i=0;table.length>i;i++) {
			for(int j=0;table.length>j;j++) {
				result=table[i]+table[j];
				//System.out.println(result);
				tabResult.add(result);
			}
			ArrayList<Integer> finalresult=removeDuplicates(tabResult);
			System.out.println(finalresult);
		}
	}
	
}
