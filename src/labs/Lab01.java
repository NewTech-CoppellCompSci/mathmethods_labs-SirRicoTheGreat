package labs;

import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) {
		
		problem01();
		System.out.println("\n");
		problem02();
		System.out.println("\n");
		problem03();
		System.out.println("\n");
		problem04();
		
	}
	

	
	public static void problem01() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("enter a positive integer ");
		int input = inKey.nextInt();
		
		System.out.print("enter another positive integer ");
		int winput = inKey.nextInt();
		
		double num = Math.pow(input, winput);
		System.out.println(input + "^" + winput + " =  " + num);
	}
	
	
	
	
	public static void problem02() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter a positive integer ");
		int input = inKey.nextInt();
		
		double num = Math.sqrt(input);
		System.out.println("the square root of " + input + " is " + num);
		
		
		
	}

	
	

	public static void problem03() {
		Scanner inKey = new Scanner(System.in);
		System.out.print("Enter Length of Side A ");
		int sideA = inKey.nextInt();
		
		System.out.print("Enter Length of Side B ");
		int sideB = inKey.nextInt();
		
		double num1 = Math.pow(sideA, 2);
		double num2 = Math.pow(sideB, 2);
		
		double num3 = num1 + num2;
		double hypo = Math.sqrt(num3);
		System.out.println("Hypotenuse = " + hypo);
	
	}


	
	
	public static void problem04() {
		boolean Zero = false;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		while (!Zero) {
			Scanner inKey = new Scanner(System.in);
			System.out.print("Enter an integer ");
			int input = inKey.nextInt();
			
				if (input == 0) {
					Zero = true;
					break;
				}
			max = Math.max(max, input);
			min = Math.min(min, input);
			
		}
		System.out.println("Math = " + max);
		System.out.println("Min = " + min);
		
		
		
		
	}
	
	
	
	
	
	
}
