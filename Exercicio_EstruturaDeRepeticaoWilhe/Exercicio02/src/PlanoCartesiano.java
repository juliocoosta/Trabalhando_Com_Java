import java.util.Scanner;

public class PlanoCartesiano {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite valor do eixo (X) seguindo do valor do exio (Y)");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if (x > 0 && y > 0) {
			System.out.println("Primeiro Quadrante");
		}
		else if (x < 0 && y > 0) {
			System.out.println("Segundo Quadrante");
		}
		else if (x < 0 && y < 0) {
			System.out.println("Terceiro Quadrante");
		}
		else if (x > 0 && y < 0) {
			System.out.println("Quarto Quadrante");
		}
		
		while (x != 0) {
			System.out.println("Digite valor do eixo (X) seguindo do valor do exio (Y)");
			x = sc.nextInt();
			y = sc.nextInt();
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro Quadrante");
			}
			else if (x < 0 && y > 0) {
				System.out.println("Segundo Quadrante");
			}
			else if (x < 0 && y < 0) {
				System.out.println("Terceiro Quadrante");
			}
			else if (x > 0 && y < 0) {
				System.out.println("Quarto Quadrante");
			}
		}
		
	}

}
