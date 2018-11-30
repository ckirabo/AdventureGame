package adventure;

public class GridMap {
	
	/////////////Attributes/////////////
	
	//layout for compass
	
	int [][] gridLayout =  new int[3][3];
	

	
	
	/////////////methods/////////////
	
	 public int[][] createMap() {
			
			for(int a = 0; a < gridLayout.length; a++) {
				for(int b = 0; b < gridLayout[a].length; b++) {
					 System.out.print("[ ]");
				}
				 System.out.println();
			}
			
			return gridLayout;
			
	 }
	
	 public String toString() {
		return createMap().toString();	 
	 }

}
