package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;


import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		String shape = in.next();
		Color color = new Color(in.nextInt(),in.nextInt(),in.nextInt());
		StdDraw.setPenColor(color);
		boolean fill = in.nextBoolean();
		if(shape.equals("rectangle")){
			System.out.println(shape);
			double x = in.nextDouble();
			double y = in.nextDouble();
			double halfWitdh = in.nextDouble();
			double halfHeight = in.nextDouble();
			if(fill == true) {
				StdDraw.filledRectangle(x,y,halfWitdh,halfHeight);
			} else {
				StdDraw.rectangle(x,y,halfWitdh,halfHeight);
			}
		} else if (shape.equals("ellipse")) {
			System.out.println(shape);
			double x = in.nextDouble();
			double y = in.nextDouble();
			double semiMajor = in.nextDouble();
			double semiMinor = in.nextDouble();
			if(fill == true) {
				StdDraw.filledEllipse(x,y,semiMajor,semiMinor);
			} else {
				StdDraw.ellipse(x,y,semiMajor,semiMinor);
				System.out.println(semiMajor);
				System.out.print(semiMinor);
			}
		}
		

	}
}
