package adventure;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Name : ");
		
		String name = sc.nextLine();
		Player Player1 = new Player(name);	
		System.out.println("Player Name: " + Player1.getName());
		
		runScript(sc);
		
		
		
	}
	
	public static void runScript(Scanner sc) {
		Scenarios script = new Scenarios();
		System.out.println(script.startMission());

		
		String command = sc.nextLine();
		
		if(command.contentEquals("look")) {
		System.out.println(script.enterLook(command));
		}
		else {
			System.out.println(script.enterLook(command));
			
		}
		
		
		
		String direction = sc.nextLine();
		System.out.println(script.chooseDirection(direction));
		
	
	
		while(direction != null) {
			String newDirection = sc.nextLine();
			//return distance??
				 
			if(direction.contentEquals("exit")) {
				break;
			} 
			else {
				System.out.println(script.chooseDirection(newDirection));
			}
			
	       	
		}
		
		
	}
	
	
	
}
	



