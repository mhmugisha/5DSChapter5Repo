package chapter6Examples;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class RectangleProgramThree extends JFrame{

	//Declararing and initializing the named constants.
	private static final int WIDTH = 800;
	private static final int HEIGHT = 400;
	
	//Declaring reference variables for type JLabel.
	//lengthLabel means the label of the field that will receive length
	private JLabel lengthLabel, widthLabel, areaLabel, perimeterLabel;
	
	//Declaring reference variables for type JTextField
	private JTextField lengthTextField, widthTextField, areaTextField,
			perimeterTextField;
	
	//Constructor to construct the Frame, put Labels and Text Fields.
	
	public RectangleProgramThree() {
	
		//Create the Frame:
		setTitle("Area and Perimeter of a Rectangle:");
		
		//Instantiate JLabel objects - we could use dynamic instantiation
		lengthLabel = new JLabel("Enter the Length:", SwingConstants.RIGHT);
		widthLabel = new JLabel("Enter the Width:", SwingConstants.RIGHT);
		areaLabel = new JLabel("Area:", SwingConstants.RIGHT);
		perimeterLabel = new JLabel("Perimeter:", SwingConstants.RIGHT);
		
		//Instantiate objects of JTextField and set width to 10 (which means
		//field can't take more than 10 characters.
		//lengthTextField means the text field that will receive the length.
		lengthTextField = new JTextField(10);
		widthTextField = new JTextField(10);
		areaTextField = new JTextField(10);
		perimeterTextField = new JTextField(10);
		
		//Now create the container to hold these objects.
		Container pane = getContentPane();
		
		//Set lay ou as grid with 4 rows and 2 columns - one for labels
		//and the other for text fields. 
		pane.setLayout(new GridLayout(4,2));
		
		//Add the objects to the pane. 
		pane.add(lengthLabel);
		pane.add(lengthTextField);
		pane.add(widthLabel);
		pane.add(widthTextField);
		pane.add(areaLabel);
		pane.add(areaTextField);
		pane.add(perimeterLabel);
		pane.add(perimeterTextField);

		//Continue with more attributes of the Frame.
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		RectangleProgramThree rectObject = new RectangleProgramThree();

	}

}
