package classes;

import java.util.Scanner;

public class SCNotas {
	Scanner sc = new Scanner(System.in);
	calculos notas = new calculos();
	
	public void print1() {
		System.out.println("Digite a primeiro numero: ");
		notas.nota1 = sc.nextDouble();
		
		System.out.println("Digite a segunda numero: ");
		notas.nota2 = sc.nextDouble();
		
		notas.MediaNotas();
		sc.close();
	}
	
	
	

}
