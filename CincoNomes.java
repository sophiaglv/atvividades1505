package vetor;
import java.util.Scanner;

public class CincoNomes {

	public static void main(String[] args) {
		String nome[] = new String [5];
		Scanner ler = new Scanner(System.in);

		for (int i = 0; i<5; i++) {
			System.out.println("Informe um nome: " + i);
			nome[i] = ler.next();
		}
		for (int i = 0; i<5; i++) {
			System.out.println(nome[i]);
		}
		ler.close();
	}

}
