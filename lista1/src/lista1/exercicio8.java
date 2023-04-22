package lista1;

import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//sc.nextLine();
		
		System.out.println("\nDistancia percorrida: ");
		double ValorHora = sc.nextDouble();
		
		//sc.nextLine();
		
		System.out.println("\nCombustível gasto: ");
		double HorasTrabalhadas = sc.nextDouble();
		
		//sc.nextLine();
		double ConsumoMedio = (ValorHora/HorasTrabalhadas);
		System.out.printf("\nO Consumo medio: %.2fKm/L", ConsumoMedio);
		
		sc.close();
		
	}

}
