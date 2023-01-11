import java.util.Scanner;

public class DiferencaDeValores {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a,b,c,d,res,res2,res3;
		
		
		System.out.print("Digite o valor:");
		a = sc.nextInt();
		System.out.print("Digite o valor:");
		b = sc.nextInt();
		System.out.print("Digite o valor:");
		c = sc.nextInt();
		System.out.print("Digite o valor:");
		d = sc.nextInt();
		
		System.out.println("Os valores digitados foram:");
		System.out.println("-----------------");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		res = a + b;
		res2 = c + d;
		res3 = (a * b - c * d);
		
		
		System.out.println("-----------------");
		System.out.printf("A soma de %d + %d é: %d\n",a ,b ,res);
		System.out.printf("A soma de %d + %d é: %d\n",c ,d ,res2);
		
		System.out.println("-----------------");
		System.out.printf("A diferença entre os valores somados foi de: %d", res3);
		
		
		
	}

}
