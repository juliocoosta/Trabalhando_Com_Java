import java.util.Scanner;

import Ferramenta.Triangulo;

public class ExemploComOrientacaoObjeto {

public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Triangulo x, y;
		x = new Triangulo();
		y = new Triangulo();
		
		System.out.println("Digite os três valores do triangulo X");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		
		System.out.println("Digite os três valores do triangulo Y");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		
		double areaX = x.area();
		double areaY = y.area(); 
		
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
