package exercPOO;

import java.util.Locale;
import java.util.Scanner;
import util.currencyConverter2;

public class Program2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		currencyConverter2 dollar;
		
		dollar = new currencyConverter2();
		
		
		System.out.println("What is the dollar Price? ");
		
		dollar.dollarPrice = sc.nextDouble();
		
		System.out.println("How many dollars will be bought? ");
		
		dollar.dollarBought = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais =  %.2f%n", dollar.result());
		
	

	}

}
