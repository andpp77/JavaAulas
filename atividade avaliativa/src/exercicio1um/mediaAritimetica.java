package exercicio1um;
import java.util.Scanner;
public class mediaAritimetica {

	public static void main(String[] args) {
		double n1 = 0, n2 = 0, media = 0;
		try(Scanner leia = new Scanner(System.in)){
			System.out.println("Digite a 1° nota:");
			n1 = leia.nextDouble();
			System.out.println("Digite a 2° nota:");
			n2 = leia.nextDouble();
			media = (n1 + n2)/2;
			System.out.println("A média é "+ media);	
		}
	}
}
