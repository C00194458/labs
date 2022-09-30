package lab1;

// Name: Jamie O'Brien
// Student ID: C00194458
// Purpose: Lab sheet 1

public class Lab1q1 {
	// begin class ThermTest
		public static void main(String args[]) 
		{ // being main method

			Thermometer thermA = new Thermometer();		// Create an instance of our Thermometer class
			Thermometer thermB = new Thermometer(10.0); // Create second instance, instantiated and set value to 10 (Part a & b)
			double tempB; // Variable used to store temperature of thermA

			System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
			thermA.setCelsius(20.0);
			System.out.println("Temp. of Thermometer A is " + thermA.getCelsius() );
			
			tempB = thermB.getCelsius(); // Storing temperature of thermB into the variable tempB (part c)
			System.out.println("Temp. of Thermometer B is " + tempB); // Print value of tempB (part d)
			
			
		} // end main
	} // end class ThermTest

