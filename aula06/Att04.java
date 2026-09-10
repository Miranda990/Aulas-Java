package aula06;

import java.util.Scanner;

public class Att04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int in = 0;
		int out = 0;
		int i;
		
		System.out.println("Coloque a quantidade de números:");
		int N = entrada.nextInt();
		
		for(i=1; i<=N; i++) {
			System.out.println("Digite um Numero: ");
			int num = entrada.nextInt();
			if(num >= 10 && num <= 20) {
				in++;
			}
			
			else {
				out++;
			}
		}
		System.out.println("Seus números: \n" + "Dentro de 10 e 20: " + in +
				"\n Fora de 10 e 20: " + out);
	}

}
