import java.util.Scanner;

public class QuestaoMultiplaEscolha {

	public static void main(String[] args) {

		String res;

		int chance = 1;

		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("1- Marque a opção que contém apenas periféricos\n");

			System.out.println("Chances " + chance + "/3 \n");

			System.out.println("a) Memória RAM, impressora, HD, placa de rede");
			System.out.println("b) Unidade lógica Aritmética (ULA), pen drive, impressora, porta USB");
			System.out.println("c) Pen drive, CPU, HD externo, memória ROM");
			System.out.println("d) Impressora, teclado, mouse, monitor");
			System.out.println("e) Teclado, monitor, Memória virtual, pen drive");

			System.out.println("-------------------------------");

			res = entrada.next();

			System.out.println("_______________________________\n");

			switch (res) {
			case "d":
			case "D":
				System.out.print("\nVocê acertou na chance: " + chance);
				break;

			case "a":
			case "A":
			case "b":
			case "B":
			case "c":
			case "C":
			case "e":
			case "E":
				System.out.println("Infelizmente você errou ");
				System.out.println("-------------------------------\n");
				chance = chance + 1;
				break; 

			default:
				System.out.println("Opção " + "'" + res + "'" + " inválida! \n");
			}

			if (chance > 3) {
				System.out.println("Suas 3 tentativas se esgotaram!");
			}

		} while (chance <= 3 && !(res.equalsIgnoreCase("d")));
	}
}
