
package aula10;

import java.io.FileReader;
import java.io.FileNotFoundException;

public class ex4 {

    public static void main(String[] args) {

        try {
            FileReader leitor = new FileReader("dados.txt");

            int caractere;

            while ((caractere = leitor.read()) != -1) {
                System.out.print((char) caractere);
            }

            leitor.close();

        } catch (FileNotFoundException e) {
            System.out.println("Erro: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
