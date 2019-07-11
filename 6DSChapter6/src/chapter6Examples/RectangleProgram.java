package chapter6Examples;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RectangleProgram extends JFrame {

	// Declare JLabel objects.
	private JLabel widthLabel, areaLabel, perimeterLabel;

	// Declare JTextField objects.
	private JTextField lengthTextField, widthTextField, areaTextField, perimeterTextField;

	// Declare the JButton object.
	private JButton calculateB, exitB;

	//Declare the CalculateButtonHandler and ExitButtonHandler inner 
	//classes objects
	private CalculateButtonHandler cbHandler;
	private ExitButtonHandler ebHandler;

	// Declare and initialize named constants of Frame - height and width.
	private static final int HEIGHT = 400;
	private static final int WIDTH = 300;

	public RectangleProgram() {

		//instantiate objects of JLabel.
		JLabel  lengthLabel = new JLabel("Enter the Length:", SwingConstants.RIGHT);
		widthLabel = new JLabel("Enter the Width:", SwingConstants.RIGHT);
		areaLabel = new JLabel("Area:", SwingConstants.RIGHT);
		perimeterLabel = new JLabel("Perimeter:", SwingConstants.RIGHT);

		//instantiate objects of JTextField.
		lengthTextField = new JTextField(10);
		widthTextField = new JTextField(10);
		areaTextField = new JTextField(10);
		perimeterTextField = new JTextField(10);

		//Create Calculate Button using a named object cbHandler 
		calculateB = new JButton("Calculate");
		cbHandler = new CalculateButtonHandler();
		calculateB.addActionListener(cbHandler);
		calculateB.setBackground(Color.BLUE);

		//Create Exit Button using anonymous object of type ExitButtonHandler
		exitB = new JButton("Exit");
		exitB.addActionListener(new ExitButtonHandler());
		exitB.setBackground(Color.PINK);

		//Create Frame, set its size and display it
		setTitle("Area and Perimeter of Rectangle:");
		setSize(WIDTH, HEIGHT);/*WIDTH and HEIGHT must be int*/
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		//Get the container into the frame
		Container pane = getContentPane();

		//Set layout of the pane as gridlayout.
		pane.setLayout(new GridLayout(5, 2));

		// Add or place contents in the pane.
		pane.add(lengthLabel);
		pane.add(lengthTextField);
		pane.add(widthLabel);
		pane.add(widthTextField);
		pane.add(areaLabel);
		pane.add(areaTextField);
		pane.add(perimeterLabel);
		pane.add(perimeterTextField);
		pane.add(calculateB);
		pane.add(exitB);
	}

	/* _______________________________________________________________ */
	
	// CalculateButtonHandler INNER CLASS.
	private class CalculateButtonHandler implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			double length, width, area, perimeter;
			length = Double.parseDouble(lengthTextField.getText());
			width = Double.parseDouble(widthTextField.getText());
			area = length * width;
			perimeter = 2 * (length + width);

			areaTextField.setText(" " + area);
			perimeterTextField.setText(" " + perimeter);

		}
	}
	/* ________________________________________________________________ */

	// Exit button INNER CLASS
	private class ExitButtonHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}

	}

	/* ______________________________________________________________________ */

	// Method main
	public static void main(String[] args) {
		RectangleProgram rectObject = new RectangleProgram();
	}

}
