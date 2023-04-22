package lista1;

import java.util.Locale;
import java.util.Scanner;

import classes.calculos_retangulo;

public class exercicio2 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		calculos_retangulo area = new calculos_retangulo();
		
	
		
		System.out.println("Entre com a Base do retangulo: ");
		area.Base = sc.nextDouble();
		System.out.println("Entre com a Altura do retangulo: ");
		area.Altura = sc.nextDouble();
		
		
		System.out.printf("calculos retangulo: \n[Base: " + area.Base + ", Altura: " + area.Altura + "]\n[Area: " + area.Area() + 
				", Perimetro: "	+ area.Perimetro() + ", Diagonal: " + area.Diagonal() + "]");
		
		
		sc.close();
	}

}
