/*1. Dados 3 valores reais (float ou double) imprimir o valor do
produto destes valores;*/

public class Atividade1 {

	public static void main(String[] args) {
		
		double n1;
		n1 = 1250.70;
		System.out.println(n1);
		
		double n2;
		n2 = 870;
		System.out.println(n2);
		
		float n3;
		n3 = 5;
		System.out.println(n3);
		
		double mult = n1 * n2 * n3;
		System.out.println("O valor do produto é " + mult);
	}
}
