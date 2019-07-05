package assessment;

import static org.junit.Assert.*;

import org.junit.Test;


public class AppTest {

	MyMap m = new MyMap();
	Player p = new Player(1, 4, 2, 7);
	
	@Test
	public void rewardThere() {
		assertNotNull("should have an target location", m.itemLoc());
	}
	
	@Test
	public void playerLoc() {
		assertNotNull("should have a payer location", p.getCurLoc());
	}
	
	@Test
	public void playerLocArray() {
		assertNotNull("should have player location an array", p.getPlyrLoc());
	}
	
}
