package algoritmo1;
import java.util.Scanner;
public class SomarNumeros {

	public static void main(String[] args) {
		try (Scanner ler = new Scanner(System.in)) {
			// TODO Auto-generated method stub
			// Informar variáveis ou constantes
			int n1,n2 =0;
			int resultado = 0;
			
			System.out.println("Digite o primeiro numero: ");
			n1 = ler.nextInt();
			System.out.println("Digite o segundo numero: ");
			n2 = ler.nextInt();
			resultado = (n1 + n2)/ 2;
			System.out.println("a soma dos numeros é " + resultado );
		}



	}

}
