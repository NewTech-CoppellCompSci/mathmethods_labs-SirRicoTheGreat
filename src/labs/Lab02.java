package labs;

import java.util.Scanner;

public class Lab02 {

	public static void main(String[] args) {
		
		problem01();
		System.out.println("\n");
		problem02();
		System.out.println("\n");
		problem03();
		System.out.println("\n");
		problem04();
		
		//\ns were inbetween these so i wouldnt have to put it in the code below
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Please enter a positive integer ");
		int input1 = inKey.nextInt();
		//Asks inputs from user, one above is for a potential minimum/maximum, same thing with the other one
		Scanner inKey1 = new Scanner(System.in);
		System.out.print("please enter another positive integer ");
		int input2 = inKey1.nextInt();
		
		
		int min = Math.min(input1, input2); 
		int max = Math.max(input1, input2);
		/*
		 * /code is used to figure out the maximum and minimum because the first input is not always the smaller number, and setting
		 * the code to read the first one as the smaller one could be incorrect
		 */
		
		for (int i = 0; i < 10; i++) {
			
			int num = (int) (Math.random() * max + min);
			System.out.println(num);
			//Spits out the ten random number in between the two integers, uses the max and the min made from earlier to determine range
			
		}
		
		
		
	}
	
	
	
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Please enter a positive height ");
		int height = inKey.nextInt();
		//Asks for height and radius
		Scanner inKey1 = new Scanner(System.in);
		System.out.print("please enter a radius");
		int radius = inKey1.nextInt();
		
		int volume = (int ) Math.PI * (radius * radius) * height;
		//The multiplication here is just the formula for the volume of a cylinder
		
		System.out.println("The volume is " + volume);
	}

	
	

	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter a coord for x1 "); //Asks for an input for the first X coord
		double x1 = inKey.nextDouble(); //Stores x1 input
		System.out.println("Enter a coord for x2 "); // Asks for an input for the second X coord
		double x2 = inKey.nextDouble(); //Stores x2 input
		System.out.println("Enter a coord for y1 "); // Asks for an input for the first Y coord
		double y1 = inKey.nextDouble(); //Stores y1 input
		System.out.println("Enter a coord for y2 "); // 
		double y2 = inKey.nextDouble();
		
		double sumX = (x2 - x1);
		double sumY = (y2 - y1);
		
		double sumxSquared = Math.pow(sumX , 2);
		double sumySquared = Math.pow(sumY , 2);
		
		double solve = Math.sqrt(sumxSquared , sumySquared);
		System.out.println("The distance between the points is = ");
	}


	
	
	public static void problem04() {
		Scanner inKey = new Scanner(System.in);
		System.out.println("Enter an integer for a "); //Asks for a's integer
		double a = inKey.nextDouble(); //Stores number for a
		
		System.out.println("Enter an integer for b "); //Asks for b's integer
		double b = inKey.nextDouble(); //Store number for b
		
		System.out.println("Enter an integer for c "); //Asks for c's integer
		double c = inKey.nextDouble(); //Stores number for c
		
		double b2 = Math.pow(b , 2); //Squares b for a piece of quadratic formula
		double bSub = -b; //Flips b's sign for a piece of quadratic formula
		
		double A = a * 2; //Muliplies A for piece of quadratic formula
		double underRootBit = 4 * a; //Multiplies 4 x a for a piece of the numbers in the root
		double underRootPiece = b2 - underRootBit * c;//Multiplies earlier variable by c for another piece of the numbers under the root
		double underRoot = Math.sqrt(underRootPiece);//Square roots the sum of the earlier numbers
		
		double sum1pt1 = bSub + underRoot; //Puts together the upper half of the quadratic formula (+)
		double sum1pt2 = sum1pt1 / A; //Divides the upper half by 2a to get to the answer
		
		double sum2pt1 = bSub - underRoot; //Puts together the upper half of the quadratic formula (-)
		double sum2pt2 = sum2pt1 / A; //Divides the upper half by 2a to get to the answer
		
		System.out.println("X1 = " + sum1pt2); //Displays the result for the sum where -b + sqrt 4(a)(c)
		System.out.println("X2 = " + sum2pt2); //Displays the result for the sum where -b - sqrt 4(a)(c)
		
		
	}
	
	

	
}
