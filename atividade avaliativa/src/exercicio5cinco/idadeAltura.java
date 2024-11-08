package exercicio5cinco;
import java.util.Scanner;
public class idadeAltura {

	public static void main(String[] args) {
		try(Scanner leia = new Scanner(System.in)){
			int idade = 0, mais50 = 0, 
				soma1 = 0, soma2 = 0, cont = 0;
			double altura = 0, peso = 0, media = 0;
			for(int x = 1; x<=25; x++) {
				System.out.println("Digite sua idade: ");
				idade = leia.nextInt();
				System.out.println("Digite sua altura: ");
				altura = leia.nextDouble();
				System.out.println("Digite seu peso: ");
				peso = leia.nextDouble();
				cont +=1;
				if (idade >50) {
					mais50 += 1;
				}
				if (idade <=20 || idade>=10) {
					media += altura;
					soma1 += 1;
				}
				if (peso < 40) {
					soma2 += 1;
				}
			}
			System.out.println("a quantidade de pessoas com "
					+ "idade superior a 50 anos é " + mais50);
			System.out.println("a média das alturas das pessoas"
					+ " com idade entre 10 e 20 anos é " + (media / soma1));
			System.out.println("a percentagem de pessoas com"
					+ " peso inferior a 40 quilos entre todas as pessoas"
					+ " analisadas é " + ((soma2*100)/cont)+ "%");			
		}
	}
}


