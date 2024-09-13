package exemplo;
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		try (Scanner leia = new Scanner(System.in)) {
			double salarioBase = 0, horasTrabalhadas = 0 , extras = 0;
			double valorHora = 0, valorHoraExtra= 0	, salarioFinal =0;
			System.out.println("Informe o valor do salario");
			salarioBase = leia.nextDouble();
			System.out.println("Informe as horas trabalhadas");
			horasTrabalhadas = leia.nextDouble();
			System.out.println("Informe as horas extras");
			extras = leia.nextDouble();
			valorHora = salarioBase/horasTrabalhadas;
			valorHoraExtra = valorHora * 1.5;
			salarioFinal = salarioBase + (extras * valorHoraExtra);
			if(salarioFinal > 500) {
				salarioFinal = salarioFinal * 1.3;
			}
			System.out.println("Seu salário é :" + salarioFinal);
		}
	}
}
