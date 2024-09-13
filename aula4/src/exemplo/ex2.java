package exemplo;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		double nota1 = 0, nota2 = 0, media = 0;
		System.out.println("Informe a 1°nota ");
		nota1 = leia.nextDouble();
		System.out.println("Informe a 1°nota ");
		nota1 = leia.nextDouble();
		media = (nota1 + nota2)/ 2;
		if(media > 7) {
			System.out.println("Aprovado");
		}else{
			System.out.println("Reprovado");
			}
		}

}
