import java.util.Random;

public class AtividadeRandom {

	public static void main(String[] args) {

		Random random = new Random();

		int dado;

		int cont = 0;

		int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0, n6 = 0;

		do {

			dado = random.nextInt(1, 7);

			if (dado == 1) {

				n1 = n1 + 1;
			} else if (dado == 2) {

				n2 = n2 + 1;
			} else if (dado == 3) {

				n3 = n3 + 1;
			} else if (dado == 4) {

				n4 = n4 + 1;
			} else if (dado == 5) {
				n5 = n5 + 1;
			} else if (dado == 6) {
				n6 = n6 + 1;
			}
			cont = cont + 1;
		} while (cont != 1000000);
		System.out.println("O dado rodou " + cont + " de vezes");

		float pc1 = n1 * 100;
		float f1 = pc1 / 1000000;
		float pc2 = n2 * 100;
		float f2 = pc2 / 1000000;
		float pc3 = n3 * 100;
		float f3 = pc3 / 1000000;
		float pc4 = n1 * 100;
		float f4 = pc4 / 1000000;
		float pc5 = n1 * 100;
		float f5 = pc5 / 1000000;
		float pc6 = n1 * 100;
		float f6 = pc6 / 1000000;

		System.out.printf("A face 1, apareceu: %.2f porcento\n", f1);
		System.out.printf("A face 2, apareceu: %.2f porcento\n", f2);
		System.out.printf("A face 3, apareceu: %.2f porcento\n", f3);
		System.out.printf("A face 4, apareceu: %.2f porcento\n", f4);
		System.out.printf("A face 5, apareceu: %.2f porcento\n", f5);
		System.out.printf("A face 6, apareceu: %.2f porcento\n", f6);

		float max = f1 + f2 + f3 + f4 + f5 + f6;

		System.out.printf("O total das porcentagens é: %.0f porcento", max);

	}

}