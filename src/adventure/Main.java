package adventure;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Player Player1 = new Player("Snake");	
		System.out.println(Player1.getName());
		
		Compass MagicCompas = new Compass();	
		System.out.println(MagicCompas.showDistance());
		
		// need to fix last line
		BasicMap swampLevel = new BasicMap();
		System.out.println(swampLevel.toString());
	}

}
