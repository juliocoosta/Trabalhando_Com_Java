import java.util.Scanner;

public class ExemploSemOrientacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC, yA, yB, yC;
		
		System.out.println("Digite os três valores do triangulo X");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		
		System.out.println("Digite os três valores do triangulo Y");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		double p = (xA + xB + xC) / 2;
		double areaX = Math.sqrt(p * (p - xA )*(p - xB)* (p - xC));
		
		p = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(p * (p - yA )*(p - yB)* (p - yC));
		
		System.out.println("-------------------------------------");
		System.out.printf("Área do triangulo X é: %.4f\n", areaX);
		System.out.printf("Área do triangulo y é: %.4f\n", areaY);
		
		if (areaX > areaY) {
			System.out.println("O maior triangulo é: X");
		}
		else {
			System.out.println("O maior triangulo é: Y");
		}
		
		sc.close();
	}

}
