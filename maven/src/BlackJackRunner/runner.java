//package BlackJackRunner;
//
//import org.junit.Assert.assertEquals;
//
//import org.junit.Test;
//
//import maven.BlackJack;
//
//public class runner {
//	
//	@Test
//	public void playBothOver21() {
//		assertEquals(7, BlackJack.play(22, 23));
//	}
//	
//	@Test
//	public void playDealerLoses() {
//		assertEquals(1, BlackJack.play(22, 21));
//	}
//
//	@Test
//	public void playPlayerLoses() {
//		assertEquals(2, BlackJack.play(21, 23));
//	}
//	
//	@Test
//	public void playClosestWins() {
//		assertEquals(5, BlackJack.play(20, 19));
//	}
//}
