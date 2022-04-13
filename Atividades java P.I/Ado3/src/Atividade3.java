import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um ano para saber se é bissexto: ");
		int ano = entrada.nextInt();
		
		//Se o ano for maior q 400
		if (ano % 400 == 0) {
			System.out.println("O ano " + ano + " é bissexto!");
		
		//Se o ano for menor q 400
		} else if((ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println("O ano " + ano + " é bissexto!");
		}else {
			System.out.println("O ano " + ano + " não é bissexto!");
		}
	}
}
