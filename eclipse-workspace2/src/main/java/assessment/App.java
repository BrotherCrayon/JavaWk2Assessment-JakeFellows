package assessment;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		//start location
		Player pStart = new Player(1,3,6,5);
		
		//treasure location on map
		MyMap tLocation = new MyMap();
//		tLocation.itemLoc().add(10);
		tLocation.itemLoc();
		
		//move player
		Scanner pMove = new Scanner(System.in);
		
		String north, south, east, west;
		
		//get distance class working and put here
		//player distance to target - move to separate class and call method
//		if (pStart.getCurLoc() == tLocation.itemLoc()) {
			//calc distance percentage, seperatre for north/south & east/west
//		}
		
		System.out.println(pStart.getCurLoc());
		System.out.println(pStart.getPlyrLoc());
		
		boolean gotTreasure = false;
		while (gotTreasure != true ){
			
			System.out.println("Game Starts here! Find the target;");
			System.out.println("Move by typing n (North), s (south), e (east), w (west) into  yout keyboard: ");
			north = pMove.next();
			south = pMove.next();
			east = pMove.next();
			west = pMove.next();
			if (north.equalsIgnoreCase("n")) {
				//add 1 to north, remove one from south
				pStart.moveNorth();
//				System.out.println("You are " + distanceLeft + "from the target");
			}
			else if (south.equalsIgnoreCase("s")) {
				//add 1 to south, remove one from north
				pStart.moveSouth();
			}
			else if (east.equalsIgnoreCase("e")) {
				//add 1 to east, remove one from west
				pStart.moveEast();
			}
			else if (west.equalsIgnoreCase("w")) {
				//add 1 to west, remove one from east
				pStart.moveWest();
			}
			else {
				System.out.println("You need to move n for 'north', s for 'south'... ");
			}
		}
		
		
		
		
		
//		System.out.println("You are " + dist + "meters from target");
		
	}
	
}
