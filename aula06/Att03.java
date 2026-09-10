package aula06;

import java.util.Scanner;

public class Att03 {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	
		int i;
		System.out.println("Digite um número entre 1 e 1000: ");
		int x = entrada.nextInt();
		
		
		for(i=1; i<=x; i++) {
			if(i % 2 == 1) {
				System.out.println("Seus Numeros: " + i);
				
			}
			else {
				break;
			}
		}
	
		
	}

}
