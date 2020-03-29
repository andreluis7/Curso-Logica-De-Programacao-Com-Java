import java.util.Scanner;

public class CalculoImc {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o valor do peso: ");
		Double valorPeso = scanner.nextDouble();
		
		System.out.print("Digite o valor da altura: ");
		Double valorAltura = scanner.nextDouble();
		
		Double imc = valorPeso / (valorAltura * valorAltura);
		
		System.out.println("Resultado: " + imc);
		
		scanner.close();
	}

}
