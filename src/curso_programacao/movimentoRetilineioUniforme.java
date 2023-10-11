package curso_programacao;

import java.util.Scanner;

public class movimentoRetilineioUniforme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int s0, v, deltaT, s;
		Scanner posicaoInicial = new Scanner(System.in);
		Scanner velocidade = new Scanner(System.in);
		Scanner intervaloDeTempo = new Scanner(System.in);
		System.out.println("Digite a Posição Inicial: ");
		s0 = posicaoInicial.nextInt();
		System.out.println("Digite a Velocidade do Objeto");
		v = velocidade.nextInt();
		System.out.println("Digite o intervalo de tempo:");
		deltaT = intervaloDeTempo.nextInt();
		
		s = s0 + (v * deltaT);
		
		System.out.println(s);
		
	}

}
