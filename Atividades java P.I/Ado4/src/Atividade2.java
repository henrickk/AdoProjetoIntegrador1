
/*2. Implemente uma questão de múltipla escolha referente a alguma das outras
disciplinas que você está cursando neste semestre. Primeiro deverá ser apresentado
o enunciado da questão com as 5 opções/alternativas de resposta, que são (a), (b),
(c), (d) e (e). Depois que o usuário escolher uma opção, se for a resposta correta
deverá ser impresso “Resposta correta”, caso contrário “Resposta incorreta”.
Utilize a instrução switch, invés de if, na implementação.*/
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		char res;

		Scanner entrada = new Scanner(System.in);

		System.out.println(
				"No que diz respeito aos sistemas decimal, binário, octal e hexadecimal, diferentemente dos seres humanos, que se expressam com base no sistema decimal,");
		System.out.println(
				"os computadores empregam os sistemas binário e hexadecimal. Nesse contexto, os números decimal 223 e binário 10011010 possuem,");
		System.out.println("respectivamente, as seguintes representações binária e hexadecimal:");
		System.out.println(" ");

		System.out.println("a) 11011111 e C7");

		System.out.println("b) 11101111 E C7");

		System.out.println("c) 11011111 e 9A");

		System.out.println("d) 11101111 E 9A");

		System.out.println("e) Nenhuma das ateriores");
		System.out.println(" ");

		System.out.println("Responda qual alternativa está correta, digitando a, b, c ou d");
		System.out.println(" ");

		res = entrada.next().charAt(0);

		switch (res) {
		case 'a':
		case 'A':
			System.out.println("A resposta (" + res + ") está errada. Tente novamente!");
			break;
		case 'b':
		case 'B':
			System.out.println("A resposta (" + res + ") está errada. Tente novamente!");
			break;
		case 'c':
		case 'C':
			System.out.println("PARABÉNS! VOÇÊ ACERTOU!!! A resposta (" + res + ") está correta!");
			break;
		case 'd':
		case 'D':
			System.out.println("A resposta (" + res + ") está errada. Tente novamente!");
			break;
		case 'e':
		case 'E':
			System.out.println("A resposta (" + res + ") está errada. Tente novamente!");
			break;
		default:
			System.out.println("Resposta inválida, tente novamente!!!");

		}
	}
}
