package fr.paul;

import fr.paul.User.Input;

public class App {

	public static void main(String[] args) {
		
		Input input = new Input();
		
		boolean app = true;
		
		while(app) {
			input.displayMenu();
			break;
		}
	}
}
