import java.util.Locale;
import java.util.Scanner;

public class RaioDeUmCirculo {

	public static void main(String[] args) {
		
		// Faça um programa para ler o valor do raio de um círculo,
		// e depois mostrar o valor da área deste círculo com quatro
		// casas decimais conforme exemplos.
		
		// Fórmula da área: area = π . raio2
		// Considere o valor de π = 3.14159
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double raio, area;
		
		System.out.println("Olá como você se chama?\n");
		nome = sc.nextLine();
		
		System.out.print("Olá," + nome + " digite o valor:");
		raio = sc.nextDouble();
		
		area = 3.14159 * Math.pow(raio, 2);
		
		Locale.setDefault(Locale.US);
		System.out.printf("O valor da área é: %.4f", area);
		
		

	}

}
