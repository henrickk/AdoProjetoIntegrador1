import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int menu;

		do {
			System.out.println("Digite o n�mero de 1 � 4 para escolher uma op��es: ");

			System.out.println("1) Instru��es");

			System.out.println("2) Jogar");

			System.out.println("3) Cr�ditos");

			System.out.println("4) Sair");

			System.out.print("Digite: ");

			menu = entrada.nextInt();

			switch (menu) {
			case 1:
				System.out.println(menu + " Instru��es");
				break;
			case 2:
				System.out.println(menu + " Jogar");
				break;
			case 3:
				System.out.println(menu + " Cr�ditos");
				break;
			case 4:
				System.out.println(menu + " Sair");
				break;
			default:
				System.out.println(menu + " Op��o inv�lida");
			}

		} while (menu != 4);
		System.out.println("------------------");

	}
}