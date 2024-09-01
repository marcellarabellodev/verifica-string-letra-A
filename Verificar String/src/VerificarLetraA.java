import java.util.Scanner;

public class VerificarLetraA {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
	
		System.out.print("Digite uma string: ");
		String texto = scanner.nextLine();
	
		int contador = 0;
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) == 'a' || texto.charAt(i) == 'A') {
				contador++;
			}
		}
	
		System.out.println("A letra 'a' aparece " + contador + " vezes na string.");
		 
	}

}
