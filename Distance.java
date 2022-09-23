package basic.Day5.FunctionalProgram;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
					@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter value of x and y to calculate Euclidean distance : ");
			double x = scan.nextDouble();
			double y = scan.nextDouble();
			
			// math.pow to get the square of the number -user input
			final double p = 2;
			double x1 = Math.pow(x, p);
			double y1 = Math.pow(y, p);
			System.out.println("x1 and y1 are: " + x1 + " and " + y1);
			
			// ADDING values of x1 and y1,using math.sqrt to square-root the sum

			double d = x1 + y1;
			double edistance = Math.sqrt(d);
			System.out.println("Eculidean distance is: " + edistance);

	}

}
