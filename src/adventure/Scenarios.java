package adventure;

public class Scenarios {

	
	
	public String startMission() {
		String firstText = "You awaken to find yourself in an foggy swamp. Enter LOOK for more";	
		return firstText;
	}
	
	public String partTwo() {
		String secondLine = "Unknown to what lies in either direction you decide your fate";
		return secondLine;
	}
	
	public String prelude(String look) {
	
		if ( look.contentEquals("look")) {
			return partTwo().toString();
		}
		return "Please return the word Look";
	}
	
}
