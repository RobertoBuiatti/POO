package lista1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		System.out.println("Dados da primeira pessoa: ");
		System.out.println("Nome:");
		String nome1 = sc.nextLine();
		
		System.out.println("Idade:");
		double idade1 = sc.nextInt();
		
		sc.nextLine();
		System.out.println("Dados da segunda pessoa: ");
		System.out.println("Nome:");
		String nome2 = sc.nextLine();
		
		System.out.println("Idade:");
		double idade2 = sc.nextInt();
		
		double MediaIdade = (idade1+idade2)/2;
		
		System.out.printf("A media de idade entre %s e %s é de: %.1f", nome1 , nome2, MediaIdade);
		
		sc.close();

	}

}
