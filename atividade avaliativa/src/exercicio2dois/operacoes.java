package exercicio2dois;
import java.util.Scanner;
public class operacoes {

	public static void main(String[] args) {
		double n1 = 0, n2 = 0, media = 0, produto = 0, div = 0;
		try(Scanner leia = new Scanner(System.in)){
			System.out.println("Digite o 1° numero:");
			n1 = leia.nextDouble();
			System.out.println("Digite o 2° numero:");
			n2 = leia.nextDouble();
			media = (n1 + n2)/2;
			System.out.println("A média é " + media);
			if (n1>n2) {
				System.out.println("O maior numero é " + n1);
				System.out.println("O menor numero é " + n2);
			}
			else {
				System.out.println("O maior numero é " + n2);
				System.out.println("O menor numero é " + n1);
			}
			produto = n1*n2;
			System.out.println("O produto é " + produto);
			div = n1/n2;
			System.out.println("A divisão é " + div);
		}
	}

}
