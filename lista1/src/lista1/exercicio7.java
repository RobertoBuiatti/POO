package lista1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = sc.nextLine();
		
		//sc.nextLine();
		
		System.out.println("\nValor por hora: ");
		double ValorHora = sc.nextDouble();
		
		//sc.nextLine();
		
		System.out.println("\nHoras trabalhadas: ");
		double HorasTrabalhadas = sc.nextDouble();
		
		//sc.nextLine();
		double Pagamento = (ValorHora*HorasTrabalhadas);
		System.out.printf("\nO pagamento para %s deve ser: R$ %.2f",nome, Pagamento);
		
		sc.close();
	}

}
