package mediaPack;
import java.util.Scanner;
public class area {
	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)){
			double altura, largura, area = 0;
			System.out.println("Informe a largura do retangulo: ");
			largura = ler.nextDouble();
			System.out.println("Informe a altura do retangulo: ");
			altura = ler.nextDouble();
			area = (largura * altura);
			System.out.println("A area do Retangulo é:  " + area);	
		}
	}

}
