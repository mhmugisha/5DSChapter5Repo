package chapter6Examples;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AreaAndVolume extends JFrame {

	// Declaring the JLabel objects
	private JLabel lengthL, widthL, heightL, areaL, volumeL, shapeL;

	// Declare the JTextField objects
	private JTextField lengthTF, widthTF, heightTF, areaTF, volumeTF, shapeTF;

	// Declare the JButton objects
	private JButton calculateA, calculateV, exit;

	// Frame dimensions
	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	private CalculateAreaHandler caHandler;
	private CalculateVolumeHandler cvHandler;
	private ExitHandler exHandler;

	public AreaAndVolume() 
	{
		
		// Instantiating the JLabel objects;
		lengthL = new JLabel("Length:", SwingConstants.RIGHT);
		widthL = new JLabel("Width:", SwingConstants.RIGHT);
		heightL = new JLabel("Height:", SwingConstants.RIGHT);
		areaL = new JLabel("Surface Area:", SwingConstants.RIGHT);
		volumeL = new JLabel("Volume:", SwingConstants.RIGHT);
		shapeL = new JLabel("Shape:", SwingConstants.RIGHT);

		// Instantiatting the JTextField objects
		lengthTF = new JTextField(10);
		widthTF = new JTextField(10);
		heightTF = new JTextField(10);
		areaTF = new JTextField(10);
		volumeTF = new JTextField(10);
		shapeTF = new JTextField(10);

		// Create the Calculate area button
		calculateA = new JButton("Calculate Area");
		caHandler = new CalculateAreaHandler();
		calculateA.addActionListener(caHandler);

		// Create the calculate volume button
		calculateV = new JButton("Calculate Volume");
		cvHandler = new CalculateVolumeHandler();
		calculateV.addActionListener(cvHandler);

		// Create the exit button
		exit = new JButton("Exit");
		exHandler = new ExitHandler();
		exit.addActionListener(exHandler);
		
		// Creating the container pane
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(8, 2));

		// Adding objects to the pane of container type
		pane.add(lengthL);
		pane.add(lengthTF);
		pane.add(widthL);
		pane.add(widthTF);
		pane.add(heightL);
		pane.add(heightTF);
		pane.add(areaL);
		pane.add(areaTF);
		pane.add(volumeL);
		pane.add(volumeTF);
		pane.add(shapeL);
		pane.add(shapeTF);
		pane.add(calculateA);
		pane.add(calculateV);
		pane.add(exit);

		// Constructing the frame
		
		setTitle("Surface Area and Volume of a Cuboid:");
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	// Calculate surface area inner class

	private class CalculateAreaHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double length, width, height, area;
			length = Double.parseDouble(lengthTF.getText());
			width = Double.parseDouble(widthTF.getText());
			height = Double.parseDouble(heightTF.getText());

			area = 2 * length * width + 2 * length * height + 2 * width * height;

			areaTF.setText(" " + area);
			
			//if(length == width == height)
				//shapeTF.setText("Cuboid");

		}
	}

	// Calculate volume inner class
	private class CalculateVolumeHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			double length, width, height, volume;

			length = Double.parseDouble(lengthTF.getText());
			width = Double.parseDouble(widthTF.getText());
			height = Double.parseDouble(heightTF.getText());

			volume = length * width * height;

			volumeTF.setText(" " + volume);

		}
	}

	// Exit inner class
	public class ExitHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		AreaAndVolume obj = new AreaAndVolume();

	}

}
