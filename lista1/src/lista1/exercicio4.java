package lista1;

import java.util.Locale;
import java.util.Scanner;

import classes.contas;

public class exercicio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("escreva o primeiro numero: ");
		double numero1 = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("escreva o primeiro numero: ");
		double numero2 = sc.nextDouble();
		sc.nextLine();
		//so pra dificulta kkkkk
		contas soma = new contas();
		
		System.out.printf("a soma dos dois numeros é: %.2f", soma.Soma(numero1, numero2));
		
		sc.close();
	}

}
