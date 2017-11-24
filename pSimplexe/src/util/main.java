package util;

import java.util.ArrayList;
import java.util.Scanner;

import exceptions.ContrainteDoublonListeException;
import modele.Matrice;

public class main {

	private static ArrayList a1,a2,a3;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Matrice m1=new Matrice();
		
		a1 = new ArrayList<Double>();
		a2 = new ArrayList<Double>();
		a3 = new ArrayList<Double>();
		
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("encodez la premiere contrainte");
		a1.add(sc.nextDouble());
		a1.add(sc.nextDouble());
		a1.add(sc.nextDouble());
		
		
		
		try {
			m1.ajouterLigne(a1);
		} catch (ContrainteDoublonListeException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		System.out.println(m1.toString());
		
		System.out.println("encodez la deuxieme contrainte");
		a2.add(sc.nextDouble());
		a2.add(sc.nextDouble());
		a2.add(sc.nextDouble());
		
		try {
			m1.ajouterLigne(a2);
		} catch (ContrainteDoublonListeException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		System.out.println(m1.toString());
		
		System.out.println("encodez la troisieme contrainte");
		a3.add(sc.nextDouble());
		a3.add(sc.nextDouble());
		a3.add(sc.nextDouble());
		
		try {
			m1.ajouterLigne(a3);
		} catch (ContrainteDoublonListeException e) {
			// TODO Auto-generated catch block
			e.getMessage();
		}
		System.out.println(m1.toString());
		//m1.getDonnees().add(Arrays.asList(8.0,5.0,3.0));
		
		
		
	}

}
