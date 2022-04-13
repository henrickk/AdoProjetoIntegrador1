/*4. Dado um nome (String) não composto, imprimir a quantidade de caracteres deste nome.*/

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite uma palavra: ");

		String palavra = entrada.next();

		System.out.print("A palavra que você digitou tem " + palavra.length() + " caracteres.");
	}

}
