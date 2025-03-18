package cursoemvideo;

import java.util.Scanner;

public class Escola {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
	    System.out.print("Digite o nome: ");
	    String nome = teclado.nextLine();
	    System.out.print("Digite a nota: ");
	    Float nota = teclado.nextFloat();
	    System.out.println("O nome é " + nome + " sua nota foi " + nota);
	}
}