package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(.166,.496,.166,.166);
		StdDraw.filledRectangle(.496+.332,.166,.166,.166);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(.496,.332,.166,.332);
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(.166,.166,.166,.166);
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(.496,.332,.166,.332);
		StdDraw.setPenColor(Color.GREEN);
		StdDraw.filledRectangle(.496+.332,.496,.166,.166);
		for (int i = 1; i<4; i++){
			for (int j = 0; j<3; j++){
				StdDraw.filledCircle(0.083*i, (.583 - 0.083*j), 0.03);
			}
		}
		StdDraw.setPenColor(Color.BLACK);
		StdDraw.rectangle(0.5,0.332,0.5,0.332);

	}
}