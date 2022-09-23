package basic.Day5.FunctionalProgram;

import java.util.Scanner;

public class WindChill {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the values of temperature in Fahrenheit:");
		double t = scan.nextDouble();
		
		System.out.println("Enter the value of wind speed in miles per hour");
		double v = scan.nextDouble();
		
		
		if (t < 50 && v > 3 && v < 120)     //  conditions  
		{  
			
			double windchill = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * (Math.pow(v, 0.16)); //formula
			System.out.println("Wind chill factor is:" + windchill);
		} else
			System.out.println("Out of range values!");
	}

}
