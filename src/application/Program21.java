package application;

import java.util.Scanner;

public class Program21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a velocidade: ");
		
		int velocity = sc.nextInt();
		
		System.out.printf("A velocidade convertida é %.0f km/h", ms(velocity));

	}
	
	public static double ms(int velocity) {
		return velocity * 3.6;
	}
	
	public static double km(int velocity) {
		return velocity / 3.6;
	}

}
