
package chapter6Examples;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class RectangleProgramTwo extends JFrame {

	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;

	// Here JLabel is a type as you would write say int length or String s.
	// lengthL, widthL... are reference variables of objects of type JLabel
	private JLabel lengthLabel, //LengthL - Label for length and so forth...
	widthLabel, areaLabel, perimeterLabel;

	// Constructor
	public RectangleProgramTwo() {
		setTitle("Area and Perimeter of Rectangle:");
		lengthLabel = new JLabel("Enter the Length: ", SwingConstants.RIGHT);
		widthLabel = new JLabel("Enter the Width: ", SwingConstants.RIGHT);
		areaLabel = new JLabel("Area: ", SwingConstants.RIGHT);
		perimeterLabel = new JLabel("Perimeter: ", SwingConstants.RIGHT);

		Container pane = getContentPane();
		pane.setLayout(new GridLayout(4, 1));

		pane.add(lengthLabel);
		pane.add(widthLabel);
		pane.add(areaLabel);
		pane.add(perimeterLabel);

		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {

		RectangleProgramTwo rectObject = new RectangleProgramTwo();

	}

}
