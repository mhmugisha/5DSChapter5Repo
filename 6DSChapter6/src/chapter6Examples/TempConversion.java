package chapter6Examples;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TempConversion extends JFrame {

	//Declaring JLabel objects
	private JLabel celciusLabel, fahrenheitLabel;
	
	//Declaring JTextField objects
	private JTextField celsiusTF, fahrenheitTF;
	
	//Declaring the handler objects of inner classes CelciusHandler and FahrHandler
	private CelsHandler celsiusHandler;
	private FahrHandler fahrenheitHandler;
	
	//Frame dimensions
	private static final int WIDTH = 500;
	private static final int HEIGHT = 80;
	
	//The named constants.
	private static final double CTOF = 9.0/5.0; 
	private static final double FTOC = 5.0/9.0;
	private static final double OFFSET = 32;
	
	public TempConversion() {
	
	//instantiating JLabel objects
	celciusLabel = new JLabel("Temp in Celsius: ", SwingConstants.RIGHT);
	fahrenheitLabel = new JLabel("Temp in Fahrenheit:", SwingConstants.RIGHT);
	
	//instantiating JTextField objects
	celsiusTF = new JTextField(7);
	fahrenheitTF = new JTextField(7);
	
	//Create container object pane to hold the objects
	Container pane = getContentPane();
	pane.setLayout(new GridLayout(1,4));
	
	//Add objects to the pane
	pane.add(celciusLabel);
	pane.add(celsiusTF);
	pane.add(fahrenheitLabel);
	pane.add(fahrenheitTF);
	
	celsiusHandler = new CelsHandler();
	celsiusTF.addActionListener(celsiusHandler);
	
	fahrenheitHandler = new FahrHandler();
	fahrenheitTF.addActionListener(fahrenheitHandler);
	
	//Create Frame
	setTitle("Temperature Conversion:");
	setSize(WIDTH, HEIGHT);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
}
	
	private class CelsHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			double celsius, fahrenheit;
			
			celsius = Double.parseDouble(celsiusTF.getText());
			fahrenheit = celsius*CTOF + OFFSET;
			fahrenheitTF.setText(String.format("%.2f",
					fahrenheit));	
		}
		
	}
	
	private class FahrHandler implements ActionListener {
		
		public void actionPerformed(ActionEvent e) {
			double celsius, fahrenheit;
			
			fahrenheit = Double.parseDouble(fahrenheitTF.getText());
			celsius = (fahrenheit - OFFSET)*FTOC;
			
			celsiusTF.setText(String.format("%.2f",
					celsius));
	  }
	}
	
	public static void main(String[] args) {
		
		TempConversion tempConv = new TempConversion();
	}
	
}
