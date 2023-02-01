package Metodos;

public class Metodos_Utilitario {
	
	public static double x,a,b,c;
	
	public static final double DOLAR = 3.10;
	public static final double IOF = 0.06;
	
	public static double resultado (double x) {
		 a = x * DOLAR;
		 b = IOF * a;
		 c = b + a;
		 return c;
	}
}
