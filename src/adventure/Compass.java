package adventure;

public class Compass {
	
	/*magic compass that tells the player how far away the next feature of interest is.
	this will use the navigate method in navigate
	*/
  
	 GridMap compassGrid = new GridMap(); // layout for a compassGrid
	
   
	
	public String showDistance() {
		String message = "\n" + "The dial reads : " + getDistance() ;
		return message;
	}
	
	public double getDistance() {
		// method to see how far away nearest object is. 
		return 0.0;
	}
	
	

	
	
	
	
	
}
