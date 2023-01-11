package ProgramaPrincipal_AreaDeUmRetangulo;

import java.util.Scanner;

import SubPrograma_AreaDeUmRetangulo.Retangulo;

public class AreaDeUmRetangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Retangulo r = new Retangulo();
		
		
		
		System.out.println("Calculando Área, Perímetro e Diagonal de um retangulo:");
		System.out.print("Informe à Altura: ");
		r.altura = sc.nextDouble();
		System.out.print("Informe a Largura: ");
		r.largura = sc.nextDouble();
		
		System.out.println("--------------------------------");
		System.out.println("A Area do retango é: " + r.Area());
		System.out.println("O Perímetro do retango é: " + r.Perimetro());
		System.out.println("A Diagonal do retango é: " + r.Diagonal());
		
		sc.close();

	}

}
