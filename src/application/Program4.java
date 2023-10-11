package application;

import java.util.Locale;
import java.util.Scanner;
import util.velocityConverter;

public class Program4 {

	public static void main(String[] args) {
		
		velocityConverter x, y;
		
		x = new velocityConverter();
		y = new velocityConverter();
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite a velocidade que você quer converter: ");
		
		double velocity = sc.nextDouble();
		
		System.out.printf("Digite a velocidade que você quer converter: ");
		
		x.ms = sc.nextDouble();
		
		System.out.printf("Digite a velocidade que você quer converter: ");
		x.km = sc.nextDouble();
		
		double ms = velocityConverter.convertMs(velocity);
		
		double kmh = velocityConverter.convertkm(velocity);
		
		System.out.printf("A velocidade digita foi: %.0f%n", velocity);
		System.out.printf("A velocidade convertida em m/s é: %.5f%n", ms);
		System.out.printf("A velocidade convertida em km/h é: %.1f%n", kmh);
		
		System.out.printf("A velocidade digita foi: %.0f%n", velocity);
		System.out.printf("A velocidade convertida em m/s é: %.5f%n", x.velocityms());
		System.out.printf("A velocidade convertida em km/h é: %.1f%n", x.velocitykm());
		

	}

}
