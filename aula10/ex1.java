package aula10;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		int div = 0;
		
		System.out.print("Coloque um número: \n");
		int num = entrada.nextInt();
		System.out.print("Coloque um número novamente: \n");
		int num2 = entrada.nextInt();
		
		try {
			div = num / num2;
			System.out.print("Resultado da sua divisão: " + div);
		}catch(Exception e) {
			System.out.print("Erro: " + e.getMessage() + "\n");
		}
		
	}

}
