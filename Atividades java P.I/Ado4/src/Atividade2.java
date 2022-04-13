
/*2. Implemente uma quest�o de m�ltipla escolha referente a alguma das outras
disciplinas que voc� est� cursando neste semestre. Primeiro dever� ser apresentado
o enunciado da quest�o com as 5 op��es/alternativas de resposta, que s�o (a), (b),
(c), (d) e (e). Depois que o usu�rio escolher uma op��o, se for a resposta correta
dever� ser impresso �Resposta correta�, caso contr�rio �Resposta incorreta�.
Utilize a instru��o switch, inv�s de if, na implementa��o.*/
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		char res;

		Scanner entrada = new Scanner(System.in);

		System.out.println(
				"No que diz respeito aos sistemas decimal, bin�rio, octal e hexadecimal, diferentemente dos seres humanos, que se expressam com base no sistema decimal,");
		System.out.println(
				"os computadores empregam os sistemas bin�rio e hexadecimal. Nesse contexto, os n�meros decimal 223 e bin�rio 10011010 possuem,");
		System.out.println("respectivamente, as seguintes representa��es bin�ria e hexadecimal:");
		System.out.println(" ");

		System.out.println("a) 11011111 e C7");

		System.out.println("b) 11101111 E C7");

		System.out.println("c) 11011111 e 9A");

		System.out.println("d) 11101111 E 9A");

		System.out.println("e) Nenhuma das ateriores");
		System.out.println(" ");

		System.out.println("Responda qual alternativa est� correta, digitando a, b, c ou d");
		System.out.println(" ");

		res = entrada.next().charAt(0);

		switch (res) {
		case 'a':
		case 'A':
			System.out.println("A resposta (" + res + ") est� errada. Tente novamente!");
			break;
		case 'b':
		case 'B':
			System.out.println("A resposta (" + res + ") est� errada. Tente novamente!");
			break;
		case 'c':
		case 'C':
			System.out.println("PARAB�NS! VO�� ACERTOU!!! A resposta (" + res + ") est� correta!");
			break;
		case 'd':
		case 'D':
			System.out.println("A resposta (" + res + ") est� errada. Tente novamente!");
			break;
		case 'e':
		case 'E':
			System.out.println("A resposta (" + res + ") est� errada. Tente novamente!");
			break;
		default:
			System.out.println("Resposta inv�lida, tente novamente!!!");

		}
	}
}
