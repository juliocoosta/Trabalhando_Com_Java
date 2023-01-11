import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {
		 
		 String nome;
		 int idade;
		 double altura;
		
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Olá, seja muito bem vindo:");
		 System.out.print("Digite seu nome:");
		 nome = sc.nextLine();
		 System.out.print("Informe sua idade:");
		 idade = sc.nextInt();
		 System.out.print("Informe sua Altura:");
		 altura = sc.nextDouble();
		 System.out.println("");
		
		 System.out.println("Seu nome é : " + nome + ".");
		 System.out.println("Sua idade é: " + idade + " anos.");
		 System.out.printf("Sua altura é: %.2f:", altura);
		 sc.close();

		 }

}
 