import java.util.Scanner;

public class CalculoQuadrado {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		Double numero = scanner.nextDouble();
		
		Double quadrado = numero * numero;
		
		System.out.println("O quadrado do numero " + numero + " � : " + quadrado);
		
		scanner.close();
	}

}