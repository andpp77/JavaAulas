package exemplo;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)){
			double nota1 = 0, nota2 = 0, nota3 = 0, media=0;
			System.out.println("Informe a 1° nota");
			nota1 = leia.nextDouble();
			System.out.println("Informe a 2° nota");
			nota2 = leia.nextDouble();
			System.out.println("Informe a 3° nota");
			nota3 = leia.nextDouble();
			media = (nota1 * 2 + nota2 * 3 + nota3 * 5)/ 10;
			System.out.println(media);
		}

	}

}
