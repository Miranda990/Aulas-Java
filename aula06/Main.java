package aula06;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite uma senha: ");
		int senha = entrada.nextInt();
		
		while(senha != 2002){
			System.out.println("Senha Incorreta!");
			System.out.println("Digite a senha novamente:");
			senha = entrada.nextInt();
			if(senha == 2002) {
				System.out.println("Acesso Permitido!");
				break;
			}
		}
		

	}

}