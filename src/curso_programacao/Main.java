package curso_programacao;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int convertToFahreinheit, celsius;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a temperatura em Celsius: ");
		celsius = sc.nextInt();
		
		convertToFahreinheit = (celsius * 9/5) + 32;
		
		System.out.println("A Tempertura em Fahrenheit é: " + convertToFahreinheit);
		
	}

}
