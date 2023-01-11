
public class Exemplos {

	public static void main(String[] args) {
		
		String nome = "julio cesar ferreira costa";
		
		String n0 = nome.toLowerCase();
		String n1 = nome.toUpperCase();
		String n2 = nome.trim();
		String n3 = nome.substring(2);
		String n4 = nome.substring(2, 9);
		String n5 = nome.replace('a', 's');
		String n6 = nome.replace("abc" , "xy");
		
		int i = nome.indexOf("bc");
		int j = nome.lastIndexOf("bc");
		
		System.out.println("nome: " + nome + "-");
		System.out.println("toLowerCase: "+ n0 + "-");
		System.out.println("toUpperCase: "+ n1 + "-");
		System.out.println("trim: "+ n2 + "-");
		System.out.println("substring(2): "+ n3 + "-");
		System.out.println("substring(2, 9): "+ n4 + "-");
		System.out.println("replace('a', 's'): "+ n5 + "-");
		System.out.println("replace(abc , xy): "+ n6 + "-");
		System.out.println("index Of (bc): "+ i + "-");
		System.out.println("lastIndexOf (bc): "+ j + "-");
		
	}

}
