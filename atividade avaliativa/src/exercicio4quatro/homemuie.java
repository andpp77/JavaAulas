package exercicio4quatro;
import java.util.Scanner;
public class homemuie {

	public static void main(String[] args) {
		int h1 = 0, h2 = 0, m1 = 0, m2=0;
		try(Scanner leia = new Scanner(System.in)){
			System.out.println("Digite a idade do 1º homem:");
			h1 = leia.nextInt();
			System.out.println("Digite a idade do 2º homem:");
			h2 = leia.nextInt();
			System.out.println("Digite a idade da 1º mulher:");
			m1 = leia.nextInt();
			System.out.println("Digite a idade da 2º mulher:");
			m2 = leia.nextInt();
			if (h1>h2 && m1>m2) {
				System.out.println("A soma do homem mais velho com a "
						+ "mulher mais nova é " + (h1+m2));
				System.out.println("O produto do homem mais novo com a "
						+ "mulher mais velha é " + (h2+m1));
			}
			else {
				System.out.println("A soma do homem mais velho com a "
						+ "mulher mais nova é " + (h2+m1));
				System.out.println("O produto do homem mais novo com a "
						+ "mulher mais velha é " + (h1*m2));
			}
		}

	}

}
