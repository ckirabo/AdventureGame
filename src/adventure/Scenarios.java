package adventure;

import java.util.ArrayList;
import java.util.Random;

public class Scenarios {

	
	
	public String startMission() {
		String firstText = "You awaken to find yourself in an foggy swamp. Enter LOOK for more";	
		return firstText;
	}
	
	public String enterLook(String look) {
		
		if ( look.contentEquals("look")) {
			return partTwo().toString();
		}
		return "Please return the word Look";
	}
	
	public String partTwo() {
		String secondLine = "Unknown to what lies in either direction you decide your fate.";
		String compasssDialogue = "You notice a small watch-like object in your pocket, it "
			                    	+ " appears to be a compass.";
		String direction = "Choose either : North , East , South , West";
		return  secondLine + "\n" + 
	        	compasssDialogue + "\n" 
		        + direction;
	}
	
    

	public String chooseDirection(String direction) {
		
		if (direction.contentEquals("north")) {
	
			return randomObjectGenerator();
			
		}
		else if (direction.contentEquals("east")) {
		
			return randomObjectGenerator();
			
		}
		else if (direction.contentEquals("south")) {

			return randomObjectGenerator();
			
		}
		else if (direction.contentEquals("west")) {

			return randomObjectGenerator();
			
		}
		else if (direction.contentEquals("exit")) {

			return "Game Over";
			
		}
		
		
		return " ";
		
		
	}
	
	 public String randomObjectGenerator() {
			
			String tree = "You have approached a tree, great! theres nothing here...";
			String apple = "Congratulations! You've found an apple. You throw it away because its rotten";
			String box =  "You discover a box, its filled with dirt";
			String boat = "You discover a boat! With this you escape the swamp. You Win! The End." + 
			               "\n" + 
					       "Enter exit to leave the game";
			String nothing = "An eery fog thickens";
			
			ArrayList<String> pointsOfInterest = new ArrayList<String>(); 
			pointsOfInterest.add(tree);
			pointsOfInterest.add(apple);
			pointsOfInterest.add(box);
			pointsOfInterest.add(boat);
			pointsOfInterest.add(nothing);
			
			
			for(int i = 0; i < pointsOfInterest.size(); i++) {		
				int r = new Random().nextInt(pointsOfInterest.size());
				return pointsOfInterest.get(r);
			}
			
			return "A dense fog appears";
		}
		
		
	
	
	
}
