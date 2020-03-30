import java.util.Scanner;

public class CalculoQuadrado {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		Double numero = scanner.nextDouble();
		
		Double quadrado = numero * numero;
		
		System.out.println("O quadrado do numero " + numero + " é : " + quadrado);
		
		scanner.close();
	}

}