package assessment;

public class Distance {

	Player pLoc = new Player(1,3,6,5);
	
	MyMap tLoc = new MyMap();
	
	public int distanceLeft() {
		
		pLoc.getCurLoc();
		tLoc.itemLoc();
		
//		for (tLoc = .itemLoc)
		if(tLoc.equals(pLoc)) {
			//win
		}
		
		
		//change
		return 0;
	}
	
}
