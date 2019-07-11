/*This Java Program determines the area and
 perimeter of a rectangle.*/

package chapter6Examples;

import javax.swing.JOptionPane;

public class AreaAndPerimeterPage296 {

	public static void main(String[] args) 
	{
	double length, width, area, perimeter;
	String lengthStr, widthStr, outputString;
	
	lengthStr = JOptionPane.showInputDialog("Enter length: ");
	length = Double.parseDouble(lengthStr);//as in in.Scanner.
	
	widthStr = JOptionPane.showInputDialog("Enter width: ");
	width = Double.parseDouble(widthStr);
	 
	area = length * width;
	perimeter = 2 * (length + width);
	
	outputString = "Length: " + length + "\n" + "Width: " + width +"\n" + 
	"Area = " + area + "square units." + "\n" + "Perimeter = " + 
	 perimeter + "units.";
	
	JOptionPane.showMessageDialog(null, outputString,
			"Rectangle Area and Perimeter:",
			JOptionPane.INFORMATION_MESSAGE);
	
	System.exit(0);
	}
	
}
