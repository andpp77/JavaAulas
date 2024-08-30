package mediaPack;
import java.util.Scanner;
public class media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner ler = new Scanner(System.in)){
			int n1,n2,n3 = 0 ;
			double media = 0;
			System.out.println("Informe o 1° numero: ");
			n1 = ler.nextInt();
			System.out.println("Informe o 2° numero: ");
			n2 = ler.nextInt();
			System.out.println("Informe o 3° numero: ");
			n3 = ler.nextInt();
			media = (n1+n2+n3)/3;
			System.out.println("A média é: " + media);
		}
	}

}
