package assessment;

import java.util.ArrayList;

public class Player {

	//to get array from another class, not used, reference only
//	MyMap getLoc = new MyMap.iLoc;
	
	//player start location
//	Random pSrt = new Random();
//	int[] pStr = {2,4,5,1};
//	int n = pStr[1];
//	int e = pStr[2];
//	int s = pStr[3];
//	int w = pStr[4];
	
	//constructor
	public Player(int n, int s, int e, int w) {
		
	}
	
	int n;
	int e;
	int s;
	int w;
	
	//to get as a an array list to match
	public ArrayList<Integer> getPlyrLoc() {
		ArrayList<Integer> pLoc = new ArrayList<>();
		pLoc.add(n);
		pLoc.add(s);
		pLoc.add(e);
		pLoc.add(w);
			
		return pLoc;
	}
	
	//in case arrays aint working out
	public int[] getCurLoc() {
		int[] currLoc = {n,e,s,w};
	
		return currLoc;
	}
	
	public int moveNorth() {	
		int moveN = n++;
		int backS = s--;
		
		return moveN + backS;
	}
	
	public int moveSouth() {	
		int moveS = s++;
		int backN = n--;
		
		return moveS + backN;
	}	
	
	public int moveEast() {	
		int moveE = e++;
		int backW = w--;
		
		return moveE + backW;
	}	
	
	public int moveWest() {	
		int moveW = w++;
		int backE = e--;
		
		return moveW + backE;
	}
	
}

