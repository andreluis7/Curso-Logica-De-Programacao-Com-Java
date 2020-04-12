import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Digite a sua nota: ");
		Double notaDoAluno = scanner.nextDouble();
		
		Boolean passouDeAno = notaDoAluno >= 7;
		
		if (passouDeAno) {
			System.out.println("O aluno(a) passou de ano.");
		} else {
			System.out.println("O aluno(a) não passou de ano.");
		}
	}

}