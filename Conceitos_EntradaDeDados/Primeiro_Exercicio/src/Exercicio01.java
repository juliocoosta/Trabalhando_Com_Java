import java.util.Locale;

public class Exercicio01 {

	public static void main(String[] args) {
		
		String produto01 = "Notbook";
		String produto02 = "Computador";
		
		int idade = 30;
		int codigo = 5290;
		String genero = "Feminino";
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.println("Loja Mags Nerdola.");
		System.out.println("------------------");
		System.out.println("Produtos:");
		System.out.println("");
		System.out.printf("%s, um dos melhores do mercado cujo o preço está em torno de: R$ %.2f.%n", produto01, preco1);
		System.out.printf("%s de mesa, para aqueles que precisam encomizar sem perder a qualidade do produto está em torno de: R$ %.2f.%n", produto02, preco2 );
		System.out.printf("Registro: %d anos, código %d e sexo %s.\n ",idade, codigo, genero);
		System.out.println("");
		
		System.out.printf("Medida com oito casas decimais:%.8f.\n",medida);
		System.out.printf("Arredondado (três casas decimais):%.3f.\n",medida);
		Locale.setDefault(Locale.US);
		System.out.printf("Ponto decimal dos EUA:%f.", medida);
		
	}
	

}
