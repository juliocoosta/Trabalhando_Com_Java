import java.util.Scanner;

public class SomaDeNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double x = sc.nextDouble();
		double soma = 0;
	
		while (x != 0) {
			soma += x;
			x = sc.nextDouble();
			
		}
		
		System.out.println(soma);
	}
}