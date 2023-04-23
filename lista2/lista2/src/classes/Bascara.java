package classes;
import java.util.Scanner;

public class Bascara {
	public double A;
	public double B;
	public double C;
	Scanner sc = new Scanner(System.in);
	
	public void Print() {
		
		System.out.println("Coeficiente A: ");
		this.A = sc.nextDouble();
		System.out.println("Coeficiente B: ");
		this.B = sc.nextDouble();
		System.out.println("Coeficiente C: ");
		this.C = sc.nextDouble();
		double resultado1 = BascaraPositivo();
		double resultado2 = BascaraNegativo();
		
		if(Double.isNaN(resultado1) && Double.isNaN(resultado2)){
		    System.out.println("Esta equação não possui raizes reais");
		} else {
		    System.out.printf("X1= %.4f",resultado1);	
		    System.out.printf("\nX1= %.4f",resultado2);
		}
		sc.close();
		
	}
	
	public double BascaraPositivo() {
		double a = Math.pow(this.B, 2)-(4*this.A*this.C);
		double b = Math.sqrt(a);
		double c = (-this.B+b)/(2*this.A);
		return c;
	}
	public double BascaraNegativo() {
		double a = Math.pow(this.B, 2)-(4*this.A*this.C);
		double b = Math.sqrt(a);
		double c = (-this.B-b)/(2*this.A);
		return c;
	}
	
}
