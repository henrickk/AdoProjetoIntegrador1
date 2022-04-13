import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int menu;

		do {
			System.out.println("Digite o número de 1 á 4 para escolher uma opções: ");

			System.out.println("1) Instruções");

			System.out.println("2) Jogar");

			System.out.println("3) Créditos");

			System.out.println("4) Sair");

			System.out.print("Digite: ");

			menu = entrada.nextInt();

			switch (menu) {
			case 1:
				System.out.println(menu + " Instruções");
				break;
			case 2:
				System.out.println(menu + " Jogar");
				break;
			case 3:
				System.out.println(menu + " Créditos");
				break;
			case 4:
				System.out.println(menu + " Sair");
				break;
			default:
				System.out.println(menu + " Opção inválida");
			}

		} while (menu != 4);
		System.out.println("------------------");

	}
}