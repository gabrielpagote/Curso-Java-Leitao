package fundamentos;

public class AreaCircunferencia {

	public static void main(String[] args) {
		double raio = 3.4;
		
		//final -> define a variável como uma constante (valor não muda)
		final double pi = 3.14159;
		
		double area = pi * raio * raio;
		
		System.out.println("A area da circunferencia = " +area); 
		
	}
}
