package aula06;
import java.util.Scanner;

public class aula10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Coloque um número: \n");
		int num = entrada.nextInt();
		System.out.print("Coloque um número novamente: \n");
		int num2 = entrada.nextInt();
		
		try {
			int div = num / num2 == 0;
		}catch(Exception e) {
			System.out.print("Erro: " + e.getMessage());
		}
		
		
		
		
	}

}
