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
		
		Scenarios script = new Scenarios();
	
		System.out.println(script.startMission());
		
		String command = sc.nextLine();
		System.out.println(script.prelude(command));
		
		
		
		
		
		
	//	Compass MagicCompas = new Compass();	
	//	System.out.println(MagicCompas.showDistance());
		
		
	//	GridMap compassGrid = new GridMap();
	//	compassGrid.createMap();
		
		
		
		
		
	}

}
