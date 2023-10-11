package curso_programacao;
import java.util.Scanner;
public class velocidadeMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int deslocamento, intDeTempo;
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o deslocamento em Km");
	deslocamento = sc.nextInt();
	System.out.println("Digite o intervalo de Tempo em Segundos");
	intDeTempo = sc.nextInt();
	
	double vm = deslocamento / intDeTempo;
	
	System.out.println(vm + " km/h");
	}

}
