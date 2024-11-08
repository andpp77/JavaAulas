package exercicio3tres;
import java.util.Scanner;
public class saldoMedio {

	public static void main(String[] args) {
		double sm = 0, calc = 0;
		try(Scanner leia = new Scanner(System.in)){
			System.out.println("Digite o seu Saldo Médio");
			sm = leia.nextDouble();
			if(sm > 400) {
				calc = sm*0.30;
				System.out.println("seu saldo médio é R$"+ sm);
				System.out.println("valor do crédito é R$" + calc);
			}
			else if (sm >= 300) {
				calc = sm*0.25;
				System.out.println("seu saldo médio é R$"+ sm);
				System.out.println("valor do crédito é R$" + calc);
			}
			else if (sm >= 200) {
				calc = sm*0.20;
				System.out.println("seu saldo médio é R$"+ sm);
				System.out.println("valor do crédito é R$" + calc);
			}
			else{
				calc = sm*0.10;
				System.out.println("seu saldo médio é R$"+ sm);
				System.out.println("valor do crédito é R$" + calc);
			}
		}
		
	}

}
