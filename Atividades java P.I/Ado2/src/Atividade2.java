/*2. Dado um valor inteiro N imprimir os 3 primeiros múltiplos deste
valor*/

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int i = 1;

		System.out.print("Digite um número: ");
		int mult = entrada.nextInt();

		do {
			System.out.println(i + " Multiplo: " + (i * mult));
			i = i + 1;
		} while (i <= 3);

	}
}
