package runner;

import polymorphism.Beethoven;
import polymorphism.Composers;
import polymorphism.Mozart;

public class runnerComposers {
	public static void main(String[] args) {
		Beethoven beethoven = new Beethoven();
		beethoven.songOne();
		beethoven.songTwo();
		
		Composers composer = new Beethoven();
		composer.songOne();
		composer.songTwo();
		((Beethoven)composer).songOne();
		((Beethoven)composer).songTwo();
		
		
		Object object = new Beethoven();
		((Beethoven)object).songOne();
		((Beethoven)object).songTwo();
		
		Mozart mozart = new Mozart();
		mozart.songOne();
		mozart.songTwo();
		
		Composers composer2 = new Mozart();
		((Mozart)composer2).songOne();
		((Mozart)composer2).songTwo();
		
		Object object2 = new Mozart();
		((Mozart)object2).songOne();
		((Mozart)object2).songTwo();
	}
}
