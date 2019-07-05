package assessment;

import java.util.ArrayList;

public class MyMap {
	
	public MyMap() {
		
	}

	public ArrayList<Integer> itemLoc(){

		ArrayList<Integer> iLoc = new ArrayList<Integer>();
		
		//north
//		String nMap = "10";
//		iLoc.add(Integer.parseInt(nMap));
		Integer nMap = 10;
		iLoc.add(10);
		//south
		Integer sMap = 27;
		iLoc.add(27);
		//east
		Integer eMap = 15;
		iLoc.add(15);
		//west
		Integer wMap = 23;
		iLoc.add(23);
		
		return iLoc;
		
	}
	
}
