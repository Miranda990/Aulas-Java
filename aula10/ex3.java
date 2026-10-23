package aula10;
import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		
		int num = 0;
		
		int[] numeros = new int[10];
		
		
		
		try {
			System.out.print("Coloque um número do índice: \n");
			num = entrada.nextInt();
			int acesso = numeros[num];
			
			System.out.print("Sua posição: " + acesso);
			
		}catch(Exception e){
			
			System.out.print("Erro: " + e.getMessage());
		
		}
		
		
		
		
	}

}
