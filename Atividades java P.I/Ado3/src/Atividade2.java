import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor de X: ");
		int x = entrada.nextInt();
		
		System.out.print("Digite o valor de Y: ");
		int y = entrada.nextInt();
		
		System.out.print("Digite o valor de Z: ");
		int z = entrada.nextInt();
		
		if (x == y && x == z && y == z) {
			System.out.println("Voc� formou um tri�ngulo equil�tero!");
		}else if (x == y || x == z || z == y) {
			System.out.println("Voc� formou um tri�ngulo is�sceles!");
		}else {
			System.out.println("Voc� formou um tri�ngulo escaleno!");
		}

	}
}
