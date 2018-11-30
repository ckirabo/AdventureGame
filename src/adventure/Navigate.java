package adventure;

public class Navigate {
	
	//////////////Attributes////////////////
	
	
	
    ////////////Constructors//////////////
	
	
	
	//////////Methods////////////////////
	
	public void moveDirection(String direction) {
		if(direction.contentEquals("north")) {
			//move player one step forward
			
			//System.out.println();
		}
		
		else if(direction.contentEquals("east")) {
			//move player one step to the right
		}
		
		else if(direction.contentEquals("south")) {
			//move player one step backwards
		}
		else if(direction.contentEquals("west")) {
			//move player one step to the left
		}
		
		else{
			//do nothing .. wait for the player to decide what to do 
		}
	}
	
	
	

}
