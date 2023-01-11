import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int res = 1;
		for ( int i=1; i<=x; i++) {
			
			res = res * i;
		}
			System.out.println("O resultado do fatorial do número " + x+"! é = " + res +".");
			
	}
		
}


    