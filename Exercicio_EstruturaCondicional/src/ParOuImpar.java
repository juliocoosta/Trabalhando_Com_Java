import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		
		double numero;
		
		System.out.println("Verificar de Par ou Impar.");
		System.out.println("-----------------------------");
		System.out.print("Digite o número para fazer a verificação:");
		numero = sc.nextDouble();
		
		if(numero %2 == 0) {
			System.out.println("O número digitado é Par.");
		}
		else {
			System.out.println("O número digitado é Impar.");
		}
		
		sc.close();

	}

}
