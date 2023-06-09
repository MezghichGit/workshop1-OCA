package model;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("Donner un nom");
		String nom = sc.nextLine();
		
		System.out.println("Donner l'age");
		int age = sc.nextInt();
		
		System.out.println("Donner la moyenne");
		double moy = sc.nextDouble(); // 15.5 espace
		sc.nextLine(); //consommation du caractère espace
		System.out.println("Donner l'adresse");
		String adresse = sc.nextLine();
		
		Etudiant e1 = new Etudiant(nom,age,moy,adresse);
		e1.info();*/
		
		/*Etudiant e2 = new Etudiant();
		e1.info();
		e2.info();*/
		
		Etudiant e2 = new Etudiant();
		e2.setNom("abcabcabc");
		e2.setAge(24);
		e2.setMoyenne(15.5);
		e2.info();
	}

}
