package fr.paul.User;

public class Input {
	
	private Menu menu = new Menu();
	
	public Menu getMenu() {
		return menu;
	}
	
	public void displayMenu() {
		getMenu().createMenu();
	}
}
