package application;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new LinkedHashSet<>();// mantem a ordem inserida
		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");
		
		set.remove("Tablet");
		
		System.out.println(set.contains("Notebook")); // testa se existe retorna booleano
			for (String p : set) {
				System.out.println(p);
		}

	}

}
