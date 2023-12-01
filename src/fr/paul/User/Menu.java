package fr.paul.User;

public class Menu {

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
		
		for(int i=0; i<menuOptions.length; i++) {
			System.out.println((i+1) + "- " + menuOptions[i] + " une tache");
		}
	}
}
