package fr.paul.User;

import java.util.Scanner;

public class Menu {

	private Scanner sc = new Scanner(System.in);
	private String question = "Que voulez vous faire: ";
	private String[] choise = new String[] 
	{
		"Ajouter",
		"Modifier",
		"Supprimer"
	};


	public String[] getChoise() {
		return choise;
	}
	
	public void createMenu() {
		String[] menuOptions = getChoise();
		
		while(true) {
			int choise;

			for (int i = 0; i < menuOptions.length; i++) {
				System.out.println("----------------------------------------");
				System.out.printf("| %-2s - %-31s |\n", (i + 1), menuOptions[i] + " une tache");
			}
			System.out.println("----------------------------------------");

			System.out.print(question);

			if (sc.hasNextInt()) {
				choise = sc.nextInt();

				if (choise > menuOptions.length || choise <= 0) {
					System.out.println("Veulliez entrer un chiffre entre 1 et " + menuOptions.length);
					sc.nextLine();
					continue;
				}
			} else {
				System.out.println("La saisie n'est pas un entier !");
				sc.nextLine();
				continue;
			}
		}
	}
}
