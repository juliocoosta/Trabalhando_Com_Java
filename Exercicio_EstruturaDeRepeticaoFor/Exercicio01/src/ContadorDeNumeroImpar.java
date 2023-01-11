import java.util.Scanner;

public class ContadorDeNumeroImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um valor");
		int x = sc.nextInt();		
		int i;
		
		for (i=0;i<=x;i++) {
			if (i % 2 == 1) {
				System.out.println(i);
		 }
	  }
   }
}
