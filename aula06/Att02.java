package aula06;

import java.util.Scanner;

public class Att02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);	
	
		int x = 1;
		int y = 1;
		
		
		while(x != 0 && y != 0){
			System.out.println("Digite o X: ");
			x = entrada.nextInt();
			System.out.println("Digite o Y: ");
			y = entrada.nextInt();
			if(x > 0 && y > 0) {
				System.out.println("Primeiro Quadrante");
			} else if(x < 0 && y > 0){
				System.out.println("Segundo Quadrante");
			} else if(x < 0 && y < 0) {
				System.out.println("Terceiro Quadrante");
			} else if(x > 0 && y < 0) {
				System.out.println("Quarto Quadrante");
			}
			
		}
		
	}

}
