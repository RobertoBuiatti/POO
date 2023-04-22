package lista1;

import java.util.Locale;
import java.util.Scanner;

import classes.contas;

public class exercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("Digite o valor do raio do círculo: ");
		double raio = sc.nextDouble();
		
		double area = Math.PI*Math.pow(raio, 2);
		System.out.printf("Área = %.2f", area);
		
		//metodo de classe
		
		contas AreaMC = new contas();
		System.out.printf("\nÁrea = %.2f", AreaMC.AreaCirculo(raio));
		
		sc.close();
	}

}
