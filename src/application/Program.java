package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Usuario;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		
		Set<Usuario> set = new HashSet<>();
		
		System.out.print("How many students in couse A: ");
		int qty = sc.nextInt();
		for(int i=0; i<qty;i++) {
			int mat = sc.nextInt();
			set.add(new Usuario(mat));
		}
		
		System.out.println();
		
		System.out.print("How many students in couse B: ");
		qty = sc.nextInt();
		for(int i=0; i<qty;i++) {
			int mat = sc.nextInt();
			set.add(new Usuario(mat));
		}
		
		System.out.println();
		
		System.out.print("How many students in couse c: ");
		qty = sc.nextInt();
		for(int i=0; i<qty;i++) {
			int mat = sc.nextInt();
			set.add(new Usuario(mat));
		}
		
		System.out.println();
		
		System.out.print("Total Users: "+ set.size());
		
		sc.close();
	}

}
