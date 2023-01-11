import java.util.Scanner;

public class Exemplo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		char resp;
		do {
			System.out.println("Digite a temperatua em Celsius:");
			double c = sc.nextDouble();
			double f = 9.0 * c / 5.0 + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			System.out.println("Deseja repetir (s/n) ? ");
			resp = sc.next().charAt(0);
		} while (resp != 'n');
		
		sc.close();
		
	}

}
