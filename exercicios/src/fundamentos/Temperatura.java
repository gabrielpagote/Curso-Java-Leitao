package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
		// relação fahrenheit p/ celsius = (ºF - 32) x 5/9 = ºC
		
		
		final double operacao = -32;
		//necessario colocar o ".0" para o interpretador entender que se trata de um numero real
		final double fconversao = (5/9.0);
		double fahrenheit = 86;
		double celsius = (fahrenheit + operacao) * fconversao;
		
		System.out.println("A temperatura: " + "ºF 86 em graus celsius é = " + celsius + " ºC");
		
	}
}