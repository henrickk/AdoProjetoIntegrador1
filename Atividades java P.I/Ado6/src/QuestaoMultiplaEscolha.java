import java.util.Scanner;

public class QuestaoMultiplaEscolha {

	public static void main(String[] args) {

		String res;

		int chance = 1;

		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("1- Marque a op��o que cont�m apenas perif�ricos\n");

			System.out.println("Chances " + chance + "/3 \n");

			System.out.println("a) Mem�ria RAM, impressora, HD, placa de rede");
			System.out.println("b) Unidade l�gica Aritm�tica (ULA), pen drive, impressora, porta USB");
			System.out.println("c) Pen drive, CPU, HD externo, mem�ria ROM");
			System.out.println("d) Impressora, teclado, mouse, monitor");
			System.out.println("e) Teclado, monitor, Mem�ria virtual, pen drive");

			System.out.println("-------------------------------");

			res = entrada.next();

			System.out.println("_______________________________\n");

			switch (res) {
			case "d":
			case "D":
				System.out.print("\nVoc� acertou na chance: " + chance);
				break;

			case "a":
			case "A":
			case "b":
			case "B":
			case "c":
			case "C":
			case "e":
			case "E":
				System.out.println("Infelizmente voc� errou ");
				System.out.println("-------------------------------\n");
				chance = chance + 1;
				break; 

			default:
				System.out.println("Op��o " + "'" + res + "'" + " inv�lida! \n");
			}

			if (chance > 3) {
				System.out.println("Suas 3 tentativas se esgotaram!");
			}

		} while (chance <= 3 && !(res.equalsIgnoreCase("d")));
	}
}
