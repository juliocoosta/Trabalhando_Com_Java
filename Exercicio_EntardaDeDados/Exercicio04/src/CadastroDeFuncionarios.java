import java.util.Scanner;

public class CadastroDeFuncionarios {

	public static void main(String[] args) {
		
		String nome, ocupacao, setor;
		int idade, cracha;
		Double hora1,hora2,salario,salario1;
		Scanner sc = new Scanner(System.in);
		
				
		System.out.print("Qual o seu nome ?\n");
		nome = sc.nextLine();
		System.out.print("Informe sua ocupação ?\n");		
		ocupacao = sc.nextLine();
		System.out.print("Informe seu setor:\n");
		setor = sc.nextLine();
		System.out.print("Informe sua idade:\n");	
		idade = sc.nextInt();
		System.out.print("Informe seu crachá:\n");	
		cracha = sc.nextInt();
		System.out.print("Quanto você recebe por hora trabalhada:\n");		
		hora1 = sc.nextDouble();
		System.out.print("Quantas horas você trabalha por dia:\n");		
		hora2 = sc.nextDouble();
		
		salario = hora1 * hora2;
		salario1 = salario * 30;
		
		System.out.println("");
		System.out.println("----------------");
		System.out.println("Dados cadastrais:");
		System.out.printf("Funcionário:%s\n",nome);
		System.out.printf("Cargo:%s\n",ocupacao);
		System.out.printf("Setor:%s\n",setor);
		System.out.printf("Idade:%d\n",idade);
		System.out.printf("Crachá:%d\n",cracha);
		System.out.printf("Salário:R$ %.2f\n",salario1);
	}

}
