package fr.paul.User;

public class Input {
	
	private String question = "Que voulez vous faire ?";
	private Menu menu = new Menu();
	
	public String getQuestion() {
		return question;
	}
	
	public Menu getMenu() {
		return menu;
	}
	
	public void displayMenu() {
		getMenu().createMenu();
	}
}
