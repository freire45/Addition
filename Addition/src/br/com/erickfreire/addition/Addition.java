package br.com.erickfreire.addition;

import java.util.Scanner;

/**
 * Program that performs the addition between two values
 * @author Erick Freire
 * @version - 1 Created in 04-10-2022
 */

public class Addition {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double number1;
		double number2;
		double sum;
		
		System.out.println("Program that performs the addition between two values: ");
		System.out.print("Enter the first value: ");
		number1 = input.nextInt();
		
		System.out.print("Enter the second value: ");
		number2 = input.nextInt();
		
		sum = number1 + number2;
		
		System.out.printf("The sum of "+number1+"and "+" number2 "+" is "+ sum);

	}

}
