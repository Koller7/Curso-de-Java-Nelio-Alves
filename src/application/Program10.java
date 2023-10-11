package application;
import java.util.Locale;
import java.util.Scanner;


public class Program10 {


	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos numeros você vai digitar? ");
		int quantityOfNumber = sc.nextInt();
		
		double vect[] = new double[quantityOfNumber];
		
		for (int i = 0; i < quantityOfNumber; i++) {
			vect[i] = sc.nextDouble();
		}
		
		double sum = 0.0;
		
		for (int i = 0; i < quantityOfNumber; i++) {
			sum += vect[i];
		}
		
		double avg = sum / quantityOfNumber;
		
		System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
		
		
		sc.close();
		}
		
	}

