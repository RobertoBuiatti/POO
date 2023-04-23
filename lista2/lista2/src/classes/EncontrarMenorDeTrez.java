package classes;

import java.util.Scanner;

public class EncontrarMenorDeTrez {
	public double A;
	public double B;
	public double C;
	
	Scanner sc = new Scanner(System.in);
	
	public void Print() {
		System.out.println("Primeiro valor: ");
		this.A = sc.nextDouble();
		System.out.println("Segundo valor: ");
		this.B = sc.nextDouble();
		System.out.println("Terceiro valor: ");
		this.C = sc.nextDouble();
		
		if(((this.A) < (this.B))&&((this.A)<(this.C))) {
			System.out.printf("Menor= %.2f",this.A);
		}
		else if(((this.B) < (this.A))&&((this.B)<(this.C))) {
			System.out.printf("Menor= %.2f",this.B);
		}
		else if(((this.C) < (this.A))&&((this.C)<(this.B))) {
			System.out.printf("Menor= %.2f",this.C);
		}
		else if(((this.B) == (this.A))&&((this.B)==(this.C))) {
			System.out.printf("Menor= %.2f",this.B);
		}
		
	}
	

}
