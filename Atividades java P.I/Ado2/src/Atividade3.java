/*3. Dado um valor inteiro de 1 até 10, imprimir a “tabela” da
tabuada deste valor;*/

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		int soma = 0;

		int valorUsuario;

		int total;

		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite um número de 1 á 10: ");
		valorUsuario = entrada.nextInt();

		do {
			total = valorUsuario + soma;
			System.out.println(soma + " + " + valorUsuario + " = " + total);
			soma++;
		} while (soma <= 10);

	}

}
