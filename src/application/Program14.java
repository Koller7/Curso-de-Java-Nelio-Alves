package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Peoples;

public class Program14 {


	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serão digitadas? ");
		
		int n = sc.nextInt();
		
		String[] nomes = new String[n];
		int idade[] = new int[n];
		double altura[] = new double[n];
		
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			
		}
		
		double sum = 0.0;
		double menorIdade = 0;
		
		for (int i = 0; i < n; i++) {
			sum += altura[i];
		}
		
		for (int i = 0; i < n; i++) {
			if(idade[i] < 16) {
				menorIdade++;
			}
		}
		
		double porcentagemMenores = menorIdade * 100 / n;
		
		double avg = sum / n;
		
		System.out.println();
		
		System.out.printf("Altura media: %.2f%n", avg);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", porcentagemMenores );
		
		for(int i = 0; i < n; i++) {
			if(idade[i] < 16) {
				System.out.println(nomes[i]);
			}
		}

	}

}
