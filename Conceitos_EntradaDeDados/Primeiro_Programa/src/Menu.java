import java.util.Locale;

public class Menu {

	public static void main(String[] args) {
		String nome = "Júlio";
		int idade = 28;
		double altura = 1.80; 
		double x = 10.35784;
		
		System.out.println(x);
		System.out.printf("%.2f%n", x);
		Locale.setDefault(Locale.US);
		System.out.printf("%.2f%n", x);
		System.out.println("Resultado = " + x + " metros. ");
		System.out.printf("Resultado = %.2f metros.\n", x);
		
		
		
		System.out.printf("%s tem %d anos e mede serca de %.2f de altura.", nome, idade, altura);
	} 
 
}
 