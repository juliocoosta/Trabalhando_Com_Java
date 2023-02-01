package Metodos_Estaticos_Para_Quarto_Exemplo;

public class Metodos_Estaticos_Programa4 {
	
public static final double PI = 3.14;
	
	public static double circuferencia(double x) {
		return  2 * PI * x;
	}
	public static double volume(double x) {
		return  4 * PI * Math.pow(x, 3)/3;
	}

}
