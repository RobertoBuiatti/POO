package lista1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Preço unitário do produto: ");
		double preço = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.printf("\nQuantidade comprada: ");
		double qnt = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.printf("\ndinheiro recebido: ");
		double dinheiro = sc.nextDouble();
		
		sc.nextLine();
		double troco = dinheiro-(preço*qnt);
		System.out.printf("\ntroco: R$ %.2f", troco);
		
		sc.close();
	}

}
