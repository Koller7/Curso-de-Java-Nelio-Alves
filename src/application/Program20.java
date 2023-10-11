package application;

import java.util.Locale;
import java.util.Scanner;

public class Program20 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		n = sc.nextInt();
		int [][] matriz = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextInt();
				
			}
						
		}
		
		System.out.println("Main diagonal");
		
		// nessa parte do programa ele vai percorrer a diagonal 
		
		for (int i = 0; i < n; i++) {
			System.out.printf("%d ", matriz[i][i]);
		}
		
		// aqui eu criei a varivel contador para armazenar a quantidade de numeros negativos
		
		int contador = 0;
		
		System.out.println();
		
		// aqui é a logica para ver quantos numeros negativos tem na matriz
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (matriz[i][j] < 0) {
					contador++;
				}
			}
		}
		
		System.out.println("Negative Numbers = " + contador);
			
		sc.close();
		
		}
			
		
	}


