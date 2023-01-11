import java.util.Scanner;

public class SenhaValida {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite sua senha de acesso:");
		int senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Iválida.");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Permitido.");
		
		sc.close();
	}
}
