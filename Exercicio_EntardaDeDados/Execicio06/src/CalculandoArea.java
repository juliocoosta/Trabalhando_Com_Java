import java.util.Scanner;

public class CalculandoArea {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double a,b,c;
		double triangulo, circulo, trapezio, quadrado, retangulo;
		
		
		System.out.print("Digite o primerio valor:");
		a = sc.nextDouble();
		System.out.print("Digite o segundo valor:");
		b = sc.nextDouble();
		System.out.print("Digite o terceiro valor:");
		c = sc.nextDouble();
		
		//basta dividir por 2 o resultado da multiplicação da base (b) pela altura (h)//
		triangulo = (a * c) /2; 
		
		//Fórmula da área: area = π . raio2//
		circulo = 3.14159 * Math.pow(c,2);
		
		//Fórmula para calcular a área do trapézio.
		// (( B + b ) * h) /2
		trapezio = ((a + b) * c)/2;
		
		
		//fórmula da área do quadrado A = b²
		quadrado = Math.pow(b,2);
		
		//fórmula do retangulo b*h
		retangulo = a * b;
		
		
		
		
		
		System.out.println("-------------------------");
		System.out.printf("a área do triângulo retângulo que tem A por base e C por altura = %.3f\n", triangulo);
		System.out.printf("a área do círculo de raio C = %.3f\n", circulo);
		System.out.printf("a área do trapézio que tem A e B por bases e C por altura = %.3f\n", trapezio);
		System.out.printf("a área do quadrado que tem lado B = %.3f\n", quadrado);
		System.out.printf("a área do retângulo que tem lados A e B = %.3f\n", retangulo);
		
		
		
		
	}

}
