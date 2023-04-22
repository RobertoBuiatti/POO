package lista1;


import java.util.Locale;
import java.util.Scanner;

import classes.AreaTerreno_PreçoTerreno;

public class exercicio1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		AreaTerreno_PreçoTerreno area = new AreaTerreno_PreçoTerreno();
		
	
		
		System.out.println("Entre com a largura do terreno: ");
		area.Largura = sc.nextDouble();
		System.out.println("Entre com o comprimento do terreno: ");
		area.Comprimento = sc.nextDouble();
		System.out.println("Entre com o valor do metro quadrado: ");
		area.ValorMetroQuadrado = sc.nextDouble();
		
		
		
		System.out.printf("A area do terreno: %.2f metros quadrados\n", area.Area());
		
		area.PreçoTerreno();
		System.out.printf("O valor do metro quadrado: R$ %.2f \n", area.PreçoTerreno());
		sc.close();
	}

}
