package application;

import java.util.Scanner;

public class Program15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar: ");
		
		int n = sc.nextInt();

		double quantity[] = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			quantity[i] = sc.nextInt();
		}
		
		System.out.println();
		
			System.out.println("NUMEROS PARES:");
			
			int quantityPares = 0;
			
		for(int i = 0; i < n; i++) {
			if(quantity[i] % 2 == 0) {
				System.out.printf("%.0f ", quantity[i]);
				quantityPares++;
			}
			
		}
		
		System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", quantityPares);
	}

}
