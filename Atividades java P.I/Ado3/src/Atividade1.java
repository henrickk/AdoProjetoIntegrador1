/*1. Uma loja oferece para seus clientes um desconto de acordo com o valor da
compra. Este desconto é de 20% se o valor da compra for maior ou igual a R$
300,00 e 15% se for menor. Dado o valor do produto, mostre o valor (descontado)
da compra do cliente e o valor do desconto obtido;*/

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor da compra: ");
		double compra = entrada.nextDouble();
		System.out.println("O valor total da compra é: " + compra);

		// DESCONTO DE 20%
		double desconto1 = 20.0 / 100.00;
		double final1 = compra - (desconto1 * compra);
		double descontoTotal = compra - final1;

		
		// DESCONTO DE 15%
		double desconto2 = 15.0 / 100.00;
		double final2 = compra - (desconto2 * compra);
		double descontoTotal2 = compra - final2;

		if (compra >= 300.00) {
			System.out.println("O valor com desconto é: " + final1 + ", com desconto de: " + descontoTotal);
			
		} else {
			System.out.println("O valor com desconto é: " + final2 + ", com desconto de: " + descontoTotal2);
		}

	}

}
