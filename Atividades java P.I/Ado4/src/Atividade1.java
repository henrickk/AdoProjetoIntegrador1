import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		int diaDaSemana;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um n�mero para ver que dia �: ");

		diaDaSemana = entrada.nextInt();

		switch (diaDaSemana) {
		case 1:
			System.out.print("Domingo");
			break;
		case 2:
			System.out.print("Segunda-Feira");
			break;
		case 3:
			System.out.print("Ter�a-Feira");
			break;
		case 4:
			System.out.print("Quarta-Feira");
			break;
		case 5:
			System.out.print("Quinta-Feira");
			break;
		case 6:
			System.out.print("Sexta-Feira");
			break;
		case 7:
			System.out.print("S�bado");
			break;
		default:
			System.out.println("[ERRO!]Valor inv�lido!");

		}
	}
}
