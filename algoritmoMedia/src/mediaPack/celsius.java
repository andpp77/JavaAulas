package mediaPack;
import java.util.Scanner;

public class celsius {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)){
			double celsius,fah = 0;
			System.out.println("Informe o numero de graus celsius");
			celsius = ler.nextDouble();
			fah = (celsius * 9/5) + 32;
			System.out.println("A conversão para Fahrenheit é:" + fah);
		}
	}

}
