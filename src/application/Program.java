package application;

import java.util.Set;
import java.util.TreeSet;

public class Program {

	public static void main(String[] args) {

		Set<String> set = new TreeSet<>();
		set.add("Tv");
		set.add("Notebook");
		set.add("Tablet");
		System.out.println(set.contains("Notebook")); // testa se existe retorna booleano
			for (String p : set) {
				System.out.println(p);
		}

	}

}
