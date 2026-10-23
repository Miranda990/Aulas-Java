package aula10;
import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Coloque um número: \n");
		String nome = entrada.next();

		try {
			int res = Integer.parseInt(nome);
			System.out.print("Seu resultado de conversão: " + res);
		}
		catch(Exception e) {
			System.out.print("Erro: " + e.getMessage());
		}
	}

}
