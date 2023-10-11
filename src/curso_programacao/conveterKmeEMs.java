package curso_programacao;
import java.util.Scanner;
public class conveterKmeEMs {

	public static void main(String[] args) {
		double velocity, convertKM, convertMS;
		int resp;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Deseja converter para km/h ou m/s?");
		System.out.println("[1] m/s para Km/h");
		System.out.println("[2] km/h para m/s");
		
		resp = sc.nextInt();
		
		if (resp == 1) {
			Scanner vel = new Scanner(System.in);
			System.out.println("Digite a velocidade");
			velocity = vel.nextInt();
			
			convertKM = (int) (velocity * 3.6);
			
			System.out.println("Velocidade: " + convertKM + " km/h");
			
		}else if (resp == 2) {
			Scanner vel = new Scanner(System.in);
			System.out.println("Digite a velocidade");
			velocity = vel.nextInt();
			
			convertMS = (int) (velocity / 3.6);
			
			System.out.println("Velocidade: " + convertMS + " m/s");
		
		} else {
			System.out.println("Resposta Invalida");
		}
	} 
} 

