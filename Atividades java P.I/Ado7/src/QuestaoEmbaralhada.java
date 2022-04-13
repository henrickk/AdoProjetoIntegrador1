import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;

public class QuestaoEmbaralhada {

	public static void main(String[] args) {

		int tentativas = 1;
		String resposta = "*";
		boolean acerto = false;

		Scanner entrada = new Scanner(System.in);

		ArrayList<String> alternativas = new ArrayList<String>();
		alternativas.add("Mem�ria RAM, impressora, HD, placa de rede");
		alternativas.add("Unidade l�gica Aritm�tica (ULA), pen drive, impressora, porta USB");
		alternativas.add("Impressora, teclado, mouse, monitor");
		alternativas.add("Pen drive, CPU, HD externo, mem�ria ROM");
		alternativas.add("Teclado, monitor, Mem�ria virtual, pen drive");

		String correto = "Impressora, teclado, mouse, monitor";

		do {

			Collections.shuffle(alternativas);

			System.out.println("1- Marque a op��o que cont�m apenas perif�ricos\n");

			System.out.println("Tentativa" + tentativas + "/3");

			System.out.println("a)" + alternativas.get(0));
			System.out.println("b)" + alternativas.get(1));
			System.out.println("c)" + alternativas.get(2));
			System.out.println("d)" + alternativas.get(3));
			System.out.println("e)" + alternativas.get(4));

			resposta = entrada.next();

			switch (resposta) {
			case "a":
			case "A":
				if (alternativas.get(0).equals(correto)) {

					System.out.println("Resposta Correta!");

					acerto = true;

				} else {

					System.out.println("Resposta errada");

					tentativas = tentativas + 1;

					if (tentativas >= 4) {
						System.out.println("Sua tentativas acabaram.");
					}

				}

				break;

			case "b":
			case "B":
				if (alternativas.get(1).equals(correto)) {

					System.out.println("Resposta Correta!");

					acerto = true;

				} else {

					System.out.println("Resposta errada");

					tentativas = tentativas + 1;

					if (tentativas >= 4) {
						System.out.println("Sua tentativas acabaram.");
					}
				}

				break;

			case "c":
			case "C":
				if (alternativas.get(2).equals(correto)) {

					System.out.println("Resposta Correta!");

					acerto = true;

				} else {

					System.out.println("Resposta errada");

					tentativas = tentativas + 1;

					if (tentativas >= 4) {
						System.out.println("Sua tentativas acabaram.");
					}
				}

				break;

			case "d":
			case "D":
				if (alternativas.get(3).equals(correto)) {

					System.out.println("Resposta Correta!");

					acerto = true;

				} else {

					System.out.println("Resposta errada");

					tentativas = tentativas + 1;

					if (tentativas >= 4) {
						System.out.println("Sua tentativas acabaram.");
					}
				}

				break;

			case "e":
			case "E":
				if (alternativas.get(4).equals(correto)) {

					System.out.println("Resposta Correta!");

					acerto = true;

				} else {

					System.out.println("Resposta errada");

					tentativas = tentativas + 1;

					if (tentativas >= 4) {
						System.out.println("Sua tentativas acabaram.");
					}
				}

				break;

			default:

				System.out.println("Alternativa Inv�lida");
				break;

			}

		} while (!(tentativas >= 4 || acerto == true));

	}

}