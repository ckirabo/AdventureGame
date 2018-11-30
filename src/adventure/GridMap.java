package adventure;

public class GridMap {
	
	/////////////Attributes/////////////
	
	//start off with fixed grid and then explore infinite columns
	
	int [][] gridLayout =  new int[7][7];
	

	///////////constructors////////////
	
	
	
	
	/////////////methods/////////////
	
	public int[][] getGridLayout() {
		return gridLayout;
	}
	
	
	 public int[][] createMap() {
			
			for(int a = 0; a < getGridLayout().length; a++) {
				for(int b = 0; b < getGridLayout()[a].length; b++) {
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
